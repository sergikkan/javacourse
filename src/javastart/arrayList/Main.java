package javastart.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {


        CustomLinkedList<String> list = new CustomLinkedList<>();

        list.add("432432423432");
        list.add("ABC");
        list.add("DEF");
        list.add("GHI");
        list.add("sfsdfsdfsdf");
        System.out.println(list.size());
        System.out.println(list.first());
        System.out.println(list.last());
        list.addFirst("34455435");
        System.out.println("\n");
        System.out.println(list.size());
        System.out.println(list.first());
        System.out.println(list.last());
        list.delete(2);
        System.out.println("\n");
        System.out.println(list.size());
        System.out.println(list.first());
        System.out.println(list.last());
        System.out.println("\n");
        for (String element:list){
            System.out.println(element);
        }
    }
}
