import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Deinost> deinost = new ArrayList<>();
		deinost.add(new Deinost("Dom","Elektronika","06.10.2012 g",268.20));
		deinost.add(new Deinost("Gradina","Kosene","13.10.2018 g",120.78));
		deinost.add(new Deinost("Ofis","Osfejavane","10.06.2020 g",56.20));
		deinost.add(new Deinost("Avtomobil","Remont","20.08.2024 g",3000.56));
		deinost.add(new Deinost("Mototr","Remont","20.08.2024 g",4000.56));
		
		deinost.sort((s1,s2)-> Double.compare(s1.getPrice(), s2.getPrice()));
		for(Deinost d : deinost) {
			System.out.println(d.getKategory()+" ,"+d.getType()+" ,"+ d.getDate()+ " ," + d.getPrice()+" lv");
		}
		
		deinost.stream()
		.filter(d->d instanceof Deinost)
		.map(d-> (Deinost)d)
		.sorted(Comparator.comparing(Deinost::getKategory))
		.forEach(deinosti-> System.out.println(deinosti.getKategory()+" , "+deinosti.getType()+" , "+deinosti.getDate()+" , "+deinosti.getPrice()+" BGN"));
		
		System.out.println("--------------------------------------------------------");
		
		deinost.stream()
		.filter(d-> d instanceof Deinost)
		.map(d-> (Deinost)d)
		.sorted(Comparator.comparing(Deinost::getType).thenComparing(Deinost::getPrice))
		.forEach(de-> System.out.println(de.getKategory()+" , "+de.getType()+" , "+de.getDate()+" , "+de.getPrice()+" BGN"));
		
		System.out.println("--------------------------------------------------------");
		
		Optional<Deinost> maxDeinost = deinost.stream()
				.filter(d-> d instanceof Deinost)
				.map(d-> (Deinost)d)
				.max((s1,s2)->Double.compare(s1.getPrice(), s2.getPrice()));
		maxDeinost.ifPresentOrElse(de -> System.out.println(de.getKategory()+" , "+de.getType()+" , "+de.getDate()+" , "+de.getPrice()+" BGN"), ()-> System.out.println("Not match"));
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Insert money");
		Scanner scanner = new Scanner(System.in);
		double money = scanner.nextDouble();
		
		deinost.stream()
		.filter(d-> d instanceof Deinost && d.getPrice()>money)
		.map(d-> (Deinost)d)
		.forEach(de-> System.out.println(de.getKategory()+" , "+de.getType()+" , "+de.getDate()+" , "+de.getPrice()+" BGN"));
		
		System.out.println("--------------------------------------------------------");
		
		double avgMoney = deinost.stream()
				.filter(d-> d instanceof Deinost && d.getPrice()>money)
				.mapToDouble(d-> ((Deinost)d).getPrice())
				.average()
				.orElse(0);
		
		System.out.println("Avarage money: "+avgMoney+" BGN");
		
		System.out.println("--------------------------------------------------------");
		
		double sumMoney = deinost.stream()
				.filter(d-> d instanceof Deinost && d.getPrice()>money)
				.mapToDouble(d-> ((Deinost)d).getPrice())
				.sum();
		
		System.out.println("Sum money: "+sumMoney+" BGN");

	}

}
