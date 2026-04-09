package com.jansevak.portal;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.ArrayList;


@Controller
public class EligibilityController {
      @Autowired
    private EligibilityRepository repository;
    @Autowired
private SchemeRepository schemeRepository;

    @GetMapping("/elegibilty")
    public String showForm() {
        return "elegibilty";
    }


    @PostMapping("/check")
    public String checkEligibility(
            @RequestParam String name,
            @RequestParam Integer age,
            @RequestParam Integer income,
            @RequestParam String student,
            @RequestParam (required = false)String category,
@RequestParam (required = false)String state,
            

            Model model) {
    
        if (name == null || age == null || income == null || student == null) {
            model.addAttribute("result", "All fields are required!");
            return "result";
        }
    
        Eligibility e = new Eligibility();
        e.setName(name);
        e.setAge(age);
        e.setIncome(income);
        e.setStudent(student);
    
        repository.save(e);
    
        List<Scheme> allSchemes = schemeRepository.findAll();
        List<Scheme> eligibleSchemes = new ArrayList<>();
        
        for (Scheme scheme : allSchemes) {
        
            boolean ageMatch = age >= scheme.getMinAge();
boolean incomeMatch = income <= scheme.getMaxIncome();

boolean studentMatch =
        "no".equalsIgnoreCase(scheme.getStudentRequired()) ||
        (student != null && scheme.getStudentRequired().equalsIgnoreCase(student));

boolean categoryMatch =
        scheme.getCategory().equalsIgnoreCase("general") ||
        scheme.getCategory().equalsIgnoreCase(category) ||
        scheme.getCategory().equalsIgnoreCase("student");

boolean stateMatch = scheme.getState().equalsIgnoreCase(state);

if (ageMatch && incomeMatch && categoryMatch && stateMatch && studentMatch) {
    eligibleSchemes.add(scheme);
}
        }
        
        model.addAttribute("schemes", eligibleSchemes);
        model.addAttribute("name", name);
        
        return "result";
    }
}