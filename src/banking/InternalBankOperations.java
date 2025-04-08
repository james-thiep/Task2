package banking;

class InternalBankOperations {
    private static final double INTEREST_RATE = 2.6;

    static void processMonthlyInterest(CustomerAccount account) {
        account.applyInterest(INTEREST_RATE);
    }

    static void transferBetweenAccounts(CustomerAccount from, CustomerAccount to, double amount) {
        from.internalTransfer(to, amount);
    }
}
