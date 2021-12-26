package Collections.library;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book obj) {
        bookList.add(obj);
    }

    public boolean isEmpty() {
        if (bookList.isEmpty())
            return true;
        return false;
    }

    public ArrayList<Book> viewAllBooks() {
        return bookList;
    }

    public ArrayList<Book> viewBooksByAuthor(String author) {
        ArrayList<Book> aBookList = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getAuthor().equalsIgnoreCase(author))
                aBookList.add(bookList.get(i));
        }
        return aBookList;
    }

    public int countnoofbook(String bname) {
        int count =0 ;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getBookName().equalsIgnoreCase(bname))
                count++;
        }
        return count;
    }

}
