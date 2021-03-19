package userlist.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import userlist.model.User;
import userlist.service.UserService;
import userlist.util.Mappings;
import userlist.util.ViewNames;

@Slf4j
@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }



    @GetMapping(Mappings.USERS)
    public String users(Model model) {
        model.addAttribute("userMap", userService.getUsers());
        return ViewNames.USERS;
    }

//    @ModelAttribute
//    public Map<Integer, User> userMap() {
//        log.info(userData.getUsers().toString());
//        return userData.getUsers();
//    }

    @GetMapping(Mappings.DELETE_USER)
    public String removeUser(@RequestParam int id) {
        userService.removeUser(id);
        return "redirect:/" + Mappings.USERS;
    }

    @GetMapping(Mappings.VIEW_USER)
    public String viewUser(@RequestParam int id, Model model) {
        model.addAttribute("viewUser", userService.getUser(id));
        return Mappings.VIEW_USER;
    }

    @GetMapping(Mappings.ADD_USER)
    public String addUser(Model model) {
        User user = new User("", 0);
        model.addAttribute("userToAdd", user);
        return ViewNames.ADD_USER;
    }

    @PostMapping(Mappings.ADD_USER)
    public String addUser(@ModelAttribute("userToAdd") User user, Model model) {
        if(userService.userNameAlreadyExists(user)) {
            model.addAttribute("message", "This name already exists!");
            return ViewNames.MESSAGE;
        }
        userService.addUser(user);
        return "redirect:/" + ViewNames.USERS;
    }

    @GetMapping(Mappings.EDIT_USER)
    public String editUser(@RequestParam int id, Model model) {
        model.addAttribute("userToEdit", userService.getUser(id));
        return ViewNames.EDIT_USER;
    }

    @PostMapping(Mappings.EDIT_USER)
    public String editUser(@ModelAttribute(Mappings.EDIT_USER) User user, Model model) {
        if(userService.userNameAlreadyExists(user)) {
            model.addAttribute("message", "This name already exists!");
            return ViewNames.MESSAGE;
        }
            userService.updateUser(user);
            return "redirect:/" + ViewNames.USERS;

    }

}
