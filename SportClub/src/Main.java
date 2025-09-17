import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> person = new ArrayList<>();
		person.add(new Atletick("Jon Doe",28,"3455265452","suiming",5));
		person.add(new Atletick("Anna Nikolova",24,"6556356354","jump",2));
		person.add(new Atletick("Alex Georgiev",30,"2245678753","sprint",10));
		
		person.add(new Trener("Ivan Ivanov",45,"334546356",15,4678.50));
		person.add(new Trener("Georgi Georgiev",67,"6575762",30,6792.67));
		person.add(new Trener("Elica Yaneva",55,"4456768734",28,5890.70));
		
		person.stream()
	    .filter(a -> a instanceof Atletick)
	    .map(a -> (Atletick) a)
	    .sorted(Comparator.comparing(Atletick::getDisciplin)
	                      .thenComparing(Atletick::getPersonalRecord))
	    .forEach(at -> System.out.println(at.getName() +  " " + at.getDisciplin() + " " + at.getPersonalRecord()));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert Number");
		int number = scanner.nextInt();
		
		person.stream()
	    .filter(t -> t instanceof Trener &&  ((Trener) t).getYearEx() > number)
	    .map(t -> (Trener) t)
	    .forEach(tr -> System.out.println(tr.getName() + " - " + tr.getYearEx() + " години опит"));
		
		Optional<Atletick> topAtl = person.stream()
				.filter(at-> at instanceof Atletick)
				.map(at-> (Atletick)at)
				.max((s1,s2)-> Integer.compare(s1.getPersonalRecord(),s2.getPersonalRecord()));
		topAtl.ifPresentOrElse(atl-> System.out.println(atl.getName()+" "+ atl.getAge()+" "+ atl.getDisciplin()+" "+atl.getPersonalRecord()), ()-> System.out.println("Not match"));
		
		double avgSalary =  person.stream()
				.filter(tr->tr instanceof Trener)
				.mapToDouble(tr-> ((Trener)tr).getMoney())
				.average()
				.orElse(0);
		System.out.println("avrgSalary: "+avgSalary);
		
		
		
		

	}

}
