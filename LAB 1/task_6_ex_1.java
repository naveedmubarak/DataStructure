/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructurelab1;

/**
 *
 * @author ESHOP
 */
public class task_6_ex_1 {
    public static void main(String args[]){
 String text ="racecar";
 boolean check=false;
 int left =0, right=text.length()-1;
  for(int i= 0; i<text.length(); i++){
      
    if(text.charAt(left)==text.charAt(right)){
      check=true;
      left++; right--;
      
  }else{
            check=false;
            break;  
            }
          }
if(check){
    System.out.println("palindrome");
}
else{
    System.out.println("not palindrome");
}
    }
}