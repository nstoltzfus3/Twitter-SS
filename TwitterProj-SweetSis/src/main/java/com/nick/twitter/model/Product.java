package com.nick.twitter.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Embeddable
public class Product {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "product_id")
	 private Long id;
	 
	 private int quantity;
	 
	 private float price;
	 
	 private String description;
	 
	 private String name;
	 
	 private String brand;
	 
	 private String category;
	 
	 private String img_url;

	
	 
	 
}
