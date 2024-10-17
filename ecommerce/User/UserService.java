package com.ecommerce.User;

public class UserService {

    public User getUserByName(String userName) {
        return new User(userName);
    }
}
