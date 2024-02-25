package client;

public class ClientManager {
    public static void addClient(Client client) {
        System.out.println("Client added to the library");
    }

    public static void removeClient(Client client) {
        System.out.println("Client removed from the library");
    }

    public static void getClientInfo(Client client) {
        System.out.println("Client info: " + client);
    }
}
