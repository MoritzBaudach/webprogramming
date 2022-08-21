package de.krischkes.webprogrammierung.service;

import de.krischkes.webprogrammierung.config.properties.GreetingProperties;
import org.springframework.stereotype.Service;

/**
 * Service that does the business logic to generate a greeting.
 */
@Service
public class GreetingService {
    public String generateGreeting(String firstName, String lastName) {
        return String.format(GreetingProperties.GREETING, firstName, lastName);
    }
}
