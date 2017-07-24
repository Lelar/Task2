package com.company;

public class Main {

    public static void main(String[] args) {
        ObjectV v = new ObjectV(1,2,3);
        ObjectV v2 = new ObjectV(5,6,2);
        ObjectV vResult = new ObjectV();
        v.subtractionV(v2,vResult);
        //System.out.print(vResult.setY());
        System.out.print(v.compositionV(v2));
    }
}
