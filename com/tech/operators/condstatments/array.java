package com.tech.operators.condstatments;


public class array {
    public static void main(String[] args) {

     int[][] i = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
     };

     for(int j = 0; j<i.length; j++){

        int[] singlerow = i[j];

        for(int k = 0; k<singlerow.length;k++){
            System.out.print(singlerow[k] + " ");
        }
        System.out.println();
     }

    }

}
