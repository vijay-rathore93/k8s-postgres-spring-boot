package com.vijaycode.service;

import com.vijaycode.entity.UserBasicInfo;
import com.vijaycode.model.ResponseDTO;
import com.vijaycode.model.UserBasicInfoDTO;

import java.util.List;

public interface UserService {
    ResponseDTO createUserInfo(UserBasicInfoDTO userBasicInfo);

    UserBasicInfo getUserInfo(Integer userId);

    List<UserBasicInfo> getAllUserInfo(Integer pageNo, Integer pageSize);
}
