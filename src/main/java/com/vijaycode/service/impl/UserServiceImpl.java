package com.vijaycode.service.impl;

import com.vijaycode.entity.Role;
import com.vijaycode.entity.UserBasicInfo;
import com.vijaycode.entity.UserLoginInfo;
import com.vijaycode.exception.UserException;
import com.vijaycode.model.ResponseDTO;
import com.vijaycode.model.UserBasicInfoDTO;
import com.vijaycode.repo.RoleRepo;
import com.vijaycode.repo.UserRepo;
import com.vijaycode.service.UserService;
import jdk.jshell.spi.ExecutionControl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;


@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    private final ModelMapper modelMapper;

    private final RoleRepo roleRepo;

    @Override
    public ResponseDTO createUserInfo(UserBasicInfoDTO input) {
        UserBasicInfo userBasicInfo = modelMapper.map(input, UserBasicInfo.class);
        UserLoginInfo userLoginInfo = userBasicInfo.getUserLoginInfo();
        Role role = roleRepo.findByName(input.getUserLoginInfo().getRoleName());
        userLoginInfo.setRole(role);
        userBasicInfo.setUserLoginInfo(userLoginInfo);
        userRepo.save(userBasicInfo);
        return ResponseDTO.builder().message("Information has been saved!!").build();
    }

    @Override
    public UserBasicInfo getUserInfo(Integer userId) {
        return userRepo.findById(userId).orElseThrow(() -> new UserException("No Data found.."));
    }

    @Override
    public List<UserBasicInfo> getAllUserInfo(Integer pageNo, Integer pageSize) {
        Pageable page = PageRequest.of(pageNo, pageSize);
        return userRepo.findAll(page).stream().toList();
    }
}
