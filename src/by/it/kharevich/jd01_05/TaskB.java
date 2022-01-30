package by.it.kharevich.jd01_05;

import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {

        part1();
        part2();

    }

    private static void part1() {
        double y;
        for (double a = 0; a <= 2; a = a + 0.2) {
            double sum = 0;
            for (double x = 1; x <= 6; x++) {
                double s = pow(7, a) - cos(x);
                sum = sum + s;
            }
            y = sum;
            System.out.printf("При a = %-4.1f      " + "Сумма у = %-16.12f%n", a, y);
        }
        System.out.println();
    }

    private static void part2() {
        double a = 0;
        double b;
        double x;
        String no = new String();


        for (x = -6 + 0.5; x < 2; x = x + 0.5) {
            if (-2 < x / 2 && x / 2 <= -1) {
                b = sin(x*x);
                a = log(b + 2.74);
            } else if (-1 < x / 2 && x / 2 < 0.2) {
                b = cos(x*x);
                a = log(b + 2.74);
            } else if (x / 2 == 0.2) {
                b = 1/tan(x*x);
                a = log(b + 2.74);
            } else {
                b=0;
                a=0;
                no = "Вычисления невозможны";
            }

            if (a!=0){
                System.out.printf("При x/2=%6.2f    a = %14.10e", x / 2, a, no);
                System.out.println();
            } else{
                System.out.printf("При x/2=%6.2f    %23s", x / 2, no);
                System.out.println();
            }

        }
    }
}