package com.example.twitch.hello; // 注意：不要用 laioffer，要和主启动类包名一致

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Person sayHello(@RequestParam(required = false, defaultValue = "Guest") String name,
                           @RequestParam(required = false, defaultValue =  "null") String company) {
        return new Person(
                name,
                company,
                new Address("123 Main St", null, null, null),
                new Book("1984", "George Orwell")
        );
    }
}