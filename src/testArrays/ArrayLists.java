package testArrays;

import java.util.ArrayList;

public class ArrayLists {


    public static void main(String[] args) {

        ArrayList<String> sl = new ArrayList();
        ArrayList<Integer> il = new ArrayList();

        sl.add("Hello");
        sl.add("World!");
        sl.add(1," ");

        for(String ausgabe : sl)
        {
            System.out.println(ausgabe);
        }

        System.out.println(sl.get(2));
        System.out.println(sl.indexOf("World!"));

    }
}
