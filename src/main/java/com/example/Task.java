package com.example;

import java.util.Scanner;

public class Task {
    public static void main(String[] args)  {
        System.out.println("Выберите что переводить: 1 - масса, 2 - растояние");
        Scanner x = new Scanner(System.in);
        int x1 = x.nextInt();

        System.out.println("Выберите единицу измерения: ");
        Scanner y = new Scanner(System.in);
        if(x1==1) {
            System.out.println("1 - килограмм, 2 - грамм, 3 - тонна, 4 - центнер ");
            int y1 = y.nextInt();
            System.out.println("Введите число");
            double z=y.nextDouble();
            switch (y1) {
                case 1:
                    System.out.println("Результат:" +
                    "\nкиллограммы: " + z +
                    "\nграммы: " + z*1000+
                    "\nтонны: " + z/1000+
                    "\nцентнер: " + z/100);
                break;
                case 2:
                    System.out.println("Результат:" +
                            "\nкиллограммы: " + z*0.001 +
                            "\nграммы: " + z+
                            "\nтонны: " + 0.000001*z+
                            "\nцентнер: " + 0.00001*z);
                    break;
                case 3:
                    System.out.println("Результат:" +
                            "\nкиллограммы: " + z*1000 +
                            "\nграммы: " + z*1000000+
                            "\nтонны: " + z +
                            "\nцентнер: " + z*10);
                    break;
                case 4:
                    System.out.println("Результат:" +
                            "\nкиллограммы: " + z*100 +
                            "\nграммы: " + z*100000+
                            "\nтонны: " + z*0.1 +
                            "\nцентнер: " + z);
                    break;


            }
        }
        else {
            System.out.println("1 - метр, 2 - миля, 3 - ярд, 4 - фут ");
            int y1 = y.nextInt();
            System.out.println("Введите число");
            double z=y.nextDouble();
            switch (y1) {
                case 1:
                    System.out.println("Результат:" +
                            "\nметр: " + z +
                            "\nмиля: " + z*0.00062+
                            "\nярд: " + z*1.09+
                            "\nфут: " + z*3.28);
                    break;
                case 2:
                    System.out.println("Результат:" +
                            "\nметр: " + z*1609.34 +
                            "\nмиля: " + z +
                            "\nярд: " + z*1760+
                            "\nфут: " + z*5280);
                    break;
                case 3:
                    System.out.println("Результат:" +
                            "\nметр: " + z*0.91 +
                            "\nмиля: " + z*0.00057+
                            "\nярд: " + z+
                            "\nфут: " + z*3);
                    break;
                case 4:
                    System.out.println("Результат:" +
                            "\nметр: " + z*0.3 +
                            "\nмиля: " + z*0.00019+
                            "\nярд: " + z*0.33+
                            "\nфут: " + z);
                    break;
            }
        }

    }

}
