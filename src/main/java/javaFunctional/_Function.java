package javaFunctional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
	
	public static void main(String[] args) {
		Function<Integer, Integer> addMutliply = incrementByOne.andThen(multiplyBy10);
		int result = addMutliply.apply(1);
		System.out.println(result);
		System.out.println(addMultiplyBiFunction.apply(4, 10));
	}
	
	static Function<Integer, Integer> incrementByOne = number -> number+1;
	
	static Function<Integer, Integer> multiplyBy10 = number -> number * 10;
	
	static BiFunction<Integer, Integer, Integer> addMultiplyBiFunction = 
			(nb1, nb2) ->(nb1 + 1)*nb2;

}
