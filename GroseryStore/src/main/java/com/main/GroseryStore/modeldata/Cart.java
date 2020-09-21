/**
 * 
 */
package com.main.GroseryStore.modeldata;

import lombok.Data;

/**
 * @author jj
 *Dont Copy my code ,see how can I do it then use ur logic and build it
 */
@Data
public class Cart {
	 private int id;
	    private String name;
	    private String price;
	    private int quantity;
	    private String image;

	    public Cart(int id, String name, String price, int quantity, String image) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	        this.quantity = quantity;
	        this.image = image;
	    }

}
