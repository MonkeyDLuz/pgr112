import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class BookRegister {

    ArrayList<Book> books;

    public BookRegister() {
        books = createRegistery();
    }

    public ArrayList<Book> createRegistery() {
        ArrayList<Book> books = new ArrayList<>();
        books = readFromFile("src/bok.txt");
        return books;
    }

    private ArrayList<Book> readFromFile(String pathName) {
        Scanner input = null;
        try {
            input = new Scanner(new File(pathName)).useDelimiter("\n");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        Book bokEn = new Book(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());
        input.nextLine();
        Book bokTo = new Book(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());
        input.nextLine();
        Book bokTre = new Book(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());
        input.nextLine();
        Book bokFire = new Book(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());
        input.nextLine();
        Book bokFem = new Book(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());
        input.nextLine();
        Book bokSeks = new Book(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());
        input.nextLine();
        Book bokSyv = new Book(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());
        input.nextLine();

        ArrayList<Book> books = new ArrayList<>();
        books.add(bokEn);
        books.add(bokTo);
        books.add(bokTre);
        books.add(bokFire);
        books.add(bokFem);
        books.add(bokSeks);
        books.add(bokSyv);

        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public ArrayList<Book> overviewAllBooks(){
        return books;
    }
    public Book pickByGenre(String genre){
        for (Book book : books) {
            if (Objects.equals(book.genreType, genre)) {
                return book;
            }
        }
        return null;
    }
    public Book pickByAuthor(String author){
        for (Book book : books){
            if (Objects.equals(book.authorName, author)){
                return book;
            }
        }
        return null;
    }
    public Book pickByIBSN(String IBSN){
        for (Book book : books){
            if (Objects.equals(book.barcodeNumber, IBSN)){
                return book;
            }
        }
        return null;
    }
}

