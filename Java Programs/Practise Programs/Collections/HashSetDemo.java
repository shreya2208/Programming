package Collections;
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        Set namesList = new HashSet();
        namesList.add("ajay");
        namesList.add("vini");
        namesList.add("anil");
        namesList.add("pooja");
        namesList.add(120);
        namesList.add("vini");  //no duplicate elements added

        System.out.println(namesList+"\n");   //prints elements in unordered way

        //fori loop cannot be used in sets, for each loop is used
        System.out.println("using foreach loop");
        for (Object ob : namesList) {
            System.out.println(ob);
        }
    }
}
