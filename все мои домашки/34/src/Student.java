public class Student {
    String name;
    int group;
    int age;

    public Student(String name, int grade, int age) {
        this.name = name;
        this.group = grade;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + group + " " + age;
    }
}