package com.samayoa.mortgage_project.repository;
import com.samayoa.mortgage_project.model.Loan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoanRepository extends MongoRepository<Loan, String>{
}
