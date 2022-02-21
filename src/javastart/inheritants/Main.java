package javastart.inheritants;

import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        British brit = new British(43, "Alex", "Lori");
        Scotish scot = new Scotish(23, "Andre", "Baxter");

        brit.sayMeow();
        scot.sayMeow();

        System.out.println("Cat name: " + brit.getName() +" Age: "+ brit.getAge() +" Owner: "+ brit.getOwner());
        System.out.println("Cat name: " + scot.getName() +" Age: "+ scot.getAge() +" Owner: "+ scot.getOwner());

        System.out.println(brit.toString());
        System.out.println(scot.toString());

        British martin = new British(3, "Alex", "Martin");
        British anothermartin = new British(3, "Alex", "Martin");
        System.out.println(martin.equals(anothermartin));
    }
}
