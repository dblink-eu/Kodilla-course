package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOfUser(LibraryUser libraryUser) {
        List<Book> usersBooksList = libraryDatabase.listBooksInHandsOf(libraryUser);
        if(usersBooksList.size()==0){
            System.out.println("User dont' have any books");
        }
        else{
            System.out.println("User: "+ libraryUser.getFirstname() + " "  + libraryUser.getLastname() + " has been borrowed:");
            for (Book usersBooks:usersBooksList) {
                System.out.println(usersBooks);
            }
        }
        return usersBooksList;
    }
}
