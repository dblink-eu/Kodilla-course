package com.kodilla.spring.forum;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ForumUser implements Forum{
    private String username;

    public ForumUser() {
        username = "John Smith";
    }

    @Override
    public String getUsername() {
        return username;
    }
}
