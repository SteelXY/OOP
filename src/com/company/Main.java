package com.company;

import java.util.Scanner;

public class Main {
    static String myObject1 = "object 1";
    String myObject2 = "object 2";

    public static void main(String[] args) {
        System.out.println("Початок роботи");
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть ім'я (name): ");
        String name = in.nextLine();
        System.out.println("Введіть назву бази (base): ");
        String base = in.nextLine();
        System.out.println("Введіть lvl: ");
        int lvl = in.nextInt();
        System.out.println("Введіть health: ");
        int health = in.nextInt();
        Soldier soldier1 = new Soldier(name, base, lvl, health);
        Soldier soldier2 = new Soldier();
        Soldier soldier3 = new Soldier();

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("1 - вивести на екран Об'єкт 1");
            System.out.println("2 - змінити параметри Об'єкта 1");
            System.out.println("3 - вивести на екран Об'єкт 2");
            System.out.println("4 - змінити параметри Об'єкта 2");
            System.out.println("5 - вивести на екран Об'єкт 3");
            System.out.println("6 - змінити параметри Об'єкта 3");
            System.out.println("7 - завершення програми");
            int option = in.nextInt();

            switch (option) {
                case (1):
                    soldier1.print();
                    break;
                case (2):
                    Scanner in1 = new Scanner(System.in);
                    System.out.print("Введіть нове ім'я об'єкту: ");
                    soldier1.setName(in1.nextLine());
                    System.out.print("Введіть нову базу об'єкту: ");
                    soldier1.setBase(in1.nextLine());
                    System.out.print("Введіть lvl об'єкту: ");
                    soldier1.setLvl(in1.nextInt());
                    System.out.print("Введіть health об'єкту: ");
                    soldier1.setHealth(in1.nextInt());
                    break;
                case (3):
                    soldier2.print();
                    break;
                case (4):
                    Scanner in2 = new Scanner(System.in);
                    System.out.print("Введіть нове ім'я об'єкту: ");
                    soldier2.setName(in2.nextLine());
                    System.out.print("Введіть нову базу об'єкту: ");
                    soldier2.setBase(in2.nextLine());
                    System.out.print("Введіть lvl об'єкту: ");
                    soldier2.setLvl(in2.nextInt());
                    System.out.print("Введіть health об'єкту: ");
                    soldier2.setHealth(in2.nextInt());
                    break;
                case (5):
                    soldier3.print();
                    break;
                case (6):
                    Scanner in3 = new Scanner(System.in);
                    System.out.print("Введіть нове ім'я об'єкту: ");
                    soldier3.setName(in3.nextLine());
                    System.out.print("Введіть нову базу об'єкту: ");
                    soldier3.setBase(in3.nextLine());
                    System.out.print("Введіть lvl об'єкту: ");
                    soldier3.setLvl(in3.nextInt());
                    System.out.print("Введіть health об'єкту: ");
                    soldier3.setHealth(in3.nextInt());
                    break;
                case (7):
                    isRunning = false;
                    System.out.println("Кінець роботи");
                    break;
            }
        }
    }
}
