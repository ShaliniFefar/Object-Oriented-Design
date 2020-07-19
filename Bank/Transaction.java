public class Transaction {
    private String transactionId;
    private double amount;
    private TransactionType type;

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return this.amount; 
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return this.type;
    } 

    public void setType(TransactionType type) {
        this.type = type;
    }
}