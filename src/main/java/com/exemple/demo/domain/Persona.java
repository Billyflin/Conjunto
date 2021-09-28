package com.exemple.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "User")
@Data
@NoArgsConstructor
public class Persona {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long ID;
    @NotBlank
    @Column(nullable=false,length = 50)
    private String name;
    @Email
    @Column(nullable=false,length = 50,unique = true)
    private String email;
    @Column(updatable=false)
    private String date;
    @Column(nullable=false,length=15,unique = true)
    private String keyword;
    @Column(nullable=false)
    private Integer age;
}
