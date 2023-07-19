package com.springbootfirstapplication.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("data")
public class Data {


    @Value("22")
    private int empid;

    @Override
        public String toString() {
            
            return " id is " + empid;
        }
}
