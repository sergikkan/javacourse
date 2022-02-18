package javastart;

import java.util.Random;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner inputFromComandLine = new Scanner(System.in);
        int n = inputFromComandLine.nextInt();

        int[] mass = new int[n];
        Random random = new Random();
        for (int i=0; i<mass.length; i++){
             mass[i]= random.nextInt(5);
        }
        int num = inputFromComandLine.nextInt();

        for (int el:mass){
            if (el==num){
                System.out.println("Число совпало");
            }
            else {
                System.out.println("Число не совпало");
            }
        }

        int max = mass[0];
        for (int el:mass){
            if (el>max){
                max=el;
            }
        }
        System.out.println(max);

    }
}
