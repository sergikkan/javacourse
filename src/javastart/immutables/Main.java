package javastart.immutables;

public class Main {

    public static void main(String[] args) {
        String a ="ABC";
        String b =a.concat("DEF");
        System.out.println(a);
        System.out.println(b);

        StringBuilder stringBuilder = new StringBuilder("ABC");
        stringBuilder.append("DEF").append("GHI").append("JKL");
        System.out.println(stringBuilder);
    }
}
