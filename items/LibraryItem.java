package items;

public class LibraryItem {
    
    protected String itemID;  // Common ID for all items
    protected String name;
    protected String author;
    protected int yearOfPublication;

    public LibraryItem() {
    }

    // Constructor
    public LibraryItem(String itemID, String name, String author, int yearOfPublication) {
        this.itemID = itemID;
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public LibraryItem(LibraryItem otherLibraryItem) {
        this.name = otherLibraryItem.name;
        this.author = otherLibraryItem.author;
        this.yearOfPublication = otherLibraryItem.yearOfPublication;
    }

    // Getters
    public String getItemID() {
        return itemID;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    // Setters
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
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
         LibraryItem other = (LibraryItem) obj;
         return this.name.equals(other.name) && this.author.equals(other.author) && this.yearOfPublication == other.yearOfPublication;
     }

    // toString
    @Override
    public String toString() {
        return "LibraryItem{" + "itemID=" + itemID + ", name=" + name + ", author=" + author + ", yearOfPublication=" + yearOfPublication + '}';
    }
}
