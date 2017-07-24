package com.company;


public class ObjectV {
    private double x, y, z;

    public ObjectV(){
    }

    public ObjectV(double x, double y, double z){
        this.x = x;this.y = y; this.z = z;
    }
    public void getX(double x){
        this.x = x;
    }
    public void getY(double y){
        this.y = y;
    }
    public void getZ(double z){
        this.z = z;
    }

    public double setX(){
        return x;
    }
    public double setY(){
        return y;
    }
    public double setZ(){
        return z;
    }

    public void additionV(ObjectV v, ObjectV result ) {
        result.getX(this.x + v.x); result.getY(this.y + v.y); result.getZ(this.z + v.z);
    }
    public void subtractionV(ObjectV v, ObjectV result ) {
        result.getX(this.x - v.x); result.getY(this.y - v.y); result.getZ(this.z - v.z);
    }
    public double compositionV(ObjectV v) {
       return (this.x*v.x + this.y*v.y + this.z*v.z);
    }
}
