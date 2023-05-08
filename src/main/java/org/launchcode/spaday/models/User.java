package org.launchcode.spaday.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

    @NotBlank(message = "User name is like... required?")
    @Size(min = 3, message = "hi fleebo", max = 12)
    private String username;
    private String email;
    @NotBlank(message = "P-word required yo")
    @Size(max = 6, message = "ooh sorry, needs to be six lett's bruh")
    private String password;

    public User(String username, String email, String password) {
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
