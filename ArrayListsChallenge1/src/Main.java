import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone();

    public static void main(String[] args) {
        int choice = 0;
        boolean quit = false;

        printMenu();
        while(!quit){
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printMenu();
                    break;
                case 1:
                    myPhone.printContactsList();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("\nPress");
        System.out.println("\t0 - to print menu.");
        System.out.println("\t1 - to print contacts list.");
        System.out.println("\t2 - to add new contact.");
        System.out.println("\t3 - to update contact.");
        System.out.println("\t4 - to remove contact.");
        System.out.println("\t5 - to search contact.");
        System.out.println("\t6 - to quit the application.");
    }

    public static void addNewContact() {
        System.out.print("Enter new contacts name: ");
        String name = scanner.nextLine();
        System.out.print("\nEnter new contacts phone number: ");
        String number = scanner.nextLine();
        System.out.println();
        if(!myPhone.newContact(name, number)){
            System.out.println("Contact already exists");
        }
        else{
            System.out.println("Contact " + name + " with number " + number + " has been added.");
        }
    }

    public static void updateContact(){
        System.out.println("Enter name of contact:");
        String currentName = scanner.nextLine();
        if(myPhone.searchContact(currentName)){
            System.out.println("Enter new name ( or \'enter\' if you don't want to change:");
            String newName = scanner.nextLine();
            System.out.println("Enter new number ( or \'enter\' if you don't want to change:");
            String newNumber = scanner.nextLine();
            if(myPhone.modifyContact(currentName, newName, newNumber)){
                System.out.println("Successfully updated contact\n");
            }
            else {
                System.out.println("Updating contact failed\n");
            }
        }
        else{
            System.out.println("Contact you want to update doesn't exist.\n");
        }
    }

    public static void removeContact(){
        System.out.println("Enter name of contact");
        String name = scanner.nextLine();
        if(myPhone.removeContact(name)){
            System.out.println("Successfully removed contact.\n");
        }
        else{
            System.out.println("Removing contact failed.\n");
        }
    }

    public static void searchContact(){
        System.out.println("Enter name of contact:");
        String name = scanner.nextLine();
        if(myPhone.searchContact(name)){
            Contact searchedContact = myPhone.queryContact(name);
            System.out.println("Contact " + searchedContact.getName() + " has number: " + searchedContact.getNumber() + "\n");
        }
        else{
            System.out.println("Contact you looking for doesn't exist.\n");
        }
    }

}
