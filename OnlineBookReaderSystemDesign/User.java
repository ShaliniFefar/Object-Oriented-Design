public class User {
    private int userId;
    private String details;
    private int accountType;

    public void renewMembership() {

    }

    public User(int userId, String details, int accountType) {
        this.userId = userId;
        this.details = details;
        this.accountType = accountType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int id) {
        this.userId = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accType) {
        this.accountType = accType;
    }
}