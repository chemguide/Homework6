public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Задача 2
        System.out.println("\nЗадача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //Задача 3
        System.out.println("\nЗадача 3");
        for (int i = 2; i < 17; i+=2) {
            System.out.println(i);
        }
        //Задача 4
        System.out.println("\nЗадача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //Задача 5
        System.out.println("\nЗадача 5");
        for (int i = 1904; i <= 2096; i+= 4) {
            System.out.printf("%s год является високосным\n", i);
        }
        //Задача 6
        System.out.println("\nЗадача 6");
        for (int i = 7; i <= 98; i+= 7) {
            System.out.printf("%s ", i);
        }
        //Задача 7
        System.out.println("\n\nЗадача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.printf("%s ", i);
        }
        //Задача 8
        System.out.println("\n\nЗадача 8");
        int saving = 29000;
        int deposit = 0;
        for (int i = 1; i <= 12; i++) {
            deposit += saving;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей\n", i, deposit);
        }
        //Задача 9
        System.out.println("\n\nЗадача 9");
        int savingForGrow = 29000;
        int depositInBank = 0;
        for (int i = 1; i <= 12; i++) {
            depositInBank += savingForGrow;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей\n", i, depositInBank);
            depositInBank += depositInBank / 100;
        }
        //Задача 10
        System.out.println("\n\nЗадача 10");
        int base = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("2*%s=%s\n", i, base);
            base += 2;
        }
    }
}