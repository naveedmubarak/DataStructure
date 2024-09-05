/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructurelab1;

/**
 *
 * @author ESHOP
 */
public class ex_3_task1 {
             public static void main(String[]args){
        int array[]=new int[5];
        array[0]=8;
        array[1]=16;
        array[2]=24;
        array[3]=32;
         array[4]=40;
      int deleteindex=2;
      
      for(int i=deleteindex; i<array.length-1;i++){
          array[i]=array[i+1];
      }
      array[array.length-1]=0;
      
             for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
}
             }     
}
