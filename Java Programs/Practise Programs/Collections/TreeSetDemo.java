package Collections;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set nameList = new TreeSet();

//        nameList.add("kim");
//        nameList.add("riya");
//        nameList.add("vijay");
//        nameList.add("rani");
        // nameList.add(152);   Integer cannot be added IN Tree set of strings and vice-versa
        nameList.add(12);
        nameList.add(23);
        nameList.add(52);
        nameList.add(10);

        System.out.println(nameList);

        //More about Tree Set
        // TreeSet returns elements in a sorted order.
    }
}
