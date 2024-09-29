package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(120);
        list.add("Jay");
        list.add(12.34f);
        list.add(true);
        list.add(12);
        list.add(120.34);

        System.out.println("Printing the list by for loop");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Printing the list by for each loop");

        for (Object obj: list) {
            System.out.println(obj);
        }

        list.remove("Jay");

        System.out.println("Printing the list using iterator class");

        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
