package com.mapping.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="jpa_address")
public class Address
{
    @Id
    private int address_id;
    private String street_code;
    private String city;
    private String country;

//    @ManyToOne
//    @JoinColumn(name="stdId")
//    private Student student;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "stdId")
    private Student Student;
}
