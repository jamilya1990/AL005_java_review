import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        //Create a Set

        Set<Student> studentSet = new HashSet<>();

        //add elements
        studentSet.add(new Student(7, "Isabel"));
        studentSet.add(new Student(8, "Ahmet"));
        studentSet.add(new Student(9, "Robert"));
        //to prevent set from adding same object of the Student equals() and hashCode() needs to be implemented in Student class.
        studentSet.add(new Student(9, "Robert"));

        System.out.println(studentSet);

        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        numSet.add(3);
        System.out.println(numSet.add(3));

        System.out.println(numSet);
    }
}
