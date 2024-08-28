package com.samayoa.mortgage_project.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Loan {
    @Id
    private String id;
    private String loanType;
    private String description;

    //contructors, getters, and setters
}
