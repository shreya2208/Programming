package Collections;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        List namesList = new ArrayList();
        namesList.add("ajay");
        namesList.add("vijay");
        namesList.add("anil");
        namesList.add(1, "aniket"); //insert any name in between
        namesList.add(120);
        namesList.add(1.4f);
        namesList.add(120);         //duplicate elements allowed
        System.out.println(namesList);
        System.out.println();

        //to get individual elements
        System.out.println("using fori loop");
        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i));
        }
        System.out.println();

        //for each loop
        System.out.println("using for each loop");
        for (Object o : namesList) {
            System.out.println(o);
        }
        System.out.println();

        //using iterator
        System.out.println("Using Iterator");
        Iterator it1 = namesList.iterator();
        while (it1.hasNext())
            System.out.println(it1.next());
    }


}
