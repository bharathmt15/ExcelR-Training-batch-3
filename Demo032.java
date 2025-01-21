import java.util.HashSet;

public class Demo032 {

    void hsmet() {
        HashSet<Object> hash = new HashSet<>();
        hash.add("Bharath");
        hash.add(19);
        hash.add(19.9);
        System.out.println(hash);
        for (Object info : hash) {
            System.out.println(info);
        }
    }

    public static void main(String[] args) {
        Demo032 obj = new Demo032();
        obj.hsmet();
    }
}
