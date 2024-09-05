/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructurelab1;

/**
 *
 * @author ESHOP
 */
public class ex_2_task2 {
         public static void main(String[]args){
        int array[]=new int[6];
        array[0]=100;
        array[1]=200;
        array[2]=300;
        array[3]=400;
        array[4]=500;
     
        
        int ne=250;
        int position=2;
        
        for(int i=array.length-1; i>position; i--){
       array[i]=array[i-1];
        }
        array[position]=ne;
      for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
}
                 
}}
