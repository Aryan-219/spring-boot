package com.springmvc.validation.models;

import com.springmvc.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String firstName;
    private String lastName;

    @CourseCode(value = "LUV", message = "must start with LUV")
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @NotNull(message = "is required")
    @Min(value = 0, message = "Must be greater than 0")
    @Max(value = 10, message = "Must be less than 10")
    private Integer range;

    @Pattern(regexp = "^[A-Za-z0-9]{5}", message = "Must be of only 5 digits")
    private String postalCode;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }
}
