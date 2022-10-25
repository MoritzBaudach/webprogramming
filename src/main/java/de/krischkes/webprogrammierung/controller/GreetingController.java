package de.krischkes.webprogrammierung.controller;

import de.krischkes.webprogrammierung.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> greetingGet(@RequestParam(value = "firstName") String firstName, @RequestParam("lastName") String lastName){
        if("".equals(firstName)|| "".equals(lastName)){
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(greetingService.generateGreeting(firstName, lastName), HttpStatus.OK);
    }
}
