package com.HostelManagementSystem.Service;

import com.HostelManagementSystem.Entity.User;


public interface UserService {
 User createUser(User user);
 User getUserByUsername(String username);
}
