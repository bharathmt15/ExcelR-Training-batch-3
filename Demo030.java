
import java.util.ArrayList;
import java.util.Iterator;

public class Demo030 {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();

        friends.add("Surya");
        friends.add("Krishna");
        friends.add("Revanth");
        friends.add("Bhanu");
        friends.add("Avin");

        Iterator<String> iterator = friends.iterator();

        System.out.println("List of Friends:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("End of the code");
    }
}
