package com.codefoe.bootstrap;

import com.codefoe.model.Student;
import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;

public class DataGenerator {
    private static Faker faker = new Faker();
    public static List<Student> createStudent(){
        List<Student> students = List.of(
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,79), faker.address().state()),
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,79), faker.address().state()),
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,79), faker.address().state()),
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,79), faker.address().state()),
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,79), faker.address().state()),
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,79), faker.address().state()),
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,79), faker.address().state()),
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,79), faker.address().state())
        );
        return students;
    }
}
