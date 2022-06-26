package com.example.formvalidate.user;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {
    @NotEmpty(message = "cannot not be null")
    private String name;

    @Min(18)
    private int age;

    @Email
    @NotEmpty(message = "cannot not be null")
    private String email;

    @AssertTrue
    private boolean agreed;

    public User() {
    }



    public User(@NotEmpty(message = "cannot not be null") String name, @Min(18) int age,
            @Email @NotEmpty(message = "cannot not be null") String email, @AssertTrue boolean agreed) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.agreed = agreed;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

    @Override
    public String toString() {
        return "User [age=" + age + ", email=" + email + ", name=" + name + "]";
    }

}
