package com.jansevak.portal;

import jakarta.persistence.*;

@Entity
public class Eligibility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;
    private String category;
    private int income;
    private String student;
    private String state;

    // Getters & Setters

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public int getIncome() { return income; }
    public void setIncome(int income) { this.income = income; }

    public String getStudent() { return student; }
    public void setStudent(String student) { this.student = student; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
}