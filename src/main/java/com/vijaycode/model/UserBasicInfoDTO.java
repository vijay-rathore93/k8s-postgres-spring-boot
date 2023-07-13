package com.vijaycode.model;

import com.vijaycode.entity.Address;
import com.vijaycode.entity.UserLoginInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserBasicInfoDTO {
    private Integer id;


    private String fullName;
    private String age;


    private Set<Address> addresses;
    private UserLoginInfoDTO userLoginInfo;

}
