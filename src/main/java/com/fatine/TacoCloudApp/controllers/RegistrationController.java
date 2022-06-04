/*package com.fatine.TacoCloudApp.controllers;

import com.fatine.TacoCloudApp.repositories.UserRepository;
import com.fatine.TacoCloudApp.security.RegistrationForm;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/register")
public class RegistrationController {

    PasswordEncoder passwordEncoder;
    UserRepository userRepository;

    public RegistrationController(PasswordEncoder passwordEncoder, UserRepository userRepository){
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    @GetMapping
    public String registerForm(){
        return "registration";
    }

    public String processRegistration(RegistrationForm form){

        userRepository.save(form.toUser(passwordEncoder));
        return "redirect:/login";
    }
}*/
