package Collections.library;

import java.util.ArrayList;
import java.util.Scanner;

public class MainLibrary {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Library lObj = new Library();
        int c;
        do
        {
            System.out.println("1.Add Book\n2.Display all book details\n3.Search Book by author\n4.Count number of books - by book name\n5.Exit");
            System.out.println("Enter your choice:");
            c = Integer.parseInt(sc.nextLine());
            switch(c)
            {
                case 1:
                {
                    Book bObj = new Book();
                    System.out.println("Enter the isbn no:");
                    bObj.setIsbnno(Integer.parseInt(sc.nextLine()));
                    System.out.println("Enter the book name:");
                    bObj.setBookName(sc.nextLine());
                    System.out.println("Enter the author name:");
                    bObj.setAuthor(sc.nextLine());
                    lObj.addBook(bObj);
                }
                break;
                case 2:
                {
                    if(lObj.isEmpty())
                        System.out.println("The list is empty");
                    else
                    {
                        ArrayList<Book> bookList = lObj.viewAllBooks();
                        for(Book b : bookList)
                        {
                            System.out.println("ISBN no: "+b.getIsbnno());
                            System.out.println("Book name: "+b.getBookName());
                            System.out.println("Author name: "+b.getAuthor());
                        }
                    }
                }
                break;
                case 3:
                {
                    if(lObj.isEmpty())
                        System.out.println("The list is empty");
                    else
                    {
                        System.out.println("Enter the author name:");
                        String authorName = sc.nextLine();

                        if(lObj.viewBooksByAuthor(authorName).isEmpty())
                            System.out.println("None of the book published by the author "+authorName);
                        else
                        {
                            for(Book b : lObj.viewBooksByAuthor(authorName))
                            {
                                System.out.println("ISBN No: "+b.getIsbnno());
                                System.out.println("Book name: "+b.getBookName());
                                System.out.println("Author name: "+b.getAuthor());
                            }
                        }
                    }
                }
                break;
                case 4:
                {
                    if(lObj.isEmpty())
                        System.out.println("The list is empty");
                    else
                    {
                        System.out.println("Enter the book name");
                        String bookName = sc.nextLine();
                        System.out.println("Count is "+lObj.countnoofbook(bookName));
                    }
                }
                break;
            }
        }while(c != 5);
    }
}
