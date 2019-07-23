import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static Bank bank = new Bank("SimpleBank");

    public static void main(String[] args) {
        boolean isRunning = true;

        printMenu();
        while(isRunning){

            System.out.println("Enter your choice:");
            int choice = input.nextInt();
            input.nextLine();

            switch(choice){
                case 0:
                    printMenu();
                    break;
                case 1:
                    printBranchWithClientsList();
                    break;
                case 2:
                    addBranch();
                    break;
                case 3:
                    addClient();
                    break;
                case 4:
                    addTransaction();
                    break;
                case 5:
                    removeClient();
                    break;
                case 6:
                    isRunning = false;
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Banking application menu:");
        System.out.print("1. Print branch with clients (optionally with transactions)\n" +
                        "2. Add new branch\n" +
                        "3. Add new client\n" +
                        "4. Add new transaction\n" +
                        "5. Remove client\n" +
                        "6. Quit\n" +
                        "0. Print Menu\n" +
                        "--------------------------------\n\n");

    }

    private static void printBranchWithClientsList(){
        System.out.println("Enter branch name which you want to see: ");
        String name = input.nextLine();
        if(bank.queryBranch(name)) {
            String choice;
            do {
                System.out.println("Do you want to see list of transactions for all clients? (Y/N)");
                choice = input.nextLine();
                if (choice.equals("Y")) {
                    bank.printBranch(name, true);
                    break;
                } else if (choice.equals("N")) {
                    bank.printBranch(name, false);
                    break;
                } else {
                    System.out.println("Entered invalid value");
                }
            } while (true);
        }
        else{
            System.out.println("Branch doesn't exist");
        }
    }

    private static void addBranch(){
        System.out.println("Enter new branch name:");
        String name = input.nextLine();
        double initialValue;
        do {
            System.out.println("How much money will be needed to active account? " +
                                "(Value higher or equal to zero, format: 1,1), zero define default value");
            initialValue = input.nextDouble();
        }while(initialValue < 0);
        input.nextLine();
        bank.addBranch(name, initialValue);
    }

    private static void addClient(){
        System.out.println("Enter new clients name:");
        String clientName = input.nextLine();
        System.out.println("Enter name of branch for that account:");
        String branchName = input.nextLine();
        bank.addClient(branchName, clientName);
    }

    private static void addTransaction(){
        System.out.println("Enter client name:");
        String clientName = input.nextLine();
        System.out.println("Enter branch name:");
        String branchName = input.nextLine();
        System.out.println("Enter value of transaction:");
        double transactionValue = input.nextDouble();
        input.nextLine();
        bank.addTransaction(branchName, clientName, transactionValue);
    }

    private static void removeClient(){
        System.out.println("Enter client name:");
        String clientName = input.nextLine();
        System.out.println("Enter branch name:");
        String branchName = input.nextLine();
        bank.removeClient(branchName,clientName);
    }









}
