package com.company;

public class Complex {
    private double im, re;
    public Complex(double re,double im){
        this.im = im; this.re = re;
    }

    public void getComplexDouble(double re,double im){
        this.im = im;
        this.re = re;
    }
    public void getComplexInt(int re,int im){
        this.im = im;
        this.re = re;
    }
    public String compositionComplexDouble(double re,double im){
        return (this.re *re - this.im *im) + " + " + (this.re *im + this.im *re) + "i";
    }
    public String compositionComplexInt(int re,int im){
        if ((this.re - (int)this.re) + (this.im - (int)this.im) == 0)
            return ((int)this.re*re - (int)this.im*im) + " + " + ((int)this.re*im + (int)this.im*re) + "i";
        else return "Данные 1-го числа не целые";
    }
    public String additionComplexDouble(double re,double im){
        return (this.re + re) + " + " + (this.im + im) + "i";
    }
    public String additionComplexInt(int re,int im) {
        if ((this.re - (int)this.re) + (this.im - (int)this.im) == 0)
            return ((int)this.re + re) + " + " + ((int)this.im + im) + "i";
        else return "Данные 1-го числа не целые";
    }
    public String subtractionComplexDouble(double re, double im){
        return (this.re - re) + " + " + (this.im - im) + "i";
    }
    public String subtractionComplexInt(int re,int im) {
        if ((this.re - (int)this.re) + (this.im - (int)this.im) == 0)
            return ((int)this.re - re) + " + " + ((int)this.im - im) + "i";
        else return "Данные 1-го числа не целые";
    }
}