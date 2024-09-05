/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructurelab1;

/**
 *
 * @author ESHOP
 */
public class task3 {
           public static void main(String[]args){
        int array[]=new int[6];
        array[0]=12;
        array[1]=24;
        array[2]=36;
        array[3]=48;
        array[4]=60;
        array[5]=0;
        for(int i=array.length-1; i>0; i--){
       array[i]=array[i-1];
        }
        array[0]=6;
          for(int i=0; i<array.length; i++){
              System.out.println(array[i]);
          }
           }
}
