package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.demo.DiceRollLogRepository;

@Service
public class DiceRollService {

    private final Dice dice = new Dice();

    @Autowired
    private DiceRollLogRepository diceRollLogRepository;

    private final Random random = new Random();

    public DiceRollLog rollDices(int diceCount) {
        List<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < diceCount; i++) {
            rolls.add(dice.roll());
        }
        DiceRollLog log = new DiceRollLog(diceCount, rolls, LocalDateTime.now());
        this.diceRollLogRepository.save(log);

        return log;
    }

    /*
    public List<DiceRollLog> getDiceRollLogs() {
    }
     */
}
