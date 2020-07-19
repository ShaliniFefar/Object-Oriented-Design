import java.util.List;

public abstract class BankAccounts {
    private String accountNumber;
    private long minimumBalance;
    private long currentBalance;
    private List<Transaction> transactions;

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getMinimumBalance() {
        return minimumBalance;
    }
    public void setMinimumBalance(long minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public long getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(long currentBalance) {
        this.currentBalance = currentBalance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public abstract String getType();

}