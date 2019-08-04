package ru.reuckiy.spring.model;

import ru.reuckiy.spring.enums.Status;

import javax.persistence.*;

@Entity
@Table(name = "app.Task")
public class Task {

    @Id
    private int id;

    @Column(name = "name_Task")
    private String name;

    @Enumerated
    private Status status;

    @ManyToOne
    private Project project;

    public Task() {
    }

    public Task(int id, String name, Project project) {
        this.id = id;
        this.name = name;
        this.project = project;
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

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
