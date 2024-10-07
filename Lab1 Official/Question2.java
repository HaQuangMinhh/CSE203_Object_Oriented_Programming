package lab1;

import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Question2 {
    private int num1;
    private int num2;
    private int num3;
public Question2(){}
public Question2(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
public int MinNum(){
    int temp=Math.min(num1, num2);
    int Min= Math.min(temp, num3);
   return Min;
}
}
