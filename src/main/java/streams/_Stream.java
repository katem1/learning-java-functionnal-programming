package streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Stream {
	
	public static void main(String[] args) {
		
		
		List<Person> people= List.of(new Person("Katem", Gender.MALE ),
								new Person("Angel", Gender.FEMALE ),
								new Person("Katrine", Gender.FEMALE ),
								new Person("Khedhiri", Gender.MALE )
				);
		
//		people.stream().map(person -> person.name)
//		.mapToInt(String::length)
//		.forEach(System.out::println);
		 
		Predicate<Person> pred = person -> Gender.FEMALE.equals(person.gender);
				boolean result = people.stream()
		.anyMatch(pred);
				System.out.println(result);

	}

	
	static class Person{
		private final String name;
		private final Gender gender;
		
		public Person(String name, Gender gender) {
			super();
			this.name = name;
			this.gender = gender;
		}
		
		
	}
	
	enum Gender{
		MALE, FEMALE;
		
	}
}
