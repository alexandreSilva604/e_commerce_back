package com.example.e_commerce_back;

public class User {

    private final long id;
    private final String name, username, email, password;

    public User(long id, String name, String username, String email, String password) {

        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getUsername() {
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }
}
