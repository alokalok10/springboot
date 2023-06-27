package com.example.apiproject.model;



import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "customer_id")
    private int customer_id;

    @Column(name = "amount")
    private BigDecimal amount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customer_id;
	}

	public void setCustomerId(int customerId) {
		this.customer_id = customerId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Orders(int id, int customerId, BigDecimal amount) {
		super();
		this.id = id;
		this.customer_id = customerId;
		this.amount = amount;
	}

	public Orders() {
	}
    // Constructors, getters, and setters
}
