package com.vijaycode.controller;

import com.vijaycode.entity.UserBasicInfo;
import com.vijaycode.model.ResponseDTO;
import com.vijaycode.model.UserBasicInfoDTO;
import com.vijaycode.service.UserService;
import com.vijaycode.utility.Constants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(Constants.USER_PATH)
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<ResponseDTO> createUserInfo(@RequestBody UserBasicInfoDTO userBasicInfo){
        ResponseDTO response= userService.createUserInfo(userBasicInfo);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("{userId}")
    public ResponseEntity<UserBasicInfo> getUserInfo(@PathVariable("userId") Integer userId){
        UserBasicInfo response= userService.getUserInfo(userId);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<UserBasicInfo>> getAllUserInfo(@RequestParam(name = "pageNo",defaultValue = "0") Integer pageNo,
                                                           @RequestParam(name = "pageSize",defaultValue = "10") Integer pageSize){
        List<UserBasicInfo> response= userService.getAllUserInfo(pageNo,pageSize);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


}
