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
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
        //Задача 4
        System.out.println("\nЗадача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //Задача 5
        System.out.println("\nЗадача 5");
        int yearRestDivFour = 0;
        int yearRestDivOneHundred = 0;
        int yearRestDivFourHundred = 0;
        boolean divFour = false;
        boolean divOneHundred = false;
        boolean divFourHundred = false;
        int firstYear = 1904;
        int lastYear = 2096;
        for (int i = firstYear; i <= lastYear; i++) {
            yearRestDivFour = i % 4;
            yearRestDivOneHundred = i % 100;
            yearRestDivFourHundred = i % 400;
            divFour = yearRestDivFour == 0;
            divOneHundred = yearRestDivOneHundred == 0;
            divFourHundred = yearRestDivFourHundred == 0;
            if (i >= 1584) {
                if (divFourHundred) {
                    System.out.printf("%s год является високосным\n", i);
                } else if (divFour && !divOneHundred) {
                    System.out.printf("%s год является високосным\n", i);
                }
            }
        }
        //Задача 6
        System.out.println("\nЗадача 6");
        for (int i = 7; i <= 98; i += 7) {
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
            depositInBank += depositInBank / 100;
            depositInBank += savingForGrow;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей\n", i, depositInBank);
        }
        //Задача 10
        System.out.println("\n\nЗадача 10");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("2*%s=%s\n", i, i*2);
        }
    }
}