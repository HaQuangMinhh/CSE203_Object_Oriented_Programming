/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab7;

/**
 *
 * @author maianhtran
 */
public class MainCDStore {
    
    public static void main(String []args){
        CDManager cdManager = new CDManager();
        new CDStore(cdManager).setVisible(true);
    }
    
}
