package com.samayoa.mortgage_project.service;
import com.samayoa.mortgage_project.model.Loan;
import com.samayoa.mortgage_project.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LoanService {
    @Autowired
    private LoanRepository loanRepository;

    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }
}
