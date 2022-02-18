package javastart;

import java.util.Scanner;

public class Massives {

    /** Объявление массива:
     * 1. Тип [] = new тип[кол-во эл-тов]. Пример int[] mass = new int [10]
     * 2. Тип [] = new тип[] { эл-ты массива через запятую}  Пример int[] mass= new int[]{1, 3, 5, 6}
     *
     * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] mass = new int[5];
        for (int i=0; i<5; i++){
            mass[i] = input.nextInt();
        }
        printMass(mass);
        printMass2(mass);

    }

    public static  void printMass(int[] mass){
        for (int i=0; i< mass.length; i++){
            System.out.println("Значение индекса: "+i+" Значение элемента: " + mass[i]);
        }
    }

    public static  void printMass2(int[] mass){
       for (int el: mass){
           System.out.println("Элемент: "+ el);
       }
    }
}
