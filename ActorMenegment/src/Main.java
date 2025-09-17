import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Cinema> cinema = new ArrayList<Cinema>();
		cinema.add(new Actor("Ivan Ivanov","Man","3985494385",10));
		cinema.add(new Actor("Diana Grigorova","Woman","746745612",8));
		cinema.add(new Actor("Tania Naydenova","Woman","56734865734857",5));
		
		cinema.add(new Director("Geordi Karaivanov","Man","54875673458",200000.25));
		cinema.add(new Director("Nadegda Seriska","Woman","42874563345",120000.65));
		cinema.add(new Director("Gergana Tomova","Woman","898873424567",250000.98));
		
		Optional<Actor> topActor = cinema.stream()
				.filter(a-> a instanceof Actor && "Woman".equals(a.getGender()))
				.map(a-> (Actor)a)
				.max((s1,s2)-> Integer.compare(s1.getCountFilms(), s2.getCountFilms()));
		topActor.ifPresentOrElse(act-> System.out.println(act.getName()+" "+ act.getGender()+" "+act.getCountFilms()), ()-> System.out.println("Not match"));
		
		double avgMoney =  cinema.stream()
				.filter(d-> d instanceof Director)
				.mapToDouble(d-> ((Director)d).getBudget())
				.average()
				.orElse(0);
		System.out.println("Avg budeget: "+ avgMoney);
		
		cinema.stream()
		.filter(d-> d instanceof Director)
		.map(d-> (Director)d)
		.sorted(Comparator.comparing(Director::getName).thenComparing(Director::getBudget).reversed())
		.forEach(director-> System.out.println(director.getName()+" "+ director.getGender()+" "+ director.getBudget()));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert money: ");
		int money = scanner.nextInt();
		
		cinema.stream()
		.filter(d-> d instanceof Director && ((Director) d).getBudget()>money)
		.map(d-> (Director)d)
		.forEach(director-> System.out.println(director.getName()+" "+ director.getGender()+" "+ director.getBudget()));
		
		System.out.println("---------------------------------------------------------------------------");
		
		cinema.sort((s1,s2)-> s1.getName().compareTo(s2.getName()));
		for(Cinema person: cinema) {
			System.out.println("Sorted list by name: "+ person);
		}
		
		System.out.println("---------------------------------------------------------------------------");
		
	
		
		cinema.stream()
		.filter(a-> a instanceof Actor)
		.map(a->(Actor)a)
		.sorted(Comparator.comparing(Actor::getEgn))
		.forEach(actor-> System.out.println(actor.getName()+" "+ actor.getEgn()+" "+ actor.getCountFilms()));
	

	}

}
