package org.springmvc.model;

import javax.validation.constraints.NotEmpty;

public class BookInfo {
    @NotEmpty( message = "User Name cannot be blank" )
    private String username;

    @NotEmpty( message = "Book name cannot be blank" )
    private String bookName;

    @NotEmpty( message = "Book description cannot be blank" )
    private String bookDescription;

    public String getUsername( ) {
        return username;
    }

    public void setUsername( String username ) {
        this.username = username;
    }

    public String getBookName( ) {
        return bookName;
    }

    public void setBookName( String bookName ) {
        this.bookName = bookName;
    }

    public String getBookDescription( ) {
        return bookDescription;
    }

    public void setBookDescription( String bookDescription ) {
        this.bookDescription = bookDescription;
    }
}
