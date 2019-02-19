package atul.backend.oauth.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "user_entity", schema = "atul", catalog = "")
public class UserEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String username;
    @Column
    @JsonIgnore
    private String password;
    @Column
    private long salary;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column
    private int age;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
