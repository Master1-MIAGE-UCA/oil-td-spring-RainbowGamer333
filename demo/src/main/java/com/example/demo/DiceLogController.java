package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DiceLogController {

    @Autowired
    private DiceRollService diceRollService;

    /*
    @GetMapping("/diceLogs")
    public List<DiceRollLog> getAllDiceLogs() {
        return diceRollService.getDiceRollLogs();
    }
     */
}
