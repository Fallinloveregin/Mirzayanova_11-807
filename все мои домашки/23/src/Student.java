import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getGroup() {
        return grade;
    }

    private String surname;
    private int age;
    private double grade;

    public Student(String name, String twoname, int age, double grade, Comparator comparator) {
        this.name = name;
        this.surname = twoname;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) return false;
        Student stud = (Student) obj;
        return name.equals(stud.name) && surname.equals(stud.surname) && age == stud.age && grade == stud.grade;
    }

    @Override
    public int compareTo(Student o) {
        return surname.compareTo(o.surname);
    }
}