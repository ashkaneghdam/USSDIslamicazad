import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Integer> tranaction;

    public Customer(String name,int amount) {
        this.name = name;
        this.tranaction = new ArrayList<>();
        addTransaction(amount);
    }

    public void addTransaction(int amount){
        tranaction.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getTranaction() {
        return tranaction;
    }
}
