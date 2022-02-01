public class Book {
    String barcodeNumber;
    String nameBook;
    String authorName;
    String pagesNumber;
    String genreType;

    //Constructor method
    public Book(String barcode, String name, String author, String pages, String genre){
        barcodeNumber = barcode;
        nameBook = name;
        authorName = author;
        pagesNumber = pages;
        genreType = genre;
    }

    public void setBarcodeNumber(String barcodeNumber) {
        this.barcodeNumber = barcodeNumber;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPagesNumber(String pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public void setGenreType(String genreType) {
        this.genreType = genreType;
    }
}

