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
public class Trainer {
    private static volatile Trainer fitnessM = new Trainer();

    private Trainer(){}
    
    public static Trainer getFitness_model() {
        if(fitnessM == null){
            synchronized(Trainer.class){
                if(fitnessM ==null){
                    fitnessM= new Trainer();
                }
            }
        }
        return fitenssM;
    }
    
}
