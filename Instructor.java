package com.klef.jfsd.exam;

public class Instructor {
    private Integer instructorId;
    private String name;
    private String email;
    private String phoneNumber;

    public Instructor(Integer instructorId, String name, String email, String phoneNumber) {
        this.instructorId = instructorId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "instructorId=" + instructorId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}