package com.jwt.example.JwtExample3.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.JwtExample3.models.User;

@Service
public class UserService {
    private List<User> store=new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Durgesh Tiwari","durgesh@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"Harsh Tiwari","harsh@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"Ankit Tiwari","ankit@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"Gautam Shukla","gautam@dev.in"));



    }

    public List<User>getUsers()
    {
        return this.store;
    }
    

}
