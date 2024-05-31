package com.jeshwanth;

public class RequiredInfo {
    private double weight;
    private double height;

    RequiredInfo(double weight,double height){
        this.weight = weight;
        this.height = height;
    }

    private double BMIScore(){
        return this.weight /this.height *this.height;
    }

     void BMI(){
        if (BMIScore() > 24.9) {
            System.out.println("You're BMi score is " + BMIScore() + "\n You're obese");
        }
         else if(BMIScore() < 18.5){
            System.out.println("You're BMi score is "+BMIScore()+"\n You should put on some weight");
        }
        else{
            System.out.println("You're BMi score is "+BMIScore()+"\n You're in healthy range");
        }
    }
}
