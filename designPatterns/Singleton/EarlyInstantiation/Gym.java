/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton.EarlyInstantiation;

/**
 *
 * @author udaya
 */
public class Gym {
    public static void main(String [] args) {
    
            Trainer fitnessM1 = Trainer.getFitness_Model();
            Trainer fitnessM2 = Trainer.getFitness_Model();
            
            System.out.println(fitnessM1);
            System.out.println(fitnessM1);
    }
           
}
