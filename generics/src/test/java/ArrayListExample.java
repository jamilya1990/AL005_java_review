import java.util.ArrayList;
import java.util.Objects;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        //items.add("apple");

        printDouble(items);
    }

//    private static void printDouble(ArrayList items) {
//        for (Object i: items){
//            System.out.println("i"+i+" = " + (Integer)i*2);
//        }
//    }

    private static void printDouble(ArrayList<Integer> items) {
        for (int i: items){
            System.out.println("i"+i+" = " + i*2);
        }
    }
}
