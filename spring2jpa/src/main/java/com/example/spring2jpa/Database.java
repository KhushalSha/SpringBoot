package com.example.spring2jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="emptab")
public class Database{
    @Id
    @Column
    private Integer empid;
    @Column
    private String empname;
    @Column
    private double empsal;
}