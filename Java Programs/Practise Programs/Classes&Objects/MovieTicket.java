/*In a multiplex theater, there is a discount scheme announced where one gets a 10% discount on the total
 cost of tickets when there is a bulk booking of more than 20 tickets, and a discount of 2% on the total cost
  of tickets if a special coupon card is submitted. Develop a program to find the total cost as per the scheme.
  The cost of the king class ticket is Rs.75 and queen class is Rs.150. Refreshments can also be opted by paying an
 additional of Rs. 50 per member.
Hint: k-king and q-queen, and You have to book minimum of 5 tickets and maximum of 40 at a time. If fails display
"Minimum of 5 and Maximum of 40 Tickets".  If circle is given a value other than 'k' or 'q' the output should be "Invalid Input".

The ticket cost should be printed exactly to two decimal places.
 */
package accenture;

import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of ticket:");
        int n = sc.nextInt();
        if (n >= 5 && n <= 40) {
            System.out.print("Do you want refreshment:");
            String r = sc.next();
            System.out.print("Do you have coupon code:");
            String c = sc.next();
            System.out.print("Enter the circle:");
            String circle = sc.next();
            double total = 0, dis = 0;

            switch (circle) {
                case "k":
                    total = n * 75;
                    if (n > 20)
                        total -= (total * 0.10);
                    if (c.equalsIgnoreCase("y"))
                        total -= (total * 0.02);
                    if (r.equalsIgnoreCase("y"))
                        total += (n * 50);
                    System.out.println("Ticket cost:" + String.format("%.2f", total));
                    break;
                case "q":
                    total = n * 150;
                    if (n > 20)
                        total -= (total * 0.10);
                    if (c.equalsIgnoreCase("y"))
                        total -= (total * 0.02);
                    if (r.equalsIgnoreCase("y"))
                        total += (n * 50);
                    System.out.println("Ticket cost:" + String.format("%.2f", total));
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        } else {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        }
    }
}
