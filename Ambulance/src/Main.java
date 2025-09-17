import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<People> people = new ArrayList<People>();
		people.add(new Pacient("Ivan Ivanov","54748573453",40,"dgdg",4));
		people.add(new Pacient("Gergana Georgieva","943424255",35,"erer",3));
		people.add(new Pacient("Todor Asenov","056737445632",50,"dfreger",10));
		
		people.add(new Doctor("Daniel Simeonov","54325632563",45,"erer",18));
		people.add(new Doctor("Elisaveta Slavova","745356453",34,"erer",13));
		people.add(new Doctor("Asen Ivanow","343455454",59,"dfsefef",36));
		
		people.sort((s1,s2)-> s1.getName().compareTo(s2.getName()));
		for(People person :  people) {
			System.out.println("Sorted: " + person);
		}
		
		System.out.println("---------------------------------------------------------------------------");
		
		people.stream()
		.filter(p->p instanceof Pacient )
		.map(p-> (Pacient)p)
		.sorted(Comparator.comparing(Pacient::getDiagnose).thenComparing(Pacient::getDays))
		.forEach(pa-> System.out.println(pa.getName()+" "+ pa.getEgn()+" "+ pa.getAge()+" "+ pa.getDiagnose()+" "+ pa.getDays()));
		
		System.out.println("---------------------------------------------------------------------------");

		System.out.println("Insert years: ");
		Scanner scanner = new Scanner(System.in);
		int years = scanner.nextInt();
		
		people.stream()
		.filter(d-> d instanceof Doctor && ((Doctor) d).getYears()>years)
		.map(d-> (Doctor)d)
		.forEach(doc-> System.out.println(doc.getName()+" " + doc.getAge()+" "+doc.getYears()));

		System.out.println("---------------------------------------------------------------------------");

		Optional<Doctor> topDoctor = people.stream()
				.filter(d-> d instanceof Doctor)
				.map(d-> (Doctor)d)
				.max((s1,s2)-> Integer.compare(s1.getYears(), s2.getYears()));
		topDoctor.ifPresentOrElse(doc-> System.out.println(doc.getName()+" "+doc.getAge()+" "+ doc.getSpecialnost()+" "+ doc.getYears()), ()-> System.out.println("Not match"));

		System.out.println("---------------------------------------------------------------------------");

		int avgYears = (int) people.stream()
				.filter(doc-> doc instanceof Doctor)
				.mapToInt(doc -> ((Doctor)doc).getYears())
				.average()
				.orElse(0);
		
		System.out.println("Varage years"+avgYears);

		System.out.println("---------------------------------------------------------------------------");

		int sumAge = (int) people.stream()
				.filter(p->p instanceof Pacient)
				.mapToInt(p-> ((Pacient)p).getAge())
				.sum();
		System.out.println("Sum age"+sumAge);

	}

}
