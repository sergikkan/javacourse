package javastart.inheritants;

public class Scotish extends Cat{

    private  String name;

    public Scotish(int age, String owner, String name) {
        super(age, owner);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat name" +name+" Age" + getAge() +" Owner: " +getOwner();
    }
}
