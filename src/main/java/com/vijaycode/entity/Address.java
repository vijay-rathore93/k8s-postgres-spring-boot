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
@Table(name="addressInfo_tbl")
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Serializable {

    public static final Long   SERILAVERSIONID=1234567890L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;
    @Column(name = "postalcode")
    private String postalCode;
    @Column(name = "state")
    private String state;
    @Column(name = "street")
    private String street;


}
