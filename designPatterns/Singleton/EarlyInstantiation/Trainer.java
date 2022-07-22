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
public class Trainer {
    private static volatile Trainer FitnessM = new Trainer();
    
    private Trainer() {
    
    }

    public static Trainer getFitnessM() {
        return FitnessM;
    }
  
    
}
