package com.SpringApplication.SpringCalculator.controllers;

import com.SpringApplication.SpringCalculator.models.CalculatorDTO;
import com.SpringApplication.SpringCalculator.models.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;
    @GetMapping
    public String renderCalculator(@ModelAttribute CalculatorDTO calculatorDTO){return "calculator";}
    @PostMapping
    public String calculate(@ModelAttribute CalculatorDTO calculatorDTO, Model model){
        float calculatorResult = calculatorService.calculate(calculatorDTO);
        model.addAttribute("calculatorResult", calculatorResult);
        return "result";
    }
    @ExceptionHandler(IllegalAccessError.class)
    public String handleIllegalArgumentException(){
        return "invalid-form";
    }
}
