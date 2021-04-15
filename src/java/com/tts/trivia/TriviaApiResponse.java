package com.tts.trivia;

import java.util.List;

import lombok.Data;

@Data
public class TriviaApiResponse
{
    private List<TriviaResult> results;
    private int response_code;
 
    
}
/*<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-security</artifactId>
</dependency>
<dependency>
            <groupId>org.thymeleaf.extras</groupId>
            <artifactId>thymeleaf-extras-springsecurity5</artifactId>
        </dependency>
<dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-test</artifactId>
            <scope>test</scope>
        </dependency>
*/