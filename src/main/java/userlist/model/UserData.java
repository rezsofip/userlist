package userlist.model;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

@Slf4j
public class UserData {

    private static int id = 0;
    private static final Map<Integer, User> users = new HashMap<>();

    public UserData() {
        addUser(new User("Peti", 27));
        addUser(new User("Regi", 24));
        addUser(new User("Zoli", 31));
        addUser(new User("Pisti", 28));
    }

    public Map<Integer, User> getUsers() {
        return Collections.unmodifiableMap(users);
    }

    public void addUser(User user) {
        log.info(users.toString());
        user.setId(id);
        users.put(id, user);
        id++;
    }

    public void removeUser(int id) {
        users.remove(id);
    }

    public User getUser(int id) {
        return users.get(id);
    }

    public void updateUser(@NonNull User newUser) {
        users.forEach(new BiConsumer<Integer, User>() {
            @Override
            public void accept(Integer integer, User user) {
                if(newUser.equals(user)) {
                    users.put(integer, newUser);
                }
            }
        });
    }



}
