import java.util.ArrayList;

class Demo029 {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();

        friends.add("Aarya");
        friends.add("Krishna");
        friends.add("Rahul");
        friends.add("Avin");
        friends.add("surya");
        friends.add("swaroop");
        friends.add("revanth");
        friends.add("arjun");
        friends.add("teja");
        friends.add("bhanu");

        System.out.println("my friends ");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
