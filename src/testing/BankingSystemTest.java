package testing;

import banking.AccountOperations;

public class BankingSystemTest {
    public static void main(String[] args) {

        AccountOperations testAccount = createTestAccount();
        testAccount.deposit(150);
        System.out.println(testAccount.getAccountDetails());
    }

    private static AccountOperations createTestAccount() {
        return new AccountOperations() {
            private double balance = 0;
            private String accountNumber = "TEST-123";

            @Override
            public void deposit(double amount) {
                if (amount > 0) {
                    balance += amount;
                    System.out.println("[TEST] Deposited: " + amount);
                }
            }

            @Override
            public String getAccountDetails() {
                return "[TEST ACCOUNT] Number: " + accountNumber + " | Balance: " + balance;
            }
        };
    }
}
