package com.example.getmesocialservice.repository;


import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

@Repository
public class UserRepository {

    List<User> userList = new ArrayList();

    public User getUser(){
        User user = new User("Tousif Bin Alam", "Germany", 27, "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png");
        return user;
    }

    public User saveUser(User user) {
        user.setUserId(userList.size() +1);
        userList.add(user);
        return user;
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public User getUserById(int userId) {
        for(User user:userList){
            if(user.getUserId() ==userId){
                return user;
            }
        }
        return null;
    }

    public User updateUser(int userId, User user) {
        for(User u:userList){
            if(u.getUserId() == userId){
                u.setName(user.getName());
                u.setAddress(user.getAddress());
                u.setAge(user.getAge());
                return u;
            }
        }
        return null;
    }

    public User deleteUser(int userId) {
        User deletedUser = null;
        for(User u:userList){
            if(u.getUserId()== userId){
                deletedUser = u;
                userList.remove(deletedUser);
                return deletedUser;
            }
        }
        return deletedUser;
    }
}
