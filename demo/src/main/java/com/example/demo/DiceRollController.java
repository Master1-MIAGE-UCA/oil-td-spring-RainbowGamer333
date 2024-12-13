package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class DiceRollController {
    private final Random random = new Random();


    private final DiceRollService service = new DiceRollService();

    @GetMapping("/rollDice")
    public DiceRollLog rollSingleDice() {
        return service.rollDices(1);
    }

    @GetMapping("/rollDices/{X}")
    public DiceRollLog rollMultipleDices(@PathVariable int X) {
        return service.rollDices(X);
    }
}
