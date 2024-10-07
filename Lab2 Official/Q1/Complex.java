/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Complex {
    private double re;
    private double im;
    public double getRe() {
        return re;
    }
    public void setRe(double re) {
        this.re = re;
    }
    public double getIm() {
        return im;
    }
    public void setIm(double im) {
        this.im = im;
    }
    
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
    public Complex() {
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter re: ");
        re = sc.nextDouble();
        System.out.print("Enter im: ");
        im = sc.nextDouble();
    }
    public void output() {
        System.out.println(re+" +"+im+"i");
    }
    public Complex addition(Complex c1){
    double resultRe = this.re+c1.getRe();
    double resultIm = this.im+c1.getIm();
    return new Complex(resultRe, resultIm);
    }
     public Complex subtraction(Complex c1){
     double resultRe = this.re-c1.getRe();
    double resultIm = this.im-c1.getIm();
    return new Complex(resultRe, resultIm);
    }
    public Complex multiplication(Complex c1){
     double resultRe = this.re*c1.getRe();
    double resultIm = this.im*c1.getIm();
    return new Complex(resultRe, resultIm);
    }
    public Complex division(Complex c1){
     double resultRe = this.re/c1.getRe();
    double resultIm = this.im/c1.getIm();
    return new Complex(resultRe, resultIm);
    }
    
}
