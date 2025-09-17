import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Shop> shop = new ArrayList<>();
		shop.add(new Pc("Computer","Office",890.90,"China",1234567));
		shop.add(new Pc("Computer","Gaming",2569.69,"Bulgaria",2462168));
		shop.add(new Pc("Computer","Gaming",3678.99,"Bulgaria",6743591));
		
		shop.add(new SmartPhone("SmartPhone","Budget",378.90,5000,"Blue"));
		shop.add(new SmartPhone("SmartPhone","Mid range",899.00,4900,"White"));
		shop.add(new SmartPhone("SmartPhone","Phlagman",2500.90,5000,"Black"));
		
		shop.stream()
		.filter(s-> s instanceof SmartPhone)
		.map(s-> (SmartPhone)s)
		.sorted(Comparator.comparing(SmartPhone:: getCapacityOfBattery))
		.forEach(smart-> System.out.println(smart.getCategory()+", "+smart.getType()+", "+ smart.getCapacityOfBattery()+"Mh, "+ smart.getColor()));
		
		System.out.println("-------------------------------------------------------------------");
		
		Optional<Pc> topPc = shop.stream()
				.filter(p->p instanceof Pc && "Bulgaria".equals(((Pc) p).getMadeIn()))
				.map(p-> (Pc)p)
				.max((s1,s2)-> Double.compare(s1.getPrice(), s2.getPrice()));
		topPc.ifPresentOrElse(pc-> System.out.println(pc.getCategory()+", "+pc.getType()+", "+ pc.getPrice()+" lv, "+pc.getMadeIn()+", "+ pc.getSerialNumber()), ()-> System.out.println("Not match"));

		System.out.println("-------------------------------------------------------------------");
		
		shop.sort((s1,s2)->Double.compare(s1.getPrice(), s2.getPrice()));
		for (Shop shop2 : shop) {
			System.out.println(shop2.getCategory()+","+shop2.getType()+", "+shop2.getPrice()+"lv");
		}
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("Insert: ");
		Scanner scanner = new Scanner(System.in);
		double mH = scanner.nextInt();
		
		shop.stream()
	    .filter(s -> s instanceof SmartPhone && ((SmartPhone) s).getCapacityOfBattery() > mH)
	    .map(s -> (SmartPhone) s)
	    .forEach(phone -> System.out.println(phone.getType() + " – " + phone.getCapacityOfBattery() + " mAh"));
		
		System.out.println("-------------------------------------------------------------------");
		
		double topMh = shop.stream()
				.filter(sм->sм instanceof SmartPhone && ((SmartPhone) sм).getCapacityOfBattery()>mH)
				.mapToDouble(s-> ((SmartPhone)s).getCapacityOfBattery())
				.average()
				.orElse(0);
		
		System.out.println("Best: "+ topMh+"Mh");
		
		System.out.println("-------------------------------------------------------------------");
		
		double SumMh = shop.stream()
				.filter(sм->sм instanceof SmartPhone && ((SmartPhone) sм).getCapacityOfBattery()>mH)
				.mapToDouble(s-> ((SmartPhone)s).getCapacityOfBattery())
				.sum();
		
		System.out.println("Sum: "+ SumMh+"Mh");
		
		System.out.println("-------------------------------------------------------------------");


		
	}

}
