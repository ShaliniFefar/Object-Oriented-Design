import java.util.*;

public class UserManager {
    private HashMap<Integer, User> users;

    public User addUser(int id, String details, int accountType) {
        if(users.containsKey(id)) {
            return null;
        }
        User user = new User(id, details, accountType);
        users.put(id, user);
        return user;
    }

    public boolean removeUser(User uid) {
        return remove(uid.getUserId());
    }

    public boolean remove(int uid) {
        if(!users.containsKey(uid)) {
            return false;
        }
        users.remove(uid);
        return true;
    }

    public User findUser(int uid) {
        return users.get(uid);
    }
}