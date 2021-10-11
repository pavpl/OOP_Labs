package Task1;

public class Lecturrer extends Person {
    public Lecturrer(String surname, String name, int age) {
        super(surname, name, age);
    }

    public String getNameKaffedra() {
        return nameKaffedra;
    }

    public void setNameKaffedra(String nameKaffedra) {
        this.nameKaffedra = nameKaffedra;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private String nameKaffedra;
    private double salary;
    public String printInfo()
    {
        return "Преподаватель " + super.getSurname() + " " + super.getName() + ", возраст: " + super.getAge() + "\nЗарплата: " + this.salary;
    }
}
