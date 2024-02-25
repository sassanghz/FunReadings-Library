package management;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library Management System");
        
        System.out.println("Do you want to run a predefined scenario? (yes/no):");
        String userResponse = scanner.nextLine();

        if (userResponse.equals("yes")) {
            Driver.runPredefinedScenario();
        }
        
        System.out.println("Would you like to view the menu? (yes/no):");
        String userResponse2 = scanner.nextLine();
       
        if (userResponse2.equals("no")) {
            System.out.println("Goodbye!");
            System.exit(0);
        }

        boolean userDecision = true;
        
        while (userDecision) {
            Driver.displayMenu();
            
            System.out.println("\nEnter your option:");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch(option){
                case 1:
                    Library.addBookItem(null);
                    break;
                case 2:
                    Library.addMediaItem(null);
                    break;
                case 3:
                    Library.addJournal(null);
                    break;
                case 4:
                    Library.removeItem(null);
                    break;
                case 5:
                    Library.changeItemInformation(null);
                    break;
                case 6:
                    Library.listItemsByCategory(null);
                    break;
                case 7:
                    Library.listAllItems(null);
                    break;
                case 8:
                    Library.addClient(null);
                    break;
                case 9:
                    Library.editClientInformation(null);
                    break;
                case 10:
                    Library.removeClient(null);
                    break;
                case 11:
                    Library.leaseItem(null);
                    break;
                case 12:
                    Library.returnItem(null);
                    break;
                case 13:
                    Library.allItemsLeasedByClient(null);
                    break;
                case 14:
                    Library.allLeasedItems(null);
                    break;
                case 15:
                    Library.getBiggestBook(null, null);
                    break;
                case 16:
                    Library.copyBooks(null);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}