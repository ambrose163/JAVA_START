package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

// 1. Ввод с консоли в формате Ф.И.О Возраст пол
// 2. Выход из режима ввода по горячей кнопке
// 3. Вывод несортированного списка в формате Иванов И.И. 99 М
// 4. Два варианта продолжения, либо вывод списка сортированного по возрасту либо завершение приложения.

public class Sem4 {
    public static void main(String[] args) {
        List<String> fio = new ArrayList<String>();
        List<Integer> age = new ArrayList<>();
        List<String> gender = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String[] line = scanner.nextLine().split(" ");
            if (line[0].equals("stop")) break;
            fio.add(String.format("%1$s %2$s.%3$s.", line[0], line[1].charAt(0), line[2].charAt(0)));
            age.add(Integer.parseInt(line[3]));
            gender.add(line[4]);
        }

        LinkedList<Integer> linkId = new LinkedList<Integer>();
        int count = 0;
        for (String f : fio) {
            System.out.println(f + " " + age.get(count) + " " + gender.get(count));
            linkId.add(count);
            count++;
        }
        int cnt = linkId.size() - 1;
        while (cnt > -1) {
            int maxAge = age.get(linkId.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++) {
                if (maxAge < age.get(linkId.get(i))) {
                    maxAge = age.get(linkId.get(i));
                    index = i;
                }
            }

            int tmp = linkId.get(cnt);
            linkId.set(cnt, linkId.get(index));
            linkId.set(index, tmp);
            cnt--;
        }
//        System.out.println(linkId);
        System.out.println("*-*-*-*-*-*-*-*-*");
        linkId.forEach(n -> System.out.println(String.format("%1$s %2$s %3$s", fio.get(n), age.get(n), gender.get(n))));

    }
}