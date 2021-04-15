package com.tts.trivia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class TriviaController
{
    @Autowired
    private TriviaService triviaService;
  
    @GetMapping("/")
    public String getDefaultPage(Model model)
    {
        model.addAttribute("menuInput", new UserInput());
        return "menu";
    }

    @PostMapping("/category")
    public String getCategory(UserInput userInput, Model model)
    {   
        model.addAttribute("userAnswer", new UserInput());

        model.addAttribute("triviaQuestions", triviaService.addCategory(userInput.getCategory()));
        return "question";
       
    }
    
  

   /* @PostMapping("/difficulty")
    public String getDifficulty(String difficulty, Model model)
    {
        triviaService.addDifficulty(difficulty);
        model.addAttribute(difficulty);
        return "index.html";
    }

    @PostMapping("/type")
    public String getType(String type, Model model)
    {
        triviaService.addType(type);
        model.addAttribute(type);
        return "index.html";
    }
    */
  }
