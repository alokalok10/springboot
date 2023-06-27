package com.example.apiproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    

    // Getter
    public String getName() {
      return name;
    }

    // Setter
    public void setName(String newName) {
      this.name = newName;
    }
    
 // Getter
    public String getCountry() {
      return country;
    }

    // Setter
    public void setCountry(String country) {
      this.country = country;
    }
    
 // Getter
    public int getId() {
      return id;
    }

    // Setter
    public void setId(int id) {
      this.id = id;
    }

	public Customers(int id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}
	
	public Customers() {
		
	}
    
    
    // Constructors, getters, and setters
}

