import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Demo033 {

    LinkedHashSet<Integer> hSet = new LinkedHashSet<>();

    private Scanner scanner = new Scanner(System.in);

    public void collectData() {

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for student " + i + ": ");
            int marks = scanner.nextInt();
            hSet.add(marks);
        }
    }

    public void displayData() {
        System.out.println("Marks entered:");
        Iterator<Integer> iterator = hSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void calculateTotal() {
        int total = 0;
        for (int mark : hSet) {
            total += mark;
        }
        System.out.println("\nTotal marks: " + total);
    }

    public static void main(String[] args) {
        Demo033 demo = new Demo033();
        demo.collectData();
        demo.displayData();
        demo.calculateTotal();
    }
}