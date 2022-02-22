package com.example.SimpleInterest.Service;

import com.example.SimpleInterest.Exception.InterestVariableNotFound;
import com.example.SimpleInterest.Exception.InterestVariableSetZero;
import com.example.SimpleInterest.Exception.MissingInterestVariable;
import com.example.SimpleInterest.ModelDAO.InterestVariable;
import com.example.SimpleInterest.Repository.SimpleInterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimpleInterestService {

    @Autowired
    SimpleInterestRepository simpleInterestRepository;

    public Long calculateSimpleInterest(InterestVariable interestVariable) throws InterestVariableSetZero, MissingInterestVariable {
        InterestVariable interestVariable1 = new InterestVariable();

        Long principal = interestVariable.getPrincipal();
        Long rateOfInterest = interestVariable.getRateOfInterest();
        Long duration = interestVariable.getDuration();

        if (principal == null || rateOfInterest == null || duration == null) {
            throw new MissingInterestVariable();
        } else if (principal == 0 || rateOfInterest == 0 || duration == 0) {
            throw new InterestVariableSetZero();
        } else {
            interestVariable1.setPrincipal(principal);
            interestVariable1.setRateOfInterest(rateOfInterest);
            interestVariable1.setDuration(duration);
        }

        Long simpleInterest = (principal * rateOfInterest * duration / 100);
        interestVariable1.setSimpleInterest(simpleInterest);

        Long totalAmount = simpleInterest + principal;
        interestVariable1.setTotalAmount(totalAmount);

        simpleInterestRepository.save(interestVariable1);

        return simpleInterest;
    }

    public InterestVariable getInterestVariableClass(Long id) throws InterestVariableNotFound {
        if (!simpleInterestRepository.findById(id).isPresent()) {
            throw new InterestVariableNotFound();
        } else {
            InterestVariable interestVariable = simpleInterestRepository.findById(id).get();
            return interestVariable;
        }
    }

    public List<InterestVariable> getAllInterestVariableClass() throws InterestVariableNotFound {
        List<InterestVariable> interestVariables;

        if (simpleInterestRepository.findAll().isEmpty()) {
            throw new InterestVariableNotFound();
        } else {
            interestVariables = simpleInterestRepository.findAll();
        }
        return interestVariables;
    }
}
