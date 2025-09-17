import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Competitive> comp = new ArrayList<>();
		comp.add(new Runurs("Ivan",2008,95.6));
		comp.add(new Runurs("Petar",2020,120.8));
		comp.add(new Runurs("Georgi",2004,89.7));
		comp.add(new Swimers("Todor",2010,10.8));
		comp.add(new Swimers("Svetlana",2018,12.3));
		comp.add(new Swimers("Gergana",2003,19.8));
		
		comp.stream()
		.filter(r->r instanceof Runurs)
		.map(r-> (Runurs)r)
		.sorted(Comparator.comparing(Runurs::getName).thenComparing(Runurs::getYear))
		.forEach(r-> System.out.println(r.getName()+", "+r.getYear()+", "+r.getTime()+"m"));
		
		System.out.println("==============================");
		comp.sort(Comparator.comparing(Competitive::getName).thenComparing(Competitive::getYear));
		
		for (Competitive competitive : comp) {
			System.out.println(competitive.toString());
		}
		
		System.out.println("==============================");
		
		System.out.println("Insert a year: ");
		Scanner scanner = new Scanner(System.in);
		int minYear = scanner.nextInt();
		
		comp.stream()
		.filter(s->s instanceof Swimers && s.getYear()>minYear)
		.map(s->(Swimers)s)
		.forEach(s-> System.out.println(s.getName()+", "+s.getYear()+", "+ s.getAvrgSpeed()+"km"));
		
		for (Competitive c : comp) {
			if(c.getYear()>minYear) {
				System.out.println(c.toString());
			}
		}
		
		System.out.println("==================================");
		
		int avgYear = (int) comp.stream()
		.filter(s->s instanceof Swimers && s.getYear()>minYear)
		.mapToDouble(s->((Swimers)s).getAvrgSpeed())
		.average()
		.orElse(0);
		
		System.out.println("Avarage year: "+avgYear);
		
		System.out.println("==================================");
		
		int sumYear = (int) comp.stream()
				.filter(s->s instanceof Swimers && s.getYear()>minYear)
				.mapToDouble(s->((Swimers)s).getAvrgSpeed())
				.sum();
		
		System.out.println("Sum year: "+sumYear);
		
		
		

	}

}
