package com.vijaycode.controller;

import com.vijaycode.model.ResponseDTO;
import com.vijaycode.utility.Constants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(Constants.HEALTH_PATH)
public class HealthController {

    @GetMapping("/")
    public ResponseDTO getMessage(){
        return  ResponseDTO
                .builder()
                .message("Congratulation....Application id up and running perfectly....")
                .build();
    }
}
