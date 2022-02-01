import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        BookRegister bookRegister = new BookRegister();
        // add a book.
        Book newBook = new Book("12327841264", "title", "Author", "23", "genre");
        bookRegister.addBook(newBook);

        // modify a book
        Book bokEn = bookRegister.books.get(0);
        bokEn.setAuthorName("Tolkien");
        bokEn.setNameBook("Lord of the Rings");
        bokEn.setGenreType("Fantasy");
        bokEn.setBarcodeNumber("1231241241");
        bokEn.setPagesNumber("677");

        // find a book based on genre
        Book actionBok = bookRegister.pickByGenre("ACTION");

        // find a book based on author
        Book authorName = bookRegister.pickByAuthor("");
        // find a book based on ISBN
        Book barcodeNumber = bookRegister.pickByIBSN("9788203364181");
        // removes newest book
        bookRegister.books.remove(newBook);
        // exit
        System.exit(0);
    }
}
