    package lr12;

    import java.time.LocalTime;

    public class lr12 {

        // Пример 1: два потока выводят своё имя и текущее время (10 итераций)
        public static void example1() throws InterruptedException {
            System.out.println("=== Пример 1: два потока с именем и временем ===");

            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            Thread t2 = new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println("Пример 1 завершён.\n");
        }

        // Пример 2: поток выводит числа от 1 до 10 с задержкой 1 секунда
        public static void example2() throws InterruptedException {
            System.out.println("=== Пример 2: числа от 1 до 10 с задержкой ===");

            Thread t = new Thread(() -> {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            t.start();
            t.join();
            System.out.println("Пример 2 завершён.\n");
        }

        // Пример 3: два потока – чётные и нечётные числа с wait/notifyAll
        public static void example3() {
            System.out.println("=== Пример 3: чёт / нечёт с синхронизацией ===");

            final Object lock = new Object();
            final int[] number = {1};  // общее изменяемое состояние

            Thread evenThread = new Thread(() -> {
                synchronized (lock) {
                    while (number[0] < 10) {
                        if (number[0] % 2 == 0) {
                            System.out.println(Thread.currentThread().getName() + ": " + number[0]);
                            number[0]++;
                        } else {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        lock.notifyAll();
                    }
                }
            }, "Even Thread");

            Thread oddThread = new Thread(() -> {
                synchronized (lock) {
                    while (number[0] < 10) {
                        if (number[0] % 2 != 0) {
                            System.out.println(Thread.currentThread().getName() + ": " + number[0]);
                            number[0]++;
                        } else {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        lock.notifyAll();
                    }
                }
            }, "Odd Thread");

            evenThread.start();
            oddThread.start();

            try {
                evenThread.join();
                oddThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Пример 3 завершён.\n");
        }

        // Задание №2 (совпадает с примером 2)
        public static void independentTask() throws InterruptedException {
            System.out.println("=== Вариант №2: числа от 1 до 10 ===");

            Thread t = new Thread(() -> {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            t.start();
            t.join();
            System.out.println("Задание №2 завершено.\n");
        }

        // Демонстрация всех задач
        public static void main(String[] args) throws InterruptedException {
            example1();
            example2();
            example3();
            independentTask();   // задание для самостоятельной работы
        }
    }