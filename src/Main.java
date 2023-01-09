public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("task1:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println();
        System.out.println("task2:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("task3:");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println();
        System.out.println("task4:");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println();
        System.out.println("task5:");
        for (int i = 1904; i <= 2096; i = i + 4) {
            if (i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является високосным");
            }
        }
    }

    public static void task6() {
        System.out.println();
        System.out.println("task6:");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println();
        System.out.println("task7:");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println();
        System.out.println("task8:");
        int monthlyFee = 29000;
        int depositAmount = 0;
        for (int i = 0; i < 12; i++) {
            depositAmount = depositAmount + monthlyFee;
            System.out.println("Месяц " + (i + 1) + ", сумма накоплений равна " + depositAmount + " рублей");
        }
    }

    public static void task9() {
        System.out.println();
        System.out.println("task9:");
        double monthlyFee = 29000;
        double depositAmount = 0;
        for (int i = 0; i < 12; i++) {
            depositAmount = Math.floor(depositAmount * 1.01);
            depositAmount = depositAmount + monthlyFee;
            System.out.println("Месяц " + (i + 1) + ", сумма накоплений равна " + String.format("%.0f", depositAmount) + " рублей");
        }
    }

    public static void task10() {
        System.out.println();
        System.out.println("task10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }
}