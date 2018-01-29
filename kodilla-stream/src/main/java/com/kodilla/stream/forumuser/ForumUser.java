package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int id;
    private final String login;
    private final char sex;
    private final LocalDate dateOfBirght;
    private final int ammountOfPosts;

    public ForumUser(int id, String login, char sex, LocalDate dateOfBirght, int ammountOfPosts) {
        this.id = id;
        this.login = login;
        this.sex = sex;
        this.dateOfBirght = dateOfBirght;
        this.ammountOfPosts = ammountOfPosts;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirght() {
        return dateOfBirght;
    }

    public int getAmmountOfPosts() {
        return ammountOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", sex=" + sex +
                ", dateOfBirght=" + dateOfBirght +
                ", ammountOfPosts=" + ammountOfPosts +
                '}';
    }
}
