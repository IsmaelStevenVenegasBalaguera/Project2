package GroupEx2;

public class Task1 {
    public static void main(String[] args) {
        String n1="New";
        String n2="Year";

        System.out.println(n1+n2);
        n1=n1+n2;
        n2=n1.substring(0,3);
        n1=n1.substring(3,7);
        System.out.println( n1+n2);

    }
}
