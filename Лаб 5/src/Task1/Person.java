package Task1;

public class Person {
    private String surname;
    private  String name;
    private int age;

    public Person(String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
        if (age == 0 || age < 0)
        {
            this.age = 1;
            return;
        }
        this.age = age;
    }

 public String printInfo()
 {
     return "Человек " + this.name + " " + this.surname + ", возраст: " + this.age;
 }

}
