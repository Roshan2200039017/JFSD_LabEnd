package com.klef.jfsd.exam;

import java.util.List;

public class Employee {
    private Integer employeeId;
    private String name;
    private Double salary;
    private Boolean department;
    private List<String> skills;

    public Employee(Integer employeeId, String name, Double salary, Boolean department, List<String> skills) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                ", skills=" + skills +
                '}';
    }
}