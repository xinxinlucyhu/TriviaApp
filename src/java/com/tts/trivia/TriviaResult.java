package com.tts.trivia;

import java.util.List;

import lombok.Data;

@Data
public class TriviaResult
{
    private String category;
    private String type;
    private String difficulty;
    private String question;
    private String correct_answer;
    private List<String> incorrect_answers;
}
