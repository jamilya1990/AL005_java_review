import java.util.Objects;

public class Student {
    int index;
    String name;

    public Student(int index, String name){
        this.index = index;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "index=" + index +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return index == student.index && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, name);
    }
}
