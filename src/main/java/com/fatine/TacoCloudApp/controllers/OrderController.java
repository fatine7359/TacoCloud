package com.fatine.TacoCloudApp.controllers;

import com.fatine.TacoCloudApp.models.TacoOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/current")
    public String showOrderForm(Model model){
        model.addAttribute("tacoOrder", new TacoOrder());
        return "orderForm";

    }

    @PostMapping
    public String processOrder(@Valid TacoOrder tacoOrder, Errors errors){

        if(errors.hasErrors()){
            return "orderForm";
        }
        log.info("order submitted: " + tacoOrder);
        return "redirect:/";
    }
}
