package btvn5_5;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info () {
        System.out.println("ten: "+name);
        System.out.println("tuoi: "+age);
    }
}
