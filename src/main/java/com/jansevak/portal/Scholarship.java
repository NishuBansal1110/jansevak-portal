package com.jansevak.portal;

import jakarta.persistence.*;

@Entity
public class Scholarship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String scholarshipName;
    private Integer minAge;
    private Integer maxIncome;
    private String category;
    private String state;

    public Integer getId() {
        return id;
    }

    public String getScholarshipName() {
        return scholarshipName;
    }

    public void setScholarshipName(String scholarshipName) {
        this.scholarshipName = scholarshipName;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer getMaxIncome() {
        return maxIncome;
    }

    public void setMaxIncome(Integer maxIncome) {
        this.maxIncome = maxIncome;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}