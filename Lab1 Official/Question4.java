package lab1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
import java.util.*;
public class Question4 {
   private int n;
    public Question4() {}
    public Question4(int n) {
        this.n = n;
    }
    
    public int SumEven(){
        int[]a=new int[n];
        int sum=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Array: ");
        for(int i =0;i<n;i++){
        a[i]=sc.nextInt();
        
    }for(int i=0;i<n;i++)if(a[i]%2==0)sum+=a[i];
    return sum;}}
   
