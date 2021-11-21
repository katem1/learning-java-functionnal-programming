package javaFunctional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
	
	public static void main(String[] args) {
		
		Customer cust = new Customer("Katem", "99999999");
		greet.accept(cust);
		
		greetV2.accept(cust, false);
		
	}
	
	static Consumer<Customer> greet =
			customer -> System.out.println
			("Hello"+customer.name+" your phone nb is"+customer.phone);
	
	//BiConsumer
	
			static BiConsumer<Customer, Boolean> greetV2 =
					(customer, showPhone) -> System.out.println
					("Hello"+customer.name+" your phone nb is"+(showPhone ? customer.phone : "********"));
	
	static class Customer{
		private final String name;
		private final String phone;
		
		public Customer(String name, String phone) {
			super();
			this.name = name;
			this.phone = phone;
		}
		
		
	}

}
