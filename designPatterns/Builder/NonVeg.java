/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author udaya
 */
public class NonVeg extends Sandwich{
   @Override
   public float price() {
      return 550.5f;
   }

   @Override
   public String name() {
      return "Chicken Sandwich";
   }
}
