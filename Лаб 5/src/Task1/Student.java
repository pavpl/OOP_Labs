package Task1;

public class Student extends Person {


    public Student(String surname, String name, int age) {
        super(surname, name, age);
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getNumberStudentBook() {
        return numberStudentBook;
    }

    public void setNumberStudentBook(int numberStudentBook) {
        this.numberStudentBook = numberStudentBook;
    }

    private int group;
    private int numberStudentBook;
    public String printInfo()
    {
        return "Студент группы " + this.group + " " + super.getSurname() + " " + super.getName() +", возраст: " + super.getAge() +
                "\nНомер студенческого билета: " + this.numberStudentBook;
    }

}
