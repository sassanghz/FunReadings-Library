package client;

public class Client {

    private long id;
    private String name;
    private int phoneNumber;
    private String email;

    private static long clientId = 1;

    public Client() {
    }

    public Client(long id, String name, int phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        clientId++;
    }

    public Client(Client client) {
        this.id = client.id;
        this.name = client.name;
        this.phoneNumber = client.phoneNumber;
        this.email = client.email;
    }

    public static long getClientId() {
        return clientId;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean equals(Client obj) {
        if (this == obj) { return true;}
        if (obj == null || getClass() != obj.getClass()) { return false;}
        Client client = (Client) obj;
        return this.id == client.id && this.name.equals(client.name) && this.phoneNumber == client.phoneNumber && this.email.equals(client.email);
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + '}';
    }
}
