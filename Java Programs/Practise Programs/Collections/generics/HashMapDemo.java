package Collections.generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> country = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter country name");
            String name = sc.nextLine();
            System.out.println("Enter country code");
            int code = sc.nextInt();
            sc.nextLine();
            country.put(name,code);
        }
        //System.out.println(country);
        for (Map.Entry<String, Integer> m: country.entrySet()) {
            System.out.println(m.getKey()+":"+m.getValue());
        }


    }
}
