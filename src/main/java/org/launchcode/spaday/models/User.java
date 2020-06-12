package org.launchcode.spaday.models;

import javax.validation.constraints.*;

public class User {

    @NotBlank(message = "Please enter a username.")
    @Size(min=5, max=15, message="Username must be between 5 and 15 characters.")
    private String username;

    @Email(message="Please provide a valid email address.")
    private String email;

    @NotBlank(message="Please enter a password.")
    @Size(min=6, message="Password must be at least 6 characters in length.")
    private String password;

    public User() {

    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
