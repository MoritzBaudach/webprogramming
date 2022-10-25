package de.krischkes.webprogrammierung.controller;

import de.krischkes.webprogrammierung.controller.request.UserCreationRequest;
import de.krischkes.webprogrammierung.repository.entity.User;
import de.krischkes.webprogrammierung.service.UserManagementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    public UserController(UserManagementService userManagementService) {
        this.userManagementService = userManagementService;
    }

    private final UserManagementService userManagementService;


    @GetMapping(path = "/users")
    public List<User> getUsers(){
        return userManagementService.getUsers();
    }

    @RequestMapping(path = "/user", method = RequestMethod.GET)
    public ResponseEntity<User> getUserRequestParamCustomStatusCode(@RequestParam(name = "id", required = true) Long id) {
        User userById = userManagementService.getUserById(id);
        return ResponseEntity.status(HttpStatus.OK).body(userById);
    }

    @RequestMapping(path = "/user/{id}", method = RequestMethod.GET)
    public User getUserPath(@PathVariable(name = "id") Long id) {
        return userManagementService.getUserById(id);
    }


    @RequestMapping(path = "/user", method = RequestMethod.POST)
    public User createUserPost(@RequestBody UserCreationRequest creationRequest) {
        return userManagementService.createUser(creationRequest.getFirstName(),
                creationRequest.getLastName(),
                creationRequest.getAge(),
                creationRequest.getUserName(),
                creationRequest.getPassword());
    }
}







