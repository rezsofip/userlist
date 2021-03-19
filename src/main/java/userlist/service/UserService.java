package userlist.service;

import userlist.model.User;

import java.util.Map;

public interface UserService {

void addUser(User user);
void removeUser(int id);
User getUser(int id);
Map<Integer, User> getUsers();
void updateUser(User user);
boolean userNameAlreadyExists(User user);

}
