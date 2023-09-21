package GroupEx2;

public class Task5 {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        boolean check = true;

        if (str1.length() != str2.length()) {
            check = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                char charStr1 = str1.charAt(i);
                if (str2.contains(String.valueOf(charStr1))) {
                    check = true;
                }
            }
        }

        if (check) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

    }
}
