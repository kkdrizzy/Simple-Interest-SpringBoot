package com.example.SimpleInterest.Controller;

import com.example.SimpleInterest.Exception.InterestVariableNotFound;
import com.example.SimpleInterest.Exception.InterestVariableSetZero;
import com.example.SimpleInterest.Exception.MissingInterestVariable;
import com.example.SimpleInterest.ModelDAO.InterestVariable;
import com.example.SimpleInterest.Service.SimpleInterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class SimpleInterestController {

    @Autowired
    SimpleInterestService simpleInterestService;

    @PostMapping("/calculate")
    public Long calculateSimpleInterest(@RequestBody InterestVariable interestVariable) throws InterestVariableSetZero, MissingInterestVariable {
        return simpleInterestService.calculateSimpleInterest(interestVariable);
    }

    @GetMapping("/simple-interest/{id}")
    public InterestVariable getInterestVariableClass(@PathVariable("id") Long id) throws InterestVariableNotFound {
        return simpleInterestService.getInterestVariableClass(id);
    }

    @GetMapping("/simple-interests")
    public List<InterestVariable> getAllInterestVariableClass() throws InterestVariableNotFound {
        return simpleInterestService.getAllInterestVariableClass();
    }

    @DeleteMapping("/simple-interest/{id}")
    public void deleteInterestVariableById(@PathVariable("id") Long id) throws InterestVariableNotFound {
        simpleInterestService.deleteInterestVariableById(id);
    }
}
