/**
 * Created by Şeyma Yılmaz on 29.5.2017.
 */
public class Person {

    private String name;
    private int age;

    public Person(){
        System.out.println("Person() constructor cagirildi");
    }

    public Person(String name, int age) {
        System.out.println("Person(name, age) constructor cagirildi");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
