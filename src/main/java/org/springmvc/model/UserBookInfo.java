package org.springmvc.model;




public class UserBookInfo {


  private String firstName;

  private String lastName;

  private String bookName;

  private String bookDescription;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getBookDescription() {
    return bookDescription;
  }

  public void setBookDescription(String bookDescription) {
    this.bookDescription = bookDescription;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
