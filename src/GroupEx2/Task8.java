package GroupEx2;

public class Task8 {
    public static String increment(String str) {
        int num = Integer.parseInt(str);
        num++;
        return Integer.toString(num);
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "53456";
        String num3 = "29";

        String result1 = increment(num1);
        String result2 = increment(num2);
        String result3 = increment(num3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}




