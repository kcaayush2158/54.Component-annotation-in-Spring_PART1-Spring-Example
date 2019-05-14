package com.application.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("12931")
    private Integer employeeId;
    @Value("aayush kc")
    private String employeeName;

    @Autowired
    private Pancard pancard;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Pancard getPancard() {
        return pancard;
    }

    public void setPancard(Pancard pancard) {
        this.pancard = pancard;
    }
}
