public abstract class BankAccounts {
    private String accountNumber;
    private long minimumBalance;
    private long currentBalance;
    
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getMinimumBalance() {
        return minimumBalance;
    }
    public void setMinimumBalance(String minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public long getCurrentBalance() {
        return currentBalance;
    }
    public void setCurrentBalance(long currentBalance) {
        this.currentBalance = currentBalance;
    }

}