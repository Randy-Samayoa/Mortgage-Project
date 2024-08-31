package com.samayoa.mortgage_project.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Loan {
    @Id
    private String id;
    private String loanType;
    private String description;

    public Loan(String loanType, String description){
        this.loanType = loanType;
        this.description = description;
    }

    //constructors, getters, and setters
}
