package Task1;

public class Main {
    public static void main(String[] args) {
        Person [] people = new Person[3];
        Person vasya = new Person("Петрухин","Вася", 32);
        Lecturrer teacher = new Lecturrer("Миклюк", "Иван", 44);
        teacher.setSalary(430);
        Student kolya = new Student("Студентских", "Николай", 20);
        kolya.setGroup(413);
        kolya.setNumberStudentBook(5542312);
        people[0] = vasya;
        people[1] = teacher;
        people[2]=kolya;
        for (int i = 0; i < people.length; i++) {

            System.out.println(people[i].printInfo());

        }
    }

}
