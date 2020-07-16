package com.example.getmesocialservice.repository;


import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser(){
        User user = new User("Tousif", "Germany", 28, "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png");
        return user;
    }
}
