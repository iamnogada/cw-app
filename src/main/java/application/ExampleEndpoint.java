package application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ExampleEndpoint
 */
@RestController
public class ExampleEndpoint {
    @RequestMapping("/example")
    public String example() {
        // hi
        return "This is an example !!";
    }
}