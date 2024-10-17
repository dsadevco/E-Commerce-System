package com.ecommerce.User;

public class UserController {
    private UserService userService = new UserService();

    public User getUser(String userName){
        return userService.getUserByName(userName);
    }
}
