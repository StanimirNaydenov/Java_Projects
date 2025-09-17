import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<AutoPark> autoPark = new ArrayList<>();
		autoPark.add(new Cars("Mercedes","2010",4));
		autoPark.add(new Cars("BMW","2008",5));
		autoPark.add(new Cars("Audi","2020",3));
		autoPark.add(new Cars("Porshe","2023",3));
		
		autoPark.add(new Truk("Mercedes","2010",10));
		autoPark.add(new Truk("Volvo","2010",8));
		autoPark.add(new Truk("Man","2010",20));
		
		autoPark.stream()
		.filter(c-> c instanceof Cars)
		.map(c->(Cars)c)
		.sorted(Comparator.comparing(Cars::getModel).thenComparing(Cars::getYearOfMade))
		.forEach(cars-> System.out.println(cars.getModel()+", "+cars.getYearOfMade()+", "+cars.getDors()+" dors"));
		
		System.out.println("-------------------------------------------");
		System.out.println("Insert weight");
		Scanner scanner  = new Scanner(System.in);
		int weight = scanner.nextInt();
		
		autoPark.stream()
		.filter(t->t instanceof Truk && ((Truk) t).getMaxCapacitet()>weight )
		.map(c->(Truk)c)
		.forEach(truk-> System.out.println(truk.getModel()+", "+truk.getYearOfMade()+", "+ truk.getMaxCapacitet()+ " tons"));
		
		System.out.println("------------------------------------------");
		
		int avgWeight = (int) autoPark.stream()
				.filter(t->t instanceof Truk && ((Truk) t).getMaxCapacitet()>weight )
				.mapToInt(t-> ((Truk)t).getMaxCapacitet())
				.average()
				.orElse(0);
		
		System.out.println("Average weight: "+avgWeight);
		
		System.out.println("------------------------------------------");
		
		int sumWeight = (int) autoPark.stream()
				.filter(t->t instanceof Truk && ((Truk) t).getMaxCapacitet()>weight )
				.mapToInt(t-> ((Truk)t).getMaxCapacitet())
				.sum();
		
		
		System.out.println("Sum weight: "+sumWeight);
		
		System.out.println("------------------------------------------");
		
		Optional<Cars> topDors = autoPark.stream()
		.filter(c-> c instanceof Cars)
		.map(c-> (Cars)c)
		.max((s1,s2)->Integer.compare(s1.getDors(), s2.getDors()));
		
		topDors.ifPresentOrElse(cars-> System.out.println("Cars with max dors: "+cars.getModel()+", "+cars.getYearOfMade()+", "+cars.getDors()+" dors"), ()->System.out.println("Not match"));
		
		System.out.println("------------------------------------------");
		
		Optional<Cars> minDors = autoPark.stream()
				.filter(c-> c instanceof Cars && "Porshe".equals(c.getModel()))
				.map(c-> (Cars)c)
				.min((s1,s2)->Integer.compare(s1.getDors(), s2.getDors()));
				
				minDors.ifPresentOrElse(cars-> System.out.println("Cars with min dors: "+cars.getModel()+", "+cars.getYearOfMade()+", "+cars.getDors()+" dors"), ()->System.out.println("Not match"));
		
		
		
	
	

	}

}
