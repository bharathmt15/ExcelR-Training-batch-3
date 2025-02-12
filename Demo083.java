import java.util.Scanner;

public class Demo083 {
    public static void main(String[] args) {
        Vowe sc = new Vowe();
        boolean isVowel = sc.elem();
        System.out.println(isVowel);
    }
}

class Vowe {
    public boolean elem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        char userin = Character.toLowerCase(sc.next().charAt(0));
        sc.close();
        if (userin == 'a' || userin == 'e' || userin == 'i' || userin == 'o' || userin == 'u') {
            return true;
        }

        return false;
    }
}
