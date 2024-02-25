package items;

public class Book extends LibraryItem{
    
    private String bookID;
    protected int numberOfPages;

    public Book() {
        super(null, null, null, 0); 
        bookID = "1234";
        numberOfPages = 0;
    }

    // Constructor
    public Book(String bookID, int numberOfPages, String itemID, String name, String author, int yearOfPublication) {
        super(itemID, name, author, yearOfPublication);
        this.bookID = bookID;
        this.numberOfPages = numberOfPages;
    }

    public Book(Book otherBook) {
        super(otherBook.getItemID(), otherBook.getName(), otherBook.getAuthor(), otherBook.getYearOfPublication());
        this.numberOfPages = otherBook.numberOfPages;
    }

    // Getters
    public String getBookID() {
        return bookID;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    // Setters
    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

     // equals
     @Override
     public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book other = (Book) obj;
        return this.bookID.equals(other.bookID) && this.numberOfPages == other.numberOfPages;
     }

    // toString
    @Override
    public String toString() {
        return "Book{" + "bookID=" + bookID + ", numberOfPages=" + numberOfPages + "itemID=" + itemID + ", name=" + name + ", author=" + author + ", yearOfPublication=" + yearOfPublication +'}';
    }

    private boolean isValidateBookID(String bookID) {
        if (bookID.substring(0) == "B") {
            return true;
        }else{
            return false;
        }
    }
   
}
