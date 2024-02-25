package management;

import items.Book;
import items.Journal;
import items.LibraryItem;
import items.Media;
import management.Library;

public class Driver {

    public static void displayMenu(){
        System.out.println("Welcome to the Library Management System!");
            System.out.println("Please select an option:");
            System.out.println("1. Add a book item to the library:");
            System.out.println("2. Add a media item to the library:");
            System.out.println("3. Add a journal to the library:");
            System.out.println("4. Remove an item from the library:");
            System.out.println("5. Change Item Information:");
            System.out.println("6. List Items by Category:");
            System.out.println("7. List All Items:");
            System.out.println("8. Add a client to the library:");
            System.out.println("9. Edit client information:");
            System.out.println("10. Remove a client from the library:");
            System.out.println("11. Lease an item :"); 
            System.out.println("12. Return an item :");
            System.out.println("13. All items leased by a client :");
            System.out.println("14. All leased items by all clients:");
            System.out.println("15. Display the biggest book in the library :"); 
            System.out.println("16. Make a copy of the books :");
    }
    
    public static void runPredefinedScenario(){

        Book kitab1 = new Book("The Hobbit", 700, "2012", "LOTR", "J.R.R. Tolkien", 1937);
        Journal j = new Journal(2, "MIT Press", "Ryan Sterling", 1998);
        Media ew = new Media("The Matrix", "Warner Bros", "Gary Dick", 1936);
        Book kitab2 = new Book("The Hobbit", 700, "2012", "LOTR", "J.R.R. Tolkien", 1937);
        Media yahood = new Media("The Book Theif", "Vanguard", "Nuke Daddy", 1948);
      
        System.out.println(kitab1.toString());
        System.out.println(j.toString());
        System.out.println(ew.toString());
        System.out.println(kitab2.toString());
        System.out.println(yahood.toString());

        // equals method for two objects of diff class, two of the same class, 
        System.out.println(kitab1.equals(kitab2));
        System.out.println(j.equals(ew));
        System.out.println(yahood.equals(kitab1));

        //array for each item
        Book[] book = new Book[2];
        book[0] = new Book("The Hobbit", 700, "2012", "LOTR", "J.R.R. Tolkien", 1937);
        book[1] = new Book("Cooking", 330, "2009", "Stuffed", "Gordan Ramsay", 2021);

        Journal[] write = new Journal[1];
        write[0] = new Journal(4, "Qeur", "Boo", 2018);

        Media[] fox = new Media[1];
        fox[0] = new Media("Land", "khamas", "Abu", 2023);
        
        //array for all items
        LibraryItem[] items = new LibraryItem[5];
        items[0] = new Book("The Hobbit", 700, "2012", "LOTR", "J.R.R. Tolkien", 1937);
        items[1] = new Journal(2, "MIT Press", "Ryan Sterling", 1998);
        items[2] = new Media("The Matrix", "Warner Bros", "Gary Dick", 1936);
        items[3] = new Book("Star Wars", 840, "1977", "LucasFilms", "George Lucas", 1977);
        items[4] = new Journal(4, "FANGG Press", "Joe Rogan", 2008);

        //get the biggest book in the library
        Library.getBiggestBook(book[0], book[1]);

        //create a deep copy of the Media[] array
        Media[] copyBooks = Library.copyBooks(fox);
        System.out.println("Deep Copy of the Media:");
        Library.displayBooks(copyBooks);
    }
}
