package lab1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Question1 {
    
    private int number;
   
    public Question1(){}
    public Question1(int number) {
        this.number = number;
    }
   
   public int sumFirstAndLastDigit(){
       int LastDigit = number%10;
       int FirstDigit=number;
       while(FirstDigit >= 10){
           FirstDigit/=10;
       }
       int sum = LastDigit+FirstDigit;
       return sum;
   } 
    
}
