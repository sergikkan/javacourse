package javastart.constructor;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Lori");
        Cat cat2 = new Cat("Boby");
        Cat cat3 = new Cat("Max");
        SayCatService sayCatService = new SayCatService();
        sayCatService.say(cat1, "How are you?");
        sayCatService.say(cat2, "Good,and you?");
        sayCatService.say(cat3, "Wery well");

    }
}
