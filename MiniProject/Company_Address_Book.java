import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    private String name;
    private String address;
    private String phoneNumber;

    public User(String name, String address, String phoneNumber) {
        setName(name);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class Main {
    private static List<User> addressBook = new ArrayList<>();

    public static void main(String[] args) {
        boolean programIsRunning = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------Welcome to AddressBook 1.0 ------------------");

        while (programIsRunning) {
            // Print user options
            System.out.println();
            printUserOptions();
            System.out.println();

            int userInput = Integer.parseInt(scanner.nextLine());

            switch (userInput) {
                case 1:
                    System.out.println("Now, you are logged in to user platform. You can \"Create a User\"");
                    createUser(scanner);
                    break;
                case 2:
                    System.out.println("Update user information");
                    updateUserInformation(scanner);
                    break;
                case 3:
                    System.out.println("Remove person from list");
                    removePersonFromList(scanner);
                    break;
                case 4:
                    System.out.println("Show all persons in list slice");
                    showAllPersonsInList();
                    break;
                case 5:
                    System.out.println("Thanks for visiting...");
                    programIsRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    private static void printUserOptions() {
        System.out.println("Choose one of the following options: ");
        System.out.println("#1 Create new user");
        System.out.println("#2 Edit user information");
        System.out.println("#3 Delete existing user");
        System.out.println("#4 Show all users in address book");
        System.out.println("#5 Exit from program");
    }

    private static void createUser(Scanner scanner) {
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();

        System.out.print("Enter user address: ");
        String address = scanner.nextLine();

        System.out.print("Enter user phone number: ");
        String phoneNumber = scanner.nextLine();

        addressBook.add(new User(name, address, phoneNumber));

        System.out.print("Adding details into Database (SQL Server) in progression");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
        }
        System.out.println();
        System.out.println("User added successfully.");
        display();
    }

    private static void updateUserInformation(Scanner scanner) {
        System.out.print("Enter the name of the user you want to edit: ");
        String name = scanner.nextLine();

        User user = findUserByName(name);
        if (user != null) {
            System.out.print("Enter new address: ");
            user.setAddress(scanner.nextLine());

            System.out.print("Enter new phone number: ");
            user.setPhoneNumber(scanner.nextLine());

            System.out.println();
            System.out.println("User information updated successfully.");
            display();
        } else {
            System.out.println("User not found.");
            display();
        }
    }

    private static void removePersonFromList(Scanner scanner) {
        System.out.print("Enter the name of the user you want to delete: ");
        String name = scanner.nextLine();

        User user = findUserByName(name);
        if (user != null) {
            addressBook.remove(user);
            System.out.println("User deleted successfully.");
            display();
        } else {
            System.out.println("User not found.");
            display();
        }
    }

    private static void showAllPersonsInList() {
        if (!addressBook.isEmpty()) {
            System.out.println("List of users in address book:");
            for (User user : addressBook) {
                System.out.println("Name: " + user.getName() + ", Address: " + user.getAddress() + ", Phone Number: " + user.getPhoneNumber());
            }
            display();
        } else {
            System.out.println("Address book is empty.");
            display();
        }
    }

    private static User findUserByName(String name) {
        for (User user : addressBook) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    private static void display() {
        System.out.println("-----------------------------Thanks For Using Our Services-----------------------------");
    }
}
