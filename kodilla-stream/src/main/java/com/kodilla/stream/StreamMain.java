package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {


       Forum forum = new Forum();
        Map<Integer, Object> theResultMapOfUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> forumUser.getDateOfBirght().getYear()>1998)
                .filter(forumUser -> forumUser.getAmmountOfPosts()>1)
                .collect(Collectors.toMap(ForumUser::getId, forumuser -> forumuser));

        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                    .map(entry -> entry.getKey() + " : " + entry.getValue())
                    .forEach(System.out::println);
    }
}