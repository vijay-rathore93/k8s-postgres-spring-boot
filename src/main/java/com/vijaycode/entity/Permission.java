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
@Table(name="permission_tbl")
@NoArgsConstructor
@AllArgsConstructor
public class Permission implements Serializable {

    public static final Long SERIAl_VERSION_UID = 1234567899L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "permission_seq")
    @SequenceGenerator(name ="permission_seq" ,sequenceName = "permission_seq" ,initialValue = 4000)
    private Integer roleId;
    @NotEmpty(message = "Permission name not found..")
    private String name;

    private String description;

}
