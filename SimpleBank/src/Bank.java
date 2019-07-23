import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> BranchesList = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printBranch(String name, boolean withTransactions){
        if(name != null && !name.equals("")) {
            Branch searchedBranch = searchBranch(name);
            if (searchedBranch != null) {
                if(searchedBranch.getClientsList().isEmpty()){
                    System.out.println("Branch " + name + " is empty");
                }
                else {
                    System.out.println("Branch " + name + ":");
                    searchedBranch.printClientsList(withTransactions);
                }
            }
            else {
                System.out.println("Branch doesn't exist");
            }
        }
        else{
            System.out.println("Entered invalid data");
        }
    }

    public void addTransaction (String branchName, String clientName, double value){
        if(name != null && name.length() > 0 && value != 0){
            Branch searchedBranch = searchBranch(branchName);
            if(searchedBranch != null){
                searchedBranch.addTransaction(clientName,value);
            }
        }
        else {
            System.out.println("Entered invalid data");
        }
    }

    public void removeClient (String branchName, String clientName) {
        if (branchName != null && branchName.length() > 0 && clientName != null && clientName.length() > 0) {
            Branch searchedBranch = searchBranch(branchName);
            if (searchedBranch != null) {
                searchedBranch.removeClient(clientName);
            }
        }
        else {
            System.out.println("Entered invalid data");
        }
    }

    public void addClient (String branchName, String clientName){
        if(branchName != null && branchName.length() > 0 && clientName != null && clientName.length() > 0){
            Branch searchedBranch = searchBranch(branchName);
            if ( searchedBranch != null){
                searchedBranch.addClient(clientName);
            }
            else{
                System.out.println("Cannot find branch, create branch and try again");
            }
        }
        else {
            System.out.println("Entered invalid data");
        }
    }

    public void addBranch (String name, double initialValue){
        if(name != null && name.length() > 0){
            Branch searchedBranch = searchBranch(name);
            if(searchedBranch == null){
                if(initialValue == 0) {
                    BranchesList.add(new Branch(name));
                }
                else {
                    BranchesList.add(new Branch(name,initialValue));
                }
                System.out.println("Added branch \"" + name + "\"");
            }
            else {
                System.out.println("Branch already exists");
            }
        }
        else{
            System.out.println("Entered invalid data");
        }
    }

    private Branch searchBranch(String name){
        if(name != null && !name.equals("")){
            for (Branch item : BranchesList){
                if(item.getName().equals(name)){
                    return item;
                }
            }
        }
        return null;
    }

    public Boolean queryBranch(String name){
        if(name != null && !name.equals("")){
            if(searchBranch(name) != null){
                return true;
            }
            else{
                return false;
            }
        }
        System.out.println("Entered invalid data");
        return false;

    }



}
