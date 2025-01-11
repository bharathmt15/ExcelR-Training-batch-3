import java.util.ArrayList;

public class Demo024 {
    public static void main(String[] args) {
        ArrayList<String[]> list = new ArrayList<>();
        list.add(new String[] { "Bharath", "19", "hyd" });
        list.add(new String[] { "Bhanu", "19", "hyd" });
        list.add(new String[] { "Revanth", "19", "hyd" });
        for (String[] lists : list) {
            System.out.println("name: " + lists[0]);
            System.out.println("age: " + lists[1]);
            System.out.println("address: " + lists[2]);
        }
    }
}