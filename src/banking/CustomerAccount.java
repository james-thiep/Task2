package banking;

public class CustomerAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String accountType;


    CustomerAccount(String accountNumber, String customerName, String accountType) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountType = accountType;
        this.balance = 0.0;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountType() {
        return accountType;
    }

    protected double getBalance() {
        return balance;
    }

    void setBalance(double amount) {
        this.balance = amount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        }
    }

    protected void applyInterest(double rate) {
        if (rate > 0) {
            double interest = balance * rate / 100;
            balance += interest;
            System.out.println("Interest applied. New balance: " + balance);
        }
    }
    
    void internalTransfer(CustomerAccount recipient, double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            recipient.balance += amount;
            System.out.println("Transfer successful between " + this.accountNumber +
                    " and " + recipient.accountNumber);
        }
    }
}

