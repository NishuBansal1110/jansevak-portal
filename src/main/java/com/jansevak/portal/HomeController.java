package com.jansevak.portal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.jansevak.portal.UserRepository;

import jakarta.servlet.http.HttpSession;

import org.springframework.ui.Model;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
private SchemeRepository schemeRepository;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/schemes")
public String showSchemes(Model model){

    List<Scheme> schemes = schemeRepository.findAll();

    schemes.removeIf(s -> s.getCategory().equalsIgnoreCase("scholarship"));

    model.addAttribute("schemes", schemes);

    return "schemes";
}


   @GetMapping("/scholarships")
public String showScholarships(Model model){

    List<Scheme> scholarships = schemeRepository.findByCategory("scholarship");

    model.addAttribute("schemes", scholarships);

    return "scholarships";
}
@GetMapping("/category/farmer")
public String showFarmerSchemes(Model model) {

    List<Scheme> schemes = schemeRepository.findByCategory("farmer");

    model.addAttribute("schemes", schemes);

    return "schemes";
}

@GetMapping("/category/women")
public String showWomenSchemes(Model model) {

    List<Scheme> schemes = schemeRepository.findByCategory("women");

    model.addAttribute("schemes", schemes);

    return "schemes";

}
@GetMapping("/category/student")
public String showStudentScholarships(Model model) {

    List<Scheme> schemes = schemeRepository.findByCategory("student");

    model.addAttribute("schemes", schemes);

    return "schemes";
}
@GetMapping("/category/senior")
public String showPensionSchemes(Model model) {

    List<Scheme> schemes = schemeRepository.findByCategory("senior");

    model.addAttribute("schemes", schemes);

    return "schemes";
}
@GetMapping("/category/youth")
public String showEmploymentSchemes(Model model) {

    List<Scheme> schemes = schemeRepository.findByCategory("youth");

    model.addAttribute("schemes", schemes);

    return "schemes";
}@GetMapping("/category/minority")
public String showMinoritySchemes(Model model) {

    List<Scheme> schemes = schemeRepository.findByCategory("minority");

    model.addAttribute("schemes", schemes);

    return "schemes";
}@Autowired
private UserRepository userRepository;
@GetMapping("/login")
public String loginPage() {
    return "login";
}
@GetMapping("/loginUser")
public String showLoginPage() {
    return "login";
}

@PostMapping("/loginUser")
public String loginUser(@RequestParam String email,
                        @RequestParam String password,
                        HttpSession session,
                        Model model) {

    if(email.equals("admin@gmail.com") && password.equals("12345")){

        session.setAttribute("admin", "Admin");  // 👈 store admin

        return "redirect:/";
    } else {
        model.addAttribute("error", "Invalid Credentials ❌");
        return "login";
    }
}
@GetMapping("/logout")
public String logout(HttpSession session){
    session.invalidate();
    return "redirect:/";
}
@GetMapping("/services")
public String services(){
    return "services";
}

@GetMapping("/contact")
public String contact(){
    return "contact";
}

@PostMapping("/sendMessage")
public String sendMessage(Model model){

model.addAttribute("success",
"Message sent successfully. We will contact you soon. Thank you!");

return "contact";

}
@GetMapping("/schemeFinder")
public String schemeFinder(){
return "schemeFinder";
}
@GetMapping("/cities")
public String citiesPage() {
    return "cities";
}

@GetMapping("/scholarshipFinder")
public String scholarshipFinder(){
return "scholarshipFinder";
}

@GetMapping("/eligibilityInfo")
public String eligibilityInfo(){
return "eligibilityInfo";
}

@GetMapping("/governmentInfo")
public String governmentInfo(){
return "governmentInfo";
}
}