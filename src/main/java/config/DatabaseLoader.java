package config;
import com.samayoa.mortgage_project.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.samayoa.mortgage_project.model.Loan;
import com.samayoa.mortgage_project.repository.LoanRepository;
import java.util.Arrays;

@Component
public class DatabaseLoader implements CommandLineRunner{

    private final LoanRepository loanRepository;

    @Autowired
    public DatabaseLoader(LoanRepository loanRepository){
        this.loanRepository = loanRepository;
    }

    @Override
    public void run(String... strings) throws Exception{
        if(loanRepository.count()==0) {
            Loan firstHome = new Loan("First Home Mortgage", "For first-time homebuyers. This loan is for people looking to buy their first home with a down payment of only 3%.");
            Loan opportunityHome = new Loan("Home Affordable Mortgage", "This mortgage is intended for low and moderate income borrowers. This loan has a down payment as low as 3% and it has reduced mortgage insurance. You may qualify without a credit score");

            loanRepository.saveAll(Arrays.asList(firstHome, opportunityHome));
        }
    }

}
