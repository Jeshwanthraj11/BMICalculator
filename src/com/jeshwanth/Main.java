package com.jeshwanth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in kilograms");
        double weight = sc.nextDouble();
        System.out.println("Enter height in meters");
        double height = sc.nextDouble();

        RequiredInfo info = new RequiredInfo(weight,height);
        info.BMI();


    }
}
