package javaFunctional;

import java.util.function.Predicate;

public class _Predicate {


	public static void main(String[] args) {
		System.out.println(isPhoneValid.test("55535555"));
		System.out.println(isPhoneValid.test("51555555"));
		System.out.println(isPhoneValid.test("555535555"));
		 System.out.println("Chain methods");
		 
		System.out.println(isPhoneValid.and(contains3).test("55535555"));
		System.out.println(isPhoneValid.and(contains3).test("53555555"));
		System.out.println(isPhoneValid.and(contains3).test("51555555"));
		System.out.println(isPhoneValid.and(contains3).test("555535555"));
		
	}
	
	static Predicate<String> isPhoneValid = phoneNb ->
	phoneNb.startsWith("55") && phoneNb.length() == 8;
	
	static Predicate<String> contains3 = phoneNb ->
	phoneNb.contains("3");
	
}
