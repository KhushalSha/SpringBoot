package com.springbootfirstapplication.springboot;




public class Temp {
    private String temp1;
    private String temp2;
    
    public String getTemp1() {
        return temp1;
    }
    public void setTemp1(String temp1) {
        this.temp1 = temp1;
    }
    public String getTemp2() {
        return temp2;
    }
    public void setTemp2(String temp2) {
        this.temp2 = temp2;
    }
    @Override
    public String toString() {
        return "Temp [temp1=" + temp1 + ", temp2=" + temp2 + "]";
    }


}
