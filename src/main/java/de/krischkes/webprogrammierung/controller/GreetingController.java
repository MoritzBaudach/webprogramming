package de.krischkes.webprogrammierung.controller;

import de.krischkes.webprogrammierung.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller that handles the greetings api.
 */
@RestController
public class GreetingController {

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    private final GreetingService greetingService;


    @GetMapping("/greeting")
    public String greetingGet(@RequestParam String firstName, @RequestParam String lastName){
        return greetingService.generateGreeting(firstName, lastName);
    }
}
