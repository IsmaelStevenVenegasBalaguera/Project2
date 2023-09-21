package GroupEx2;

import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {
        ArrayList <String>list=new ArrayList();
        list.add("Amor");
        list.add("Cairo");
        list.add("Argentina");
        list.add("Rosa");

        ArrayList <String> newList= new ArrayList<>();

        for (String a: list)
            if (a.startsWith("A")){
                newList.add(a.toLowerCase());
            }
        System.out.println(newList);



    }



}
