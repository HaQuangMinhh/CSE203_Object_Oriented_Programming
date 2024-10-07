/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

import java.util.ArrayList;
import static java.util.Collections.list;

/**
 *
 * @author Student
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Question1: "+new Question1(123456).sumFirstAndLastDigit());
        System.out.println("Question2: "+new Question2(12,51,5).MinNum());
        System.out.println("Question3: ");System.out.println(new Question3(5).HailStone());
        System.out.println("Question4: ");System.out.println(new Question4(5).SumEven());    
        System.out.println("Question5: ");
        
        Question5 list = new Question5(null);
        list.inputList();
        list.deleteFirst(5);System.out.println("a"+list.getList());
        list.replaceElement(1, 07);System.out.println("b"+list.getList());
        list.duplicateFinder();System.out.println("c"+list.getList());
        list.duplicateDeleter();System.out.println("d"+list.getList());
        
        System.out.println("Question6: ");
        System.out.println("a: "+new Question6("Khang","Duy").length());
        System.out.println("b: "+new Question6("Kh9ng NDhkjsd kdsj","Duy").Count());
        
        Question6 q6 = new Question6("KaK", "abdh");
        q6.Connect();
        System.out.println("d-IsPalindrome: "+q6.palindrome());
    }

   
}
