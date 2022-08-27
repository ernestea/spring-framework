package com.codefoe;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public class Person {
    private String name;

    private Car car;
}
