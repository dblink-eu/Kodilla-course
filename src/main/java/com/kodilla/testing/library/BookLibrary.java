package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = libraryDatabase.listBooksWithCondition(titleFragment);
        //Book book = new Book("The book title", "The book author", 2000);
        //bookList.add(book);
        // temporary returning list of one book
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
