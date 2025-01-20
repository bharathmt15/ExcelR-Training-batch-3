import java.util.HashSet;

public class Demo031 {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();

        set.add("Krishna");
        set.add(25);
        set.add(3.14);
        set.add(true);
        set.add('A');

        System.out.println("set elements ");
        for (Object sets : set) {
            System.out.println(sets);
        }
    }
}
