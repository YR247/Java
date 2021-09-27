package com.MappingAll;

import javax.persistence.*;

@Entity
@Table(name = "cartespire")

public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	// Pojo
	private int cartId,totalPrice;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
}