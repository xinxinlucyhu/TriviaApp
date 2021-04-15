package com.tts.trivia;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.validation.Valid;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.client.RestTemplate;

@Service
public class TriviaService
{
    
    
    public List<TriviaResult> addCategory(String category)
    {  
        System.out.println("Category: " + category);
        String url = "https://opentdb.com/api.php?amount=50";

        RestTemplate restTemplate = new RestTemplate();

        TriviaApiResponse response = restTemplate.getForObject(url, TriviaApiResponse.class);
        List<TriviaResult> sameCategoryResult= new ArrayList<>();
        
        for(int i=0; i<response.getResults().size(); i++) {
            
            TriviaResult obj=response.getResults().get(i);   
            System.out.println("  Looking at a obj with category " + obj.getCategory());
            if(obj.getCategory().equals(category)) {
      
               sameCategoryResult.add(obj);
            }            
        }
       return sameCategoryResult;
    }
    
    
   
    

    
    public void addDifficulty(String difficulty)
    {

        String url = "https://opentdb.com/api.php?amount=10";

        RestTemplate restTemplate = new RestTemplate();

        TriviaApiResponse results = restTemplate.getForObject(url, TriviaApiResponse.class);

        difficulty = results.getResults().get(0).getDifficulty();

    }

    
    public void addType(String type)
    {

        String url = "https://opentdb.com/api.php?amount=10";

        RestTemplate restTemplate = new RestTemplate();

        TriviaApiResponse results = restTemplate.getForObject(url, TriviaApiResponse.class);

        type = results.getResults().get(0).getType();

    }
    
    public String getAnswer() {
        
        String url = "https://opentdb.com/api.php?amount=30";

        RestTemplate restTemplate = new RestTemplate();

        TriviaApiResponse results = restTemplate.getForObject(url, TriviaApiResponse.class);
        
        String  correctAnswer=results.getResults().get(0).getCorrect_answer() ;
           
        return correctAnswer;
        
        
        
        
    }

}
