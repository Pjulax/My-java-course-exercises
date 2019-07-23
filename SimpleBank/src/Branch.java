import java.util.ArrayList;

public class Branch {
    private Double initialValue;
    private String name;
    private ArrayList<Client> clientsList = new ArrayList<Client>();

    public Branch(String name){
        this(name, 20);
    }

    public Branch(String name, double initialValue) {
        this.name = name;
        this.initialValue = initialValue;
    }

    public Double getInitialValue() {
        return initialValue;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Client> getClientsList() {
        return clientsList;
    }

    public void printClientsList(boolean withTransactions){
        for(Client account : clientsList){
            System.out.println("--------------------------------------");
            System.out.println(account.getName());
            System.out.println("Created " + account.getOpenDate());
            if(withTransactions){
                System.out.println(account.getTransactionsList());
            }

        }
        System.out.print("\n\n");
    }

    public void addTransaction(String name, double value){
        Client searchedClient = searchClient(name);
        if(searchedClient != null){
            searchedClient.getTransactionsList().add(value);
            System.out.println("Added new transaction to " + name + " with value of: " + value + "$");
        }
        else{
            System.out.println("Client doesn't exist");
        }
    }

    public void addClient(String name){
        if(searchClient(name) == null) {
            clientsList.add(new Client(name, initialValue));
            System.out.println("Added client to branch " + this.name);
        }
        else{
            System.out.println("Client \"" + name + "\" already exists in database");
        }
    }

    public void removeClient(String name){
        Client searchedClient = searchClient(name);
        if(searchedClient != null) {
            clientsList.remove(searchedClient);
            System.out.println("Successfully removed client");
        }
        else{
            System.out.println("Client doesn't exist");
        }
    }

    public String getAccountOpenDate(String name){
        Client client = searchClient(name);
        if(client != null){
            return client.getOpenDate().toString();
        }
        System.out.println("Cannot find client \"" + name + "\"");
        return null;
    }

    public Client searchClient(String name) {
        for(Client item : clientsList){
            if(item.getName().equals(name)){
                return item;
            }
        }
        return null;
    }

}
