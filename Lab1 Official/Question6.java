package lab1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Student
 */
public class Question6 {

    private String a, b;

    public Question6() {
    }

    public Question6(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public int length() {
        int n = a.length();

        return n;
    }
    public int Count(){
        
int countWords = a.split("\\s").length;
return countWords;
    }
    public String Connect() {
        String c = a + b;
        System.out.println("c: " + c);
        return c;
    }

    public boolean palindrome() {
        String rev = "";
        boolean palindrome = false;
        for (int i = a.length() - 1; i >= 0; i--) {
            rev = rev + a.charAt(i);
        }
        if (rev.equals(a)) {
            palindrome = true;
        }
        return palindrome;
    }

    // public int NumberOfWords(){
    //int m = 0;
    // }
}
