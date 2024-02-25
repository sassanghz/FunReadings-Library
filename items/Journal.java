package items;

public class Journal extends LibraryItem{
    
    private int volumeNumber;

    private static int idCounter = 1;

    public Journal() {
        super(null, null, null, 0); 
        volumeNumber = 0;
    }

    // Constructor
    public Journal(int volumeNumber, String name, String author, int yearOfPublication) {
        super(name, author, author, yearOfPublication);
        this.volumeNumber = volumeNumber;
    }

    public Journal(Journal otherJournal) {
        super(otherJournal.getName(), otherJournal.getAuthor(), otherJournal.getAuthor(), otherJournal.getYearOfPublication());
        this.volumeNumber = otherJournal.volumeNumber;
    }

    // Getters
    public int getVolumeNumber() {
        return volumeNumber;
    }

    // Setters
    public void setVolumeNumber(int volumeNumber) {
        this.volumeNumber = volumeNumber;
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
        Journal other = (Journal) obj;
        return this.volumeNumber == other.volumeNumber && super.equals(obj);
     }

    // toString
    @Override
    public String toString() {
        return "Journal{" + "volumeNumber=" + volumeNumber + "itemID=" + itemID + ", name=" + name + ", author=" + author + ", yearOfPublication=" + yearOfPublication + '}';
    }

    private boolean isValidateJournalID(String volumeNumber) {
        if (volumeNumber.substring(0) == "J") {
            return true;
        }else{
            return false;
        }
    }
}
