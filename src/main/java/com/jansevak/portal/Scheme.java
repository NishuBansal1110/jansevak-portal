package com.jansevak.portal;

import jakarta.persistence.*;

@Entity
public class Scheme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String schemeName;
    private Integer minAge;
    private Integer maxIncome;
    private String studentRequired;
    private String category;
    private String state;
    private String description;
    private String documents;
    private String benefits;

    // ✅ Empty Constructor (JPA ke liye zaroori)
    public Scheme() {
    }

    // ✅ Full Constructor (PortalApplication me use karne ke liye)
    public Scheme(Integer id,
                  String schemeName,
                  Integer minAge,
                  Integer maxIncome,
                  String studentRequired,
                  String category,
                  String state,
                  String description,
                  String documents,
                  String benefits) {

        this.id = id;
        this.schemeName = schemeName;
        this.minAge = minAge;
        this.maxIncome = maxIncome;
        this.studentRequired = studentRequired;
        this.category = category;
        this.state = state;
    }

    // Getters & Setters

    public Integer getId() { return id; }

    public String getSchemeName() { return schemeName; }
    public void setSchemeName(String schemeName) { this.schemeName = schemeName; }

    public Integer getMinAge() { return minAge; }
    public void setMinAge(Integer minAge) { this.minAge = minAge; }

    public Integer getMaxIncome() { return maxIncome; }
    public void setMaxIncome(Integer maxIncome) { this.maxIncome = maxIncome; }

    public String getStudentRequired() { return studentRequired; }
    public void setStudentRequired(String studentRequired) { this.studentRequired = studentRequired; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
}