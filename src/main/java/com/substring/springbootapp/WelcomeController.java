package com.substring.springbootapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    @GetMapping("/users")
    public ResponseEntity<String> users() {
        return ResponseEntity.ok("Name: Substring Technologies, Live: true");
    }

    @GetMapping("/status")
    public ResponseEntity<String> status() {
        return ResponseEntity.ok("Application is running successfully 🚀");
    }

    @GetMapping("/users/{name}")
    public ResponseEntity<String> getUser(@PathVariable String name) {
        return ResponseEntity.ok("Hello " + name);
    }

    @GetMapping("/search")
    public ResponseEntity<String> search(@RequestParam String keyword) {
        return ResponseEntity.ok("Searching: " + keyword);
    }
}