import java.time.LocalDate;
import java.util.ArrayList;

public class Client {
    private LocalDate openDate = LocalDate.now();
    private String name;
    private ArrayList<Double> TransactionsList = new ArrayList<Double>();

    public Client(String name, double initialValue){
        this.name = name;
        TransactionsList.add(initialValue);
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactionsList() {
        return TransactionsList;
    }

}
