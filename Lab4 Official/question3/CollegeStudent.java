/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class CollegeStudent extends Student {

    private double graduationExamScores;

    public double getGraduationExamScores() {
        return graduationExamScores;
    }

    public void setGraduationExamScores(double graduationExamScores) {
        this.graduationExamScores = graduationExamScores;
    }

    public CollegeStudent(double graduationExamScores, String studentNumber, String fullName, int credits, double avgScore) {
        super(studentNumber, fullName, credits, avgScore);
        this.graduationExamScores = graduationExamScores;
    }

    public CollegeStudent(double graduationExamScores) {
        this.graduationExamScores = graduationExamScores;
    }

    public CollegeStudent() {
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Graduation Exam Score: ");
        graduationExamScores = sc.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.print("-Graduation Exam Score: " + graduationExamScores);
    }

    @Override
    public boolean graduation() {
        super.getCredits();
        super.getAvgScore();
        if (getCredits() >= 100 && getAvgScore() >= 5 && graduationExamScores >= 5) {
            return true;
        }
        return false;
    }
}
