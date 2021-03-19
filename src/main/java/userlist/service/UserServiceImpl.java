package userlist.service;

import org.springframework.stereotype.Service;
import userlist.model.User;
import userlist.model.UserData;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService{

    private final UserData userData = new UserData();

    @Override
    public void addUser(User user) {
        userData.addUser(user);
    }

    @Override
    public void removeUser(int id) {
        userData.removeUser(id);
    }

    @Override
    public User getUser(int id) {
        return userData.getUser(id);
    }

    @Override
    public Map<Integer, User> getUsers() {
        return userData.getUsers();
    }

    @Override
    public void updateUser(User user) {
        userData.updateUser(user);
    }

    @Override
    public boolean userNameAlreadyExists(User user) {
        for(Map.Entry<Integer, User> entry : userData.getUsers().entrySet()) {
            if(entry.getValue().getName().equals(user.getName())) {
                return true;
            }
        }
        return false;

    }
}
