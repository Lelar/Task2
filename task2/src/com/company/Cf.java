package com.company;


public class Cf {
    private String surname,name,pos;
    private Double pay;

    public Cf(String name,String surname,String pos, double pay  ){
         this.name = name;this.surname = surname;this.pos = pos;this.pay = pay;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setPos(String pos) {
        this.pos = pos;
    }
    public void setPay(Double pay) {
        this.pay = pay;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPos(){
        return pos;
    }
    public Double getPay(){
        return pay;
    }

}


