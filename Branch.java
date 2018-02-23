import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    private Customer findCustomer(String name){
        for (int i = 0; i <this.customers.size();i++){
            if (customers.get(i).getName().equals(name)){
                return customers.get(i);
            }
        }
        return null;
    }

    public boolean newCustomer(String name , int amount){
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer == null){
            this.customers.add(new Customer(name,amount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name , int amount){
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
