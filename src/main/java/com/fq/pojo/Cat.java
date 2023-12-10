package com.fq.pojo;

public class Cat {
    private String breed;
    private String name;

    public Cat(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public Cat() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
