package com.vijaycode.model;

import com.vijaycode.entity.Role;
import com.vijaycode.entity.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginInfoDTO {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Long contact;
    private RoleEnum roleName;

}
