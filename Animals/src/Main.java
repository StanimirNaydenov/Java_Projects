import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Animal> animal = new ArrayList<>();
		animal.add(new Dog("Husky","dog","Bulgaria","Lucky",4));
		animal.add(new Dog("HNemska uv4arka","dog","Germany","Zevs",5));
		animal.add(new Dog("Pincer","dog","Ispania","Hera",8));
		animal.add(new Cat("Cdaf","cat","Bulgaria","Lucky",2010));
		animal.add(new Cat("Guyihj","cat","America","Dante",2018));
		animal.add(new Cat("Lunmjhwe","cat","Islandia","Ice",2016));
		
		
		animal.stream()
		.filter(d-> d instanceof Dog)
		.map(d-> (Dog)d)
		.sorted(Comparator.comparing(Dog::getAge).thenComparing(Dog::getName))
		.forEach(dog-> System.out.println(dog.getKind()+", "+ dog.getType()+", "+ dog.getWereIs()+", "+ dog.getWereIs()+ ", "+ dog.getAge()+" year"));
		
		System.out.println("----------------------------------------------------------------------");
		
		Optional<Cat> topCat = animal.stream()
				.filter(c->c instanceof Cat && "America".equals(c.getWereIs()))
				.map(c-> (Cat)c)
				.max((s1,s2)-> Integer.compare(s1.getYear(), s2.getYear()));
		topCat.ifPresentOrElse(cat -> System.out.println(cat.getKind()+", "+cat.getType()+", "+cat.getWereIs()+", "+cat.getSname()+", "+ cat.getYear()+" year") , ()-> System.out.println("Not match"));
				
		System.out.println("----------------------------------------------------------------------");
		
		Optional<Cat> minCat = animal.stream()
				.filter(c->c instanceof Cat)
				.map(c->(Cat)c)
				.min((s1,s2)-> Integer.compare(s1.getYear(),s2.getYear()));
		minCat.ifPresentOrElse(cat-> System.out.println(cat.getKind()+", "+ cat.getType()+", "+cat.getWereIs()+", "+cat.getSname()+", "+ cat.getYear()+ " year"), ()-> System.out.println("Not math"));
		
		System.out.println("----------------------------------------------------------------------");
		
		System.out.println("Insert year: ");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		System.out.println("----------------------------------------------------------------------");
		
		animal.stream()
		.filter(d-> d instanceof Dog && ((Dog) d).getAge()>age)
		.map(d-> (Dog)d)
		.forEach(dog-> System.out.println(dog.getKind()+", "+ dog.getType()+", "+dog.getWereIs()+", "+dog.getName()+", "+ dog.getAge()+ ", year"));
		
		System.out.println("----------------------------------------------------------------------");
		
		int topAge = (int) animal.stream()
				.filter(d-> d instanceof Dog && ((Dog) d).getAge()>age)
				.mapToInt(d->((Dog)d).getAge())
				.average()
				.orElse(0);
		
		System.out.println("Average age: "+ topAge+ " year");
		
		System.out.println("----------------------------------------------------------------------");
		
		int sumAge = (int) animal.stream()
				.filter(d-> d instanceof Dog && ((Dog) d).getAge()>age)
				.mapToInt(d->((Dog)d).getAge())
				.sum();
		
		System.out.println("sum age: "+ sumAge+ " years");
		

	}

}
