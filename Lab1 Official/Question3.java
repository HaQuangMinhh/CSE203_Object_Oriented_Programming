package lab1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Question3 {
    private int number;
    public Question3(int number) {
        this.number = number;
    }
    public Question3() {}
    public int HailStone(){
       do{ 
            if(number%2==0){
                System.out.print(number);
                number/=2;
                System.out.println(" is an even, so we take n/2: "+number);
                
            }else{
             System.out.print(number);
                number=number*3+1;
            System.out.println(" is an odd, so we take n*3+1: "+number);}
                  
        }while(number >1);
       return number;
    }

}
