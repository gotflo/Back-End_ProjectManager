package com.mycompany.projectmanager.repo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.projectmanager.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@SpringBootApplication
public interface UserRepo extends JpaRepository<User, String> {

    public User findByUsernameAndPassword(String username, String password);
    public User findByUsername(String username);
    public User findByEmail(String email);
//    public User saveUser();
//    public User saveUser(User user);
}

