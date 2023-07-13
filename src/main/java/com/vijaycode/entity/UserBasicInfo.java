package com.vijaycode.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@Builder
@Entity
@Table(name = "userBasicInfo_tbl")
@NoArgsConstructor
@AllArgsConstructor
public class UserBasicInfo implements Serializable {

    public static final Long SERIAl_VERSION_UID = 1234567890L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", initialValue = 1000)
    private Integer id;


    @NotEmpty(message = "Full name not found")
    private String fullName;
    private String age;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_address_table",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "address_id")}
    )
    private Set<Address> addresses;

    @JoinColumn(name = "user_user_login_relation")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private UserLoginInfo userLoginInfo;

}
