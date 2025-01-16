/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpattern;

/**
 *
 * @author User
 */
public class Singleton {
    private static Singleton instance ;
    private String data;
    
    private Singleton(String data){
        this.data=data;
        
    }
    public static Singleton getInstance(String data){
        if (instance == null ) {
            instance= new Singleton(data);
            
        }
        return instance;
        
    }
}
