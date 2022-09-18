package de.krischkes.webprogrammierung.repository.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private byte[] picture;
    private Integer age;
    private String userName;
    private String password;
    private List<Role> roles;


    public User() {
    }

    public User(Long id, String firstName, String lastName, byte[] picture, Integer age, String userName, String password, List<Role> roles) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.picture = picture;
        this.age = age;
        this.userName = userName;
        this.password = password;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
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

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Arrays.equals(picture, user.picture) && Objects.equals(age, user.age) && Objects.equals(userName, user.userName) && Objects.equals(password, user.password) && Objects.equals(roles, user.roles);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, firstName, lastName, age, userName, password, roles);
        result = 31 * result + Arrays.hashCode(picture);
        return result;
    }
}
