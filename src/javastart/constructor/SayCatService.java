package javastart.constructor;

public class SayCatService {

    private String concatNameAndMessage(String name, String message){

        return name + ": " + message;
    }
    public void say(Cat cat, String message){
        String catName = cat.getName();
        System.out.println(concatNameAndMessage(catName, message));
    }
}
