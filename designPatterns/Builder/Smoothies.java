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
public abstract class Smoothies implements Bill {
    @Override
	public Packing packing() {
       return new Jar();
	}

	@Override
	public abstract float price();
}
