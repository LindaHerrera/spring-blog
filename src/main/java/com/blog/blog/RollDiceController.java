package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

import java.util.Random;

@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String returnRollDice(){
        return "roll-dice";
    }


    @GetMapping("/roll-dice/{num}")
    public String returnResults(@PathVariable int num, Model model){
        model.addAttribute("answer", generateRandomNum());
        model.addAttribute("userGuess", num);
        return "roll-results";
    }

    public int generateRandomNum(){
        Random random = new Random();
        return random.nextInt((6-1) +1) +1;

    }

}
