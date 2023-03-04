package org.example;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Sem5 {
    public static void main(String[] args) {
//        HashMap<Integer, String> hashMap = new HashMap<>();
//
//        hashMap.put(0, "Z");
//        hashMap.putIfAbsent(1, "Z");
//        hashMap.remove(1);
//        hashMap.put(0, "1");
//        hashMap.put(1, "0");
//        hashMap.put(2, "T");
//        hashMap.put(3, "T");
//        hashMap.put(4, "F");
//
//        hashMap.get(0);
//        hashMap.getOrDefault(4, "def"); // Если такого ключа нет, то вернет значение по умолчанию "def"
//
////        for (String s: hashMap.values()) { // Только значения
////            System.out.println(s);
////        }
////
////        for (Integer s: hashMap.keySet()) {
////            System.out.println(s);
////        }
//
////        for (Integer s: hashMap.keySet()) {  // Показывает все значения по ключу
////            System.out.println(hashMap.get(s));
////        }
////
////        for (int i = 0; i < hashMap.keySet().size(); i++) { // Выбираем ключи
////            System.out.println(hashMap.get(hashMap.keySet().toArray()[i]));
////        }
//
//        hashMap.values(); // Возвращает коллекцию
//        hashMap.compute(3, (k, v) -> v += "!");
//        hashMap.computeIfAbsent(5, v -> "F!");
//        hashMap.computeIfPresent(5, (k, v) -> v += "!");
//        hashMap.merge(4, "?", String::concat);
//        hashMap.forEach((k, v) -> System.out.println(k +" "+ v));
//
//
//
//        LinkedHashMap<String, String> LinkedHashMap = new LinkedHashMap<>(); // В каком порядке ввели ключ-значение, в таком он и выведет
//
//        TreeMap<String, String> treeMap = new TreeMap<>();
//        treeMap.put("fb1", "0");
//        treeMap.put(",u,2", "T");
//        treeMap.put("sfdw3", "T");
//        treeMap.put("pdc4", "F");
//
//        treeMap.tailMap("oi2", true);
//        treeMap.headMap("oi2, false");

        //Создать хешМап строка число с 10 значениями и 2 способами выводим на экран

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("null", "один");
        hashMap.put("first", "два");
        hashMap.put("second", "три");
        hashMap.put("third", "четыре");
        hashMap.put("fourth", "пять");
        hashMap.put("fifth", "шесть");
        hashMap.put("sixth", "семь");
        hashMap.put("seventh", "восемь");
        hashMap.put("eight", "девять");
        hashMap.put("night", "десять");

        hashMap.forEach((k, v) -> System.out.println(v));
        System.out.println("*******");


        for (String s: hashMap.values()) {
            System.out.println(s);
        }

        // Изменить значения хешМапа чтобы значения были в <>
        for(String key: hashMap.keySet()) {
            hashMap.compute(key, (k, v) -> "<" + v + ">");
        }
        System.out.println(hashMap);


        hashMap.merge("4", "?", (nV, tV) -> "<" + nV + tV + ">");

        // Создать еще один хешМап и объединить значения с одинаковыми ключами

        HashMap<String, String> hashMapTwo = new HashMap<>();
        hashMapTwo.put("null", "One");
        hashMapTwo.put("tbtb", "Two");
        hashMapTwo.put("second", "Three");
        hashMapTwo.put("third", "Four");
        hashMapTwo.put("fourth", "Five");
        hashMapTwo.put("bdbdbd", "Six");
        hashMapTwo.put("sixth", "Seven");
        hashMapTwo.put("seventh", "Eight");
        hashMapTwo.put("eight", "Nine");
        hashMapTwo.put("night", "Ten");

        for(String key: hashMapTwo.keySet()) {
            hashMap.merge(key, hashMap.getOrDefault(key, "default"), String::concat);
            System.out.println(hashMap.get(key));
        }
        System.out.println(hashMap);

    }

}