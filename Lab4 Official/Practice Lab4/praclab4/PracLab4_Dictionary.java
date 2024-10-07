/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.praclab4;

/**
 *
 * @author copbu
 */
import java.util.*;

public class PracLab4_Dictionary {

    public PracLab4_Dictionary() {
    }
    static Scanner sc = new Scanner(System.in);
    HashMap<String, String> dic = new HashMap<>();

    public static void main(String[] args) {
        PracLab4_Dictionary dic = new PracLab4_Dictionary();
        dic.input();
        System.out.print("Enter word: ");
        String n = sc.next();
        if (dic.check(n)) {
            System.out.println("Word exists.");
        } else {
            System.out.println("Word does not exist");
        }
        dic.output(n);
    }

    public void input() {
        dic.put("cat", "mèo");
        dic.put("dog", "chó");
        dic.put("bird", "chim");
        dic.put("pig", "heo");
        dic.put("chicken", "gà");
        dic.put("duck", "vịt");
        dic.put("fish", "cá");
        dic.put("tiger", "cọp");
        dic.put("lion", "sư tử");
        dic.put("panther", "páo");
    }

    public boolean check(String n) {
        if (dic.containsKey(n)) {
            return true;
        }
        return false;
    }
    
    public void output(String n){
    if(check(n)){System.out.println("Meaning: "+dic.get(n));}
    }

}
