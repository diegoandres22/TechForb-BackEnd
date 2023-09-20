package com.techForb.Bank.Controller;

import com.techForb.Bank.Entity.User;
import com.techForb.Bank.Interface.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    IUserService iuserService;

    @GetMapping("user/getall")
    public List<User> getUser() {
        return iuserService.getUser();
    }

    @PostMapping("user/post")
    public String createUser(@RequestBody User user) {
        iuserService.saveUser(user);
        return "New User created";
    }

    @DeleteMapping("user/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        iuserService.deleteUser(id);
        return "User Deleted";
    }

    @PutMapping("user/edit/{id}")
    public String editUser(@PathVariable Long id, @RequestBody User updatedUser) {

        User user = iuserService.findUser(id);

        if (user == null) {
            return "User Not Found";
        } else {
          
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            user.setPassword(updatedUser.getPassword());
            user.setBalance(updatedUser.getBalance());
            user.setDocument(updatedUser.getDocument());

            iuserService.saveUser(user);
        }

        return "User " + user.getName() + " Modified";
    }

    /* 
    @PutMapping("user/edit/{id}")
    public User editUser(@PathVariable Long id,
            @RequestParam("name") String newName,
            @RequestParam("email") String newEmail,
            @RequestParam("password") String newPassword,
            @RequestParam("balance") String newBalance,
            @RequestParam("document") String newDocument) {
        User user = iuserService.findUser(id);
        user.setName(newName);
        user.setEmail(newEmail);
        user.setBalance(newBalance);
        user.setPassword(newPassword);
        user.setDocument(newDocument);

        iuserService.saveUser(user);
        return user;
    } 
     */
}
