/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question1;

/**
 *
 * @author Student
 */
public class main1 {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1.input();c2.input();
        System.out.println("Complex 1: ");c1.output();
        System.out.println("Complex 2: ");c2.output();
        System.out.println("Addition: "); c1.addition(c2).output();
        System.out.println("Subtraction: "); c1.subtraction(c2).output();
        System.out.println("Multiplication: "); c1.multiplication(c2).output();
        System.out.println("Division: "); c1.division(c2).output();
        
    }
}
