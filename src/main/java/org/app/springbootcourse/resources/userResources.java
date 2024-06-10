package org.app.springbootcourse.resources;

import org.app.springbootcourse.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class userResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(123L, "Yuri","yuri@123","31983901251","senha");
        return ResponseEntity.ok().body(u);
        // .ok if https requests is ok
        //.body to return the anwser body;
    }
}
