package com.example.spring2jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="emptab")
public class Database{
    @Id
    private Integer empid;
    private String empname;
    private double empsal;
}