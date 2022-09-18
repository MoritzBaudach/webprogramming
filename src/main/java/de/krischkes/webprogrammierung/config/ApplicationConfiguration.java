package de.krischkes.webprogrammierung.config;

import de.krischkes.webprogrammierung.repository.UserRepository;
import de.krischkes.webprogrammierung.repository.entity.User;
import de.krischkes.webprogrammierung.service.RoleManagementService;
import de.krischkes.webprogrammierung.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
//    @Bean
//    public UserRepository userRepository(){
//        return new UserRepository();
//    }
//
//    @Bean
//    public RoleManagementService roleManagementService(){
//        return new RoleManagementService();
//    }
//
//    @Bean
//    public UserManagementService userManagementService(@Autowired UserRepository userRepository, @Autowired RoleManagementService roleManagementService){
//        return new UserManagementService(roleManagementService, userRepository);
//    }
}
