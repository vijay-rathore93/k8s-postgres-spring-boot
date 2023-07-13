package com.vijaycode.controller;

import com.vijaycode.service.RoleService;
import com.vijaycode.utility.Constants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController()
@RequiredArgsConstructor
@RequestMapping(Constants.ROLE_PATH)
public class RoleController {

    private final RoleService roleService;






}
