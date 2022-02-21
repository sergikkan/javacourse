package javastart.interfaces;

public class Dog implements Animal {
    private String name;
    private String age;
    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public void say() {
        System.out.println("Woof");
    }

    @Override
    public String getAnimalType() {
        return "dog";
    }
}
