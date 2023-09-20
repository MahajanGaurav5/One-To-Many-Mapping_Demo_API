package com.mapping.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="jpa_student")
public class Student
{
    @Id
    private int stdId;
    private String studentName;
    private String about;


//    @OneToMany(mappedBy = "Student", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    private List<Address> address = new ArrayList<>();

    @OneToMany(mappedBy = "Student",fetch = FetchType.LAZY,cascade =CascadeType.ALL)
    private List<Address> address;

}
