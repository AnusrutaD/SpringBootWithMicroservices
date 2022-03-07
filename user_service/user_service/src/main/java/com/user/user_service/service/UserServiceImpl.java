package com.user.user_service.service;

import com.user.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //Fake user list
    List<User> userList = List.of(
            new User(1311L, "Durgesh Tiwari", "9873216540"),
            new User(1312L, "Anusruta Dutta", "9873216540"),
            new User(1313L, "Akash Tiagy", "9873216540")
    );

    @Override
    public User getUser(Long userId) {
        return this.userList.stream().filter(user -> user.getUserId() == userId).findAny().orElse(null);
    }
}
