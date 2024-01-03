package com.project.gymmanagement.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String lastName;
    private Integer age;
    private String gender;
    private String emailId;
    private Integer mobileNumber;
    private String address;
    private Double height;
    private Double weight;
    private Double bmi;
    private String bloodGroup;
    private String dietPlan;
    private String workoutPlan;
}
