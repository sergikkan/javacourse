package javastart.inheritants;

import java.util.Objects;

public class British extends Cat{
    private String name;

    public British(int age, String owner, String name) {
        super(age, owner);
        this.name= name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat name " +name+" Age " + getAge() +" Owner: " +getOwner();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (getClass()==o.getClass()){
            British outsideObject= (British) o;
            return name.equals(outsideObject.name)
                    && getAge() == outsideObject.getAge()
                    && getOwner().equals(outsideObject.getOwner());
        }
        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
