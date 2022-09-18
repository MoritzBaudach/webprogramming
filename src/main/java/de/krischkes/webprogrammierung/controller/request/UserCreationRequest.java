package de.krischkes.webprogrammierung.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class UserCreationRequest {
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("age")
    private Integer age;
    @JsonProperty("userName")
    private String userName;
    @JsonProperty("password")
    private String password;

    public UserCreationRequest() {
    }

    public UserCreationRequest(String firstName, String lastName, Integer age, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.userName = userName;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCreationRequest that = (UserCreationRequest) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(age, that.age) && Objects.equals(userName, that.userName) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, userName, password);
    }
}
