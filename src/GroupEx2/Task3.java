package GroupEx2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String givenString = inp.nextLine();
        String rev = "";
        boolean ans = false;
        for (int i = givenString.length() - 1; i >= 0; i--) {
            rev = rev + givenString.charAt(i);
        }
        if (givenString.equalsIgnoreCase(rev)) {
            ans = true;
            System.out.println(givenString+" is a Palindrome");
        }
        else {
            System.out.println(givenString+" is not a Palindrome");
        }
    }
}
