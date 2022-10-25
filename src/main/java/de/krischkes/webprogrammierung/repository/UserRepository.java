package de.krischkes.webprogrammierung.repository;

import de.krischkes.webprogrammierung.repository.entity.User;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {

    public UserRepository() {
        this.usersById = new HashMap<>();
        this.lastUniqueId = 0L;
    }

    //ATTENTION: THIS IS NOT THREAD SAFE - WILL BE RESOLVED WITHIN THE LECTURE
    private final Map<Long, User> usersById;
    private Long lastUniqueId;


    public User saveUser(User userToBeSaved){
        if(null != userToBeSaved.getId()){
            //already existing user should be updated
            usersById.put(userToBeSaved.getId(), userToBeSaved);
        }else {
            //a new user should be created saved
            userToBeSaved.setId(lastUniqueId++);
            usersById.put(userToBeSaved.getId(), userToBeSaved);
        }
        return userToBeSaved;
    }

    public boolean deleteUserById(Long id){
        return null != usersById.remove(id);
    }

    public User getUserById(Long id){
        return usersById.get(id);
    }

    public List<User> getUsers(){
        return new ArrayList<>(usersById.values());
    }

    @PostConstruct
    public void initialData(){
        saveUser(new User(null, "Max", "Mustermann", new byte[0], 18, "mmustermann", "password", new ArrayList<>()));
        saveUser(new User(null, "Moritz", "Mustermann", new byte[0], 19, "momustermann", "password", new ArrayList<>()));
        saveUser(new User(null, "Angela", "Mustermann", new byte[0], 20, "amustermann", "password", new ArrayList<>()));
        saveUser(new User(null, "Ralf", "Mustermann", new byte[0], 21, "rmustermann", "password", new ArrayList<>()));
    }

}
