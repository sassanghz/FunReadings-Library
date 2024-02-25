package management;
import java.util.Scanner;
import items.Book;
import items.Journal;
import items.Media;
import items.LibraryItem;
import client.Client;

public class Library implements Cloneable{

    public static Scanner scanner = new Scanner(System.in);
    
    public static void addBookItem(LibraryItem item) {
        System.out.print("Enter Book ID: ");
        String bookID = scanner.nextLine();
        System.out.print("Enter Book number of pages: ");
        int numberOfPages = scanner.nextInt();
        System.out.print("Enter the ID of the item: ");
        String itemID = scanner.nextLine();
        System.out.print("Enter the name of the book: ");
        String name = scanner.nextLine();
        System.out.print("Enter the author of the book: ");
        String author = scanner.nextLine();
        System.out.print("Enter the year the book was released: ");
        int yearOfPublication = scanner.nextInt();
        scanner.nextLine();

        Book book = new Book(bookID, numberOfPages, itemID, name, author, yearOfPublication);
    
        System.out.println("Book added to the library");
    }

    public static void addMediaItem(LibraryItem item) {
        System.out.println("Enter the type of media: ");
        String type = scanner.nextLine();
        System.out.println("Enter the name of the media: ");
        String name = scanner.nextLine();
        System.out.println("Enter the author of the media: ");
        String author = scanner.nextLine();
        System.out.println("Enter the year the media was released: ");
        int yearOfPublication = scanner.nextInt();

        Media media = new Media("Media", "4 wives", "Trumpy", 2020);

        System.out.println("Item added to the library");
    }

    public static void addJournal(LibraryItem item) {
        System.out.println("Enter the volume number of the journal: ");
        int volumeNumber = scanner.nextInt();
        System.out.println("Enter the name of the journal: ");
        String name = scanner.nextLine();
        System.out.println("Enter the author of the journal: ");
        String author = scanner.nextLine();
        System.out.println("Enter the year the journal was released: ");
        int yearOfPublication = scanner.nextInt();

        Journal journal = new Journal(1, "The Journal", "The Author", 2020);
        System.out.println("Item added to the library");
    }

    public static void removeItem(LibraryItem item) {

        System.out.println("Item removed from the library");
    }

    public static void changeItemInformation(LibraryItem item) {
        System.out.println("Item information changed");
    }

    public static void listItemsByCategory(LibraryItem item) {
        System.out.println("Items listed by category");
    }

    public static void listAllItems(LibraryItem item) {
        System.out.println("All items listed");
    }

    public static void addClient(client.Client client) {
        System.out.println("Enter the name of the client: ");
        String name = scanner.nextLine();
        System.out.println("Enter the phone number of the client: ");
        int phoneNumber = scanner.nextInt();
        System.out.println("Enter the email of the client: ");
        String email = scanner.nextLine();
        System.out.println("Enter the ID of the client: ");
        long id = scanner.nextLong();
        scanner.nextLine();
        Client client2 = new Client(99, "John", 123456789, "abc@gmail.com");
        System.out.println("Client added to the library");
    }

    public static void editClientInformation(client.Client client) {
        System.out.println("Enter the name of the client: ");
        String name = scanner.nextLine();

        System.out.println("Client information edited");
    }

    public static void removeClient(client.Client client) {
        System.out.println("Client removed from the library");
    }

    public static void leaseItem(LibraryItem item) {
        System.out.println("Item leased from the library");
    }

    public static void returnItem(LibraryItem item) {
        System.out.println("Item returned to the library");
    }

    public static void allItemsLeasedByClient(client.Client client) {
        System.out.println("All items leased by the client");
    }

    public static void allLeasedItems(LibraryItem item) {
        System.out.println("All leased items listed");
    }

    public static void getBiggestBook(Book book1, Book book2) {
        int result = book1.getNumberOfPages() - book2.getNumberOfPages();
        
        if (result > 0) {
            System.out.println("The biggest book is: " + book1.getName());
        } else if (result < 0) {
            System.out.println("The biggest book is: " + book2.getName());
        } else {
            System.out.println("The books are the same size");
        }
    }

    public static Media[] copyBooks(Media[] otherMedia) {
        Media[] copyMedia = new Media[otherMedia.length];
        
        for (int i = 0; i < copyMedia.length; i++) {
            copyMedia[i] = new Media(otherMedia[i]);
        }
        return copyMedia;
    }

    public static void displayBooks(Media[] med){
        for(Media media: med){
            System.out.println(media);
        }
    }
}
