import java.util.Scanner;

public class Demo026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string to check the vowels and consonants: ");

        String sentense = sc.nextLine().toLowerCase();
        int vowels = 0, consonants = 0;

        for (char c : sentense.toCharArray()) {
            if ("aeiou".contains(c + ""))
                vowels++;
            else if (c >= 'a' && c <= 'z')
                consonants++;
        }
        sc.close();

        System.out.println("number of vowels " + vowels);
        System.out.println("number of consonants " + consonants);
    }
}
