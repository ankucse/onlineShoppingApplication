package com.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cartItemId;


    //	@OneToMany(cascade = CascadeType.ALL)
    @OneToOne
    private Products cartItem;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JsonIgnore
//	private Customer customer;

    //	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ADDRESS_ID", referencedColumnName = "addressId")
    @OneToOne
    private Customer customerlist;

//	private Double cartTotal;


//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}


}
