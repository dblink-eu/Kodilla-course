package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
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
