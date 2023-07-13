package com.vijaycode.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@Entity
@Table(name="userLoginInfo_tbl")
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginInfo implements Serializable {

    public static final Long SERIAl_VERSION_UID  = 1234567890L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_login_seq")
    @SequenceGenerator(name ="user_login_seq" ,sequenceName = "user_login_seq" ,initialValue = 2000)
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Long contact;

    private boolean isActive;
    @JoinColumn(name = "user_role_relation")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Role role;
}
