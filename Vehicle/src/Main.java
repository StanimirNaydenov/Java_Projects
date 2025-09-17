import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Vehicle> vehicle = new ArrayList<>();
		vehicle.add(new Cars("Car","Mercedes","C-class",224));
		vehicle.add(new Cars("Car","Audi","A8",410));
		vehicle.add(new Cars("Car","BMW","335i",306));
		vehicle.add(new Truks("Truk","Volvo","V","Italy",1200));
		vehicle.add(new Truks("Truk","Mercedes","Actros","Germany",1350));
		vehicle.add(new Truks("Truk","Scania","SC","England",2560));
		
		vehicle.stream()
		.filter(c-> c instanceof Cars)
		.map(c-> (Cars)c)
		.sorted(Comparator.comparing(Cars::getHp))
		.forEach(car -> System.out.println(car.getType()+" ,"+car.getBrand()+" ," + car.getModel()+" ,"+ car.getHp()+" hp"));
		
		System.out.println("-----------------------------------------------------------------");
		
		vehicle.stream()
		.filter(t-> t instanceof Truks)
		.map(t-> (Truks)t)
		.sorted(Comparator.comparing(Truks::getCurse).thenComparing(Truks::getDistance))
		.forEach(truk -> System.out.println(truk.getType()+" ,"+truk.getBrand()+" ," + truk.getModel()+" ,"+ truk.getCurse()+" ,"+ truk.getDistance()+" km"));
		
		System.out.println("-----------------------------------------------------------------");
		
		Optional <Cars> bestHp = vehicle.stream()
				.filter(c-> c instanceof Cars)
				.map(c-> (Cars)c)
				.max((s1,s2)-> Integer.compare(s1.getHp(),(s2.getHp())));
		bestHp.ifPresentOrElse(car-> System.out.println(car.getType()+" ,"+car.getBrand()+" ," + car.getModel()+" ,"+ car.getHp()+" hp"), ()-> System.out.println("Not Match"));
				
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Insert hp: ");
		Scanner scanner = new Scanner(System.in);
		int hp = scanner.nextInt();
		
		vehicle.stream()
		.filter(c-> c instanceof Cars && ((Cars) c).getHp()>hp)
		.map(c->(Cars)c)
		.forEach(c-> System.out.println(c.getType()+" ,"+c.getBrand()+" ," + c.getModel()+" ,"+ c.getHp()+" hp"));
		
		System.out.println("-----------------------------------------------------------------");
		
		int avgHp = (int) vehicle.stream()
				.filter(c-> c instanceof Cars && ((Cars) c).getHp()>hp)
				.mapToInt(c->((Cars)c).getHp())
				.average()
				.orElse(0);
		System.out.println("Average km: " + avgHp + " hp");
		
		System.out.println("-----------------------------------------------------------------");
		
		int sumHp = (int) vehicle.stream()
				.filter(c-> c instanceof Cars && ((Cars) c).getHp()>hp)
				.mapToInt(c->((Cars)c).getHp())
				.sum();
		System.out.println("Sum km: " + sumHp + " hp");
		

	}

}
