/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton.LazyInstantiation;

/**
 *
 * @author udaya
 */
public class Gym {
    public static void main(String[] args) {
        Thread thread1= new Thread(new AppThreads());
        Thread thread2= new Thread(new AppThreads());
        
        thread1.start();
        thread2.start();
        
        if(thread1.equals(thread2)){
            System.out.println("Same value");
        }
        else{
        System.out.println("different value but same instance");
        }
    }
            
    
}
