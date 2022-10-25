package de.krischkes.webprogrammierung.service;

import de.krischkes.webprogrammierung.repository.UserRepository;
import de.krischkes.webprogrammierung.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserManagementService {

    @Autowired
    public UserManagementService(RoleManagementService roleManagementService, UserRepository userRepository) {
        this.roleManagementService = roleManagementService;
        this.userRepository = userRepository;
    }

    private final RoleManagementService roleManagementService;
    private final UserRepository userRepository;

    public User createUser(String firstName, String lastName, Integer age, String userName, String password){
        User user = new User(null, firstName, lastName, null, age, userName, password, new ArrayList<>());
        return userRepository.saveUser(user);
    }

    public boolean removeUser(Long id){
        return userRepository.deleteUserById(id);
    }

    public User getUserById(Long id){
        return userRepository.getUserById(id);
    }

    public List<User> getUsers() {
        return userRepository.getUsers();
    }
}
