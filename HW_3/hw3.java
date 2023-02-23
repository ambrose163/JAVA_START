package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class hw3 {
    public static void main(String[] args) {

        // 1. Создать новый список, добавить несколько строк с названиями цветов и вывести коллекцию на экран.

        List<String> colors = new ArrayList<String>();

        colors.add("White");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Purple");

        System.out.println("#1: " + colors);

        // 2. Итерация всех элементов списка цветов и добавления к каждому символа "!".

        for (int i = 0; i < colors.size(); i++) {
            colors.set(i, colors.get(i) + "!");
        }
        System.out.println("#2: " + colors);

        // 3. Вставить элемент в список в первой позиции.

        colors.add(0, "Black");
        System.out.println("#3: " + colors);

        // 4. Извлечь элемент (по указанному индексу) из заданного списка. (Задал элемент с индексом 3)

        System.out.println("#4: " + colors.get(3));

        // 5. Обновить определенный элемент списка по заданному индексу (3).

        colors.set(3, "Pink");
        System.out.println("#5: " + colors);

        // 6. Удалить третий элемент из списка.

        colors.remove(3);
        System.out.println("#6: " + colors);

        // 7. Поиска элемента в списке по строке (White!).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи название цвета по английски: ");
        String findColor = new String(scanner.nextLine());

        List<String> resElem = colors.stream()
                .filter(color -> color.contains(findColor))
                .collect(Collectors.toList());
        if (resElem.size() > 0) {
            System.out.println("#7: " + "Element: " + resElem);
        } else System.out.println("#7: " + "Такого элемента нет");

        // 8. Создать новый список и добавить в него несколько елементов первого списка.

        List<String> newList = new ArrayList<>();
        newList.add("Black");
        newList.add("Purple!");
        newList.add("Grey");
        System.out.println("#8: " + newList);

        // 9. Удалить из первого списка все элементы отсутствующие во втором списке.

        colors.removeAll(newList);
        System.out.println("#9: " + colors);

        // 10. *Сортировка списка.

        Collections.sort(colors);
        System.out.println("#10: " + colors);

        // 11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
        int qtyRepeat = 10000;
        timer(qtyRepeat);

    }

    public static void timer(int qtyRepeat) {

        List<String> flowers1 = new ArrayList<>();
        flowers1.add("Aster");
        flowers1.add("Gerber");
        flowers1.add("Peony");

        long startTimer = System.currentTimeMillis();
        for (int i = 0; i <= qtyRepeat; i++) {
            flowers1.add(0, "Rose");
        }
        long stopTimer = System.currentTimeMillis();
        long time1 = stopTimer - startTimer;
        System.out.println("Время работы ArrayList: " + time1);


        List<String> flowers2 = new LinkedList<>();
        flowers2.add("Aster");
        flowers2.add("Gerber");
        flowers2.add("Peony");

        long startTimer2 = System.currentTimeMillis();
        for (int i = 0; i <= qtyRepeat; i++) {
            flowers1.add(0, "Rose");
        }
        long stopTimer2 = System.currentTimeMillis();
        long time2 = stopTimer2 - startTimer2;
        System.out.println("Время работы LinkedList: " + time2);

    }

}