package pro.sky.homework2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework2.calculator.service.CalculatorService;

@RestController
@RequestMapping(path= "/calculator")
public class CalculatorController {
    private final CalculatorService service;


    public CalculatorController(CalculatorService service) {
        this.service=service;
    }
    @GetMapping
    public String calculator() {
        return service.calculator();
    }
    @GetMapping (path= "/plus")
    public String plusCalculator (@RequestParam(value = "num1", required = false) Integer num1,
                                  @RequestParam (value = "num2", required = false) Integer num2)
    {
        return service.plusCalculator(num1, num2);
    }
    @GetMapping (path= "/minus")
    public String minusCalculator (@RequestParam (value = "num1", required = false) Integer num1,
                                   @RequestParam (value = "num2", required = false) Integer num2){
        return service.minusCalculator(num1, num2);
    }
    @GetMapping (path= "/multiply")
    public String multiplyCalculator (@RequestParam (value = "num1", required = false) Integer num1,
                                      @RequestParam (value = "num2", required = false) Integer num2) {
        return service.multiplyCalculator(num1, num2);
    }
    @GetMapping (path= "/divide")
    public String divideCalculator (@RequestParam (value = "num1", required = false) Integer num1,
                                    @RequestParam (value = "num2", required = false) Integer num2) {
        return service.divideCalculator(num1, num2);
    }

}
