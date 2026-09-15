package com.tech.operators.condstatments;

public class nestedifcond {
    public static void main(String[] args){
        boolean flower=true;
        boolean color=true;
        System.out.println("program start here");
        if(flower=true){
            if(color=true){
                System.out.println("these flower and color is red");
            }
            else{
                System.out.println("these flower but color is not red");
            }
        }
    }
}
