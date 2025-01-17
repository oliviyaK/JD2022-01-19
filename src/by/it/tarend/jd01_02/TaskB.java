package by.it.tarend.jd01_02;

import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        step1();
        step2(month);
        step3(a, b, c);
    }
    static void step1() {

        for (int index = 1; index <= 25; index++) {

            if ((index) % 5 == 0) {
                System.out.println(index);
            } else {
                System.out.print((index) + " ");
            }
        }
    }
    static void step2(int month) {
        switch (month) {
            case 1: {
                System.out.println("январь");
                break;
            }
            case 2: {
                System.out.println("февраль");
                break;
            }
            case 3: {
                System.out.println("март");
                break;
            }
            case 4: {
                System.out.println("апрель");
                break;
            }
            case 5: {
                System.out.println("май");
                break;
            }
            case 6: {
                System.out.println("июнь");
                break;
            }
            case 7: {
                System.out.println("июль");
                break;
            }
            case 8: {
                System.out.println("август");
                break;
            }
            case 9: {
                System.out.println("сентябрь");
                break;
            }
            case 10: {
                System.out.println("октябрь");
                break;
            }
            case 11: {
                System.out.println("ноябрь");
                break;
            }
            case 12: {
                System.out.println("декабрь");
                break;
            }
            default: {
                System.out.println("нет такого месяца");
            }

        }
    }
    static void step3(double a, double b, double c) {

        double discriminant =  b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (- b + Math.sqrt(discriminant)) / ( 2 * a);
            double x2 = (- b - Math.sqrt(discriminant)) / ( 2 * a);
            System.out.println(x1 + " " + x2);
        } else if (discriminant == 0) {
            double x = - (b / (2 * a));
            System.out.println(x);
        } else {
            System.out.println("корней нет");
        }
    }
}
