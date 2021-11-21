package optionals;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import static java.lang.Math.random;

public class _Optional {
	
	public static void main(String[] args) {
		Optional.ofNullable("hello").ifPresentOrElse(System.out::println
				, ()->System.out.println("null value"));
//		System.out.println(value);
		
		String alex = new String("alex");
		String mariam = alex;
		System.out.println(alex + " "+ mariam);
		
		System.out.println(alex + " "+ mariam+" "+alex.length());
		
		
			
		
	}

}
