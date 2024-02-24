package com.HostelManagementSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HostelManagementSystem.Entity.User;
import com.HostelManagementSystem.Repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
 @Autowired
 private UserRepository userRepository;

 @Override
 public User createUser(User user) {
    
     return userRepository.save(user);
 }

 @Override
 public User getUserByUsername(String username) {
     return userRepository.findByUsername(username).orElse(null);
 }


}
