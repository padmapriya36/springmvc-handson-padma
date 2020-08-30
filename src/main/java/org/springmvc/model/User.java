package org.springmvc.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {

    @Size( min = 5, max = 20, message = "User Name must be between 5 and 20 characters in length" )
    @NotEmpty( message = "User Name cannot be blank" )
    private String username;

    @Size( min = 5, max = 20, message = "Password must be between 5 and 20 characters in length" )
    @NotEmpty( message = "Password cannot be blank" )
    private String password;

    @Size( min = 2, max = 20, message = "First Name must be between 2 and 20 characters in length" )
    @NotEmpty( message = "First name cannot be blank" )
    @Pattern(regexp = "^[A-Za-z ]*$", message = "First Name can only contain alphabets")
    private String firstName;

    @Size( min = 2, max = 20, message = "Last Name must be between 2 and 20 characters in length" )
    @NotEmpty( message = "Last name cannot be blank" )
    @Pattern(regexp = "^[A-Za-z ]*$", message = "Last Name can only contain alphabets")
    private String lastName;

    @Min( value = 15, message = "Minimum age must be atleast 5 years" )
    private int age;

    public String getUsername( ) {
        return username;
    }

    public void setUsername( String username ) {
        this.username = username;
    }

    public String getPassword( ) {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }

    public int getAge( ) {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    public String getFirstName( ) {
        return firstName;
    }

    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName( ) {
        return lastName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }


    @Override
    public String toString( ) {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
