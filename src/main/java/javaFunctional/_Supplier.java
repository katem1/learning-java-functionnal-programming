package javaFunctional;

import java.util.function.Supplier;

public class _Supplier {

	public static void main(String[] args) {
		System.out.println(supplier.get());;
		
	}
	
	static Supplier<String> supplier = () -> "Supplier returned value";
	
}
