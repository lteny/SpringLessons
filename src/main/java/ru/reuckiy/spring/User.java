package ru.reuckiy.spring;

public class User implements Person {
    private String name;
    private int id;

    public User(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
