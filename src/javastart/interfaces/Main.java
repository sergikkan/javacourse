package javastart.interfaces;

public class Main {
    public static void main(String[] args) {
        Animal lori = new Cat();
        Animal bublik = new Dog();

        lori.say();
        bublik.say();

    findOwner(lori);
    findOwner(bublik);

        System.out.println("Lori: "+((Cat) lori).getOwner()+" Bublik: "+((Dog) bublik).getOwner());

    }

    private static void findOwner(Animal animal){
        if (animal.getAnimalType().equals("Cat")){
            Cat someCat =(Cat) animal;
            someCat.setOwner("Cat_owner");
        }
        if (animal.getAnimalType().equals("dog")){
            Dog someDog = (Dog) animal;
            someDog.setOwner("Dog_owner");
        }
    }
}
