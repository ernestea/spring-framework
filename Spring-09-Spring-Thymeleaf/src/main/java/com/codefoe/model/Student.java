package com.codefoe.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String fistName;
    private String lastName;
    private int age;
    private String state;

}
