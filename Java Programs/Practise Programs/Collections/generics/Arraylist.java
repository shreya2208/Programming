package Collections.generics;

import java.util.*;

public class Arraylist {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<Employee>();
        Employee e1 = new Employee(123,"Amar",90000);
        Employee e2 = new Employee(128,"jay",63000);
        Employee e3 = new Employee(127,"Poy",80000);
        Employee e4 = new Employee(129,"Arpit",70000);

        Employee e5 = new Employee(127,"Poy",80000);  //arraylist allows duplicates
        Employee e6 = e1;

        empList.add(e1); empList.add(e2); empList.add(e3); empList.add(e4); empList.add(e5); empList.add(e6);
        System.out.println(empList);

        for (int i = 0; i < empList.size(); i++) {
            System.out.println(empList.get(i));
        }
        System.out.println("**********");

        for (Employee ob: empList) {
            System.out.println(ob);
        }
        System.out.println("**********");

        Iterator <Employee> it = empList.iterator();
        while (it.hasNext())
            System.out.println(it.next());
        System.out.println("**********");

    }

}
