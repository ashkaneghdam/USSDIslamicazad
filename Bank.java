import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(branchName)) {
                return branches.get(i);
            }
        }

        return null;
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            branches.add(new Branch(name));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, int initialAmount) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            existingBranch.newCustomer(customerName, initialAmount);
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, int initialAmount) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            existingBranch.addCustomerTransaction(customerName, initialAmount);
            return true;
        }

        return false;
    }

    public int showTution(String name) {
        String cource = name.toLowerCase();
        switch (cource) {
            case "computer":
                System.out.println("شهریه ی شما برابر است با 800.00");
                return 800;
            case "bargh":
                System.out.println("شهریه ی شما برابر است با 750.00");
                return 750;

            case "sanaye":
                System.out.println("شهریه ی شما برابر است با 670.00");
                return 670;

            case "mekanik":
                System.out.println("شهریه ی شما برابر است با 780.00");
                return 780;
            default:
                System.out.println("این رشته وجود ندارد!");
                break;


        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
}
