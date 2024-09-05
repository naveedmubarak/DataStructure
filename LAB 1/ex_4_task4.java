/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructurelab1;

/**
 *
 * @author ESHOP
 */
public class ex_4_task4 {
             public static void main(String[]args){
        int array[]=new int[6];
        array[0]=4;
        array[1]=6;
        array[2]=2;
        array[3]=8;
         array[4]=10;
         
         int foundn=8;
    boolean found=false;
    for(int i=0; i<array.length;i++){
        if(array[i]==foundn){
            System.out.println("element" +array[i]+"found at index" +i);
        }
}
             if(found==false){
            System.out.println("element not found");
}
}
}
