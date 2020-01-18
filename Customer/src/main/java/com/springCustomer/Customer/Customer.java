package com.springCustomer.Customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {
private String firstname;
private String lastname;
private String email;
private String id;
@Override
public String toString() {
	return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", id=" + id + "]";
}

}