package jpa.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected LocalDateTime created_date;

    protected LocalDateTime modified_date;

    private int age;

    private String email;

    private String password;

    public Member() {

    }

    public Member(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void changeAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getCreated_date() {
        return created_date;
    }

    public LocalDateTime getModified_date() {
        return modified_date;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
