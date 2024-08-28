package com.samayoa.mortgage_project.controller;
import com.samayoa.mortgage_project.model.Loan;
import com.samayoa.mortgage_project.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/loans")
public class LoanController {
    @Autowired
    private LoanService loanService;

    @GetMapping
    public List<Loan> getLoans(){
        return loanService.getAllLoans();
    }
}
