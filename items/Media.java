package items;

public class Media extends LibraryItem{

    private String type;

    public Media() {
        super(null, null, null, 0); 
        type = "Media";
    }

    // Constructor
    public Media(String type, String name, String author, int yearOfPublication) {
        super(null, null, null, 0);
        this.type = type;
    }

    public Media(Media otherMedia) {
        super(otherMedia.getName(), otherMedia.getAuthor(), otherMedia.getAuthor(), otherMedia.getYearOfPublication());
        this.type = otherMedia.type;
    }

    // Getters
    public String getType() {
        return type;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
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
        Media other = (Media) obj;
        return this.type.equals(other.type) && super.equals(obj);
    }

    // toString
    @Override
    public String toString() {
        return "Media{" + "type=" + type + "itemID=" + itemID + ", name=" + name + ", author=" + author + ", yearOfPublication=" + yearOfPublication + "}";
    }

    private boolean isValidateMediaID(String type) {
        if (type.substring(0) == "M") {
            return true;
        }else{
            return false;
        }
    }
    
}
