package GroupEx2;

public class Task4 {
    public static void main(String[] args) {
        String input="Hello, World! house, mother!";
        String[] words = input.split("[\\s\\p{Punct}]+");
        int count= words.length;
        System.out.println(count);

    }
}
