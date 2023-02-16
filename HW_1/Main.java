package org.example;

import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Random rand = new Random();
        int m1[] = new int[Short.MAX_VALUE / 2];
        int m2[] = new int[Math.abs(Short.MIN_VALUE) / 2];
        int arrayPosition1 = 0;
        int arrayPosition2 = 0;

        // Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = rand.nextInt(2001);
        System.out.println(i);

        // Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = i;
        int res = 0;
        while (n != 1) {
            n >>= 1;
            res++;
        }
        System.out.println("n = " + res);


        // Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        for (int j = i; j <= Short.MAX_VALUE; j++) {
            if (j % i == 0) {
                m1[arrayPosition1] = j;
                arrayPosition1 ++;
            }
        }

        // Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        for (int j = i; j <= Short.MIN_VALUE; j++) {
            if (j % i != 0) {
                m2[arrayPosition2] = j;
                arrayPosition2 ++;
            }
        }
    }
}