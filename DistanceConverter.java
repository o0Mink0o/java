package com.plagahoa22.hgjj.helpers;

public class DistanceConverter {
    public static double kmIoMiles(double km){
        double miles = km/1.6;
        return miles;
    }
    public static double milesToKm(double miles){
        return miles *1.6;
    }
}
