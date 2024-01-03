package com.project.gymmanagement.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
    @NotNull(message = "Name should not be null")
    @NotEmpty(message = "Name should not be empty")
    private String name;
    private String lastName;
    @NotNull(message = "Age should not be null")
    @Min(1)
    private Integer age;
    @NotNull(message = "Gender should not be null")
    @NotEmpty(message = "Gender should not be empty")
    private String gender;
    @NotNull(message = "Email should not null")
    @Email(regexp = "[a-z0-9._-]+@([a-z0-9.-]+\\.)+[a-z]{2,3}$",message = "Enter valid Email address")
    private String emailId;
    @NotNull(message = "Mobile number should not be null")
    private Integer mobileNumber;
    @NotNull(message = "Address should not be null")
    @NotEmpty(message = "Address should not be empty")
    private String address;
    private Double height;
    private Double weight;
    private Double bmi;
    private String bloodGroup;
    private String dietPlan;
    private String workoutPlan;
}
