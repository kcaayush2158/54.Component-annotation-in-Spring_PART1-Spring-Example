package com.application.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pancard {
    @Value("HJDF8DK")
    private String pancardNumber;
    @Value("#{employee.employeeName}")
    private String pancardHolderName;

    public String getPancardNumber() {
        return pancardNumber;
    }

    public void setPancardNumber(String pancardNumber) {
        this.pancardNumber = pancardNumber;
    }

    public String getPancardHolderName() {
        return pancardHolderName;
    }

    public void setPancardHolderName(String pancardHolderName) {
        this.pancardHolderName = pancardHolderName;
    }
}
