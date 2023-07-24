package com.example.spring2jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="emptab")
public class Employee{
    @Id
    @Column
    private Integer empid;
    @Column
    private String empname;
    @Column
    private double empsal;
}