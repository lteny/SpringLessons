package ru.reuckiy.spring.model;

import ru.reuckiy.spring.enums.Status;

import javax.persistence.*;

@Entity
@Table(name = "app_Project")
public class Project {

    @Id
    private int id;

    @Column(name = "name_Project")
    private String name;

    @Enumerated
    private Status status;

    public Project() {
    }

    public Project(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
