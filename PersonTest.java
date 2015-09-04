class Person {
	// Properties of the class...
	private String name;
	public int age;
	private String country;
	// Constructor of the class...
	public Person(String aName, int anAge, String aCountry) {
		name = aName;
		age = anAge;
		country = aCountry;
	}
	// Methods of the class...
	public void talk() {
		System.out.println("Hi, my name’s " + name);
		System.out.println("and my age is " + age);
		System.out.println("and I live in " + country);
		System.out.println();
	}
	public void commentAboutAge() {
		if (age < 5) {
			System.out.println("baby");
		}
		if (age == 5) {
			System.out.println("time to start school");
		}
		if (age > 60) {
			System.out.println("old person");
		}
	}
	public void growOlder() {
		age = age +1;
	}
	public void growOlderBy(int years) {
		age = age + years;
	}

	public void giveKnighthood(){
		name = "Sir" + name;
	}
	class PersonTest {
	// The main method is the point of entry into the program...
		public void main(String[] args) {
			Person ls = new Person("Luke Skywalker",34,"England");
			Person wp = new Person("Winston Peters",48,"Belgium");
			ls.talk();
			wp.talk();
			// ls.commentAboutAge();
			// wp.commentAboutAge();
			wp.growOlder();
			wp.giveKnighthood();
			ls.growOlderBy(10);
			System.out.println(ls.age);
		}
	}
}