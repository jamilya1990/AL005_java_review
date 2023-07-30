import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Jose"));
        students.add(new Student(2, "Sayed"));
        students.add(new Student(3, "Nick"));
        students.add(new Student(4, "Ronnie"));

        System.out.println(students);

        //Iterations with ArrayList
        //1. For loop with get(index)

        for (int i = 0; i < students.size(); i++) {
            System.out.println("students = " + students.get(i));
        }

        //2.Iterator
        System.out.println("...Printing with Iterator...");

        Iterator iterator = students.listIterator();
        //Forward iteration
        System.out.println("...Printing Forward with Iterator...");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Backward iteration
        System.out.println("...Printing Backwards with Iterator...");

        while (((ListIterator<?>) iterator).hasPrevious()) {
            System.out.println(((ListIterator<?>) iterator).previous());
        }

        // 3. for each loop
        System.out.println("...Printing with forEach loop...");

        for (Student student : students) System.out.println(student);

        //Lambda
        System.out.println("...Printing with Lambda...");

        students.forEach(System.out::println);

        //Sorting elements in List
        System.out.println("...Sorting elements in List with Comparator...");

        Collections.sort(students, new SortByIdDesc());
        System.out.println(students);
        Collections.sort(students, new SortByNameDesc());

        System.out.println(students);
    }

    static class SortByIdDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.index - o1.index;
        }
    }

    static class SortByNameDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}
