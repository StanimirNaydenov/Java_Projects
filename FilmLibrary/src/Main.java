import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Films> films = new ArrayList<>();
		films.add(new Rejisior("Batman",2001,"Jon"));
		films.add(new Rejisior("Superman",2016,"Karl"));
		films.add(new Rejisior("Advengers",2012,"Tomas"));
		
		films.add(new Sesons("The last of us",2020,2));
		films.add(new Sesons("Rick and morty",2018,7));
		films.add(new Sesons("Squid game",2019,3));
		
		
		films.sort(Comparator.comparing(Films::getTitle).thenComparing(Films::getYear).reversed());
		
		for (Films films2 : films) {
			System.out.println(films2.toString());
		}
		
		System.out.println("=========================================");
		
		films.sort((s1,s2)-> Integer.compare(s1.getYear(), s2.getYear()));
		for (Films films3 : films) {
			System.out.println(films3.toString());
		}
		
		System.out.println("=========================================");
		
		films.stream()
		.filter(f-> f instanceof Rejisior)
		.map(f-> (Rejisior)f)
		.sorted(Comparator.comparing(Rejisior::getName).thenComparing(Rejisior::getYear))
		.forEach(film-> System.out.println(film.getTitle()+", "+film.getYear()+" year, "+film.getName()));
		
		System.out.println("=========================================");
		
		System.out.println("Insert a year");
		Scanner scanner = new Scanner(System.in);
		int years = scanner.nextInt();
		
		films.stream()
		.filter(s-> s instanceof Sesons && s.getYear()>years)
		.map(s->(Sesons)s)
		.forEach(s-> System.out.println(s.getTitle()+", "+ s.getYear()+" year, "+s.getCount()+" count"));
		
		System.out.println("=========================================");
		
		int avgYear = (int) films.stream()
		.filter(s-> s instanceof Sesons && s.getYear()>years)
		.mapToInt(s->((Sesons)s).getYear())
		.average()
		.orElse(0);
		
		System.out.println("Avarage year: "+ avgYear+" years");
		
		System.out.println("=========================================");
		
		int sumYear = (int) films.stream()
				.filter(s-> s instanceof Sesons && s.getYear()>years)
				.mapToInt(s->((Sesons)s).getYear())
				.sum();
		
		System.out.println("Sum year: "+ sumYear+" years");
		
		System.out.println("=========================================");
		
		Optional<Rejisior> topYear = films.stream()
				.filter(f-> f instanceof Rejisior)
				.map(f-> (Rejisior)f)
				.max((s1,s2)-> Integer.compare(s1.getYear(), s2.getYear()));
		
		topYear.ifPresentOrElse(film-> System.out.println(film.getTitle()+", "+film.getYear()+" year, "+film.getName()), ()-> System.out.println("Not match"));
		
		System.out.println("=========================================");
		
		Optional<Rejisior> minYear = films.stream()
				.filter(f-> f instanceof Rejisior && "Advengers".equals(f.getTitle()))
				.map(f-> (Rejisior)f)
				.min((s1,s2)-> Integer.compare(s1.getYear(), s2.getYear()));
	
		minYear.ifPresentOrElse(film-> System.out.println(film.getTitle()+", "+film.getYear()+" year, "+film.getName()), ()-> System.out.println("Not match"));
		

	}

}
