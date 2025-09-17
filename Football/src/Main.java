import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Club> club = new ArrayList<>();
		club.add(new Player("Man City",1899,"Mancester","Holand",12000.29));
		club.add(new Player("Barca",1869,"Barcelona","Yamal",254000.78));
		club.add(new Player("Liverpol",1901,"Liverpol","Salah",18909.98));
		
		club.add(new Coach("Man City",1899,"Manchester","Glordiola",26));
		club.add(new Coach("Barca",1869,"Barcelona","Flick",30));
		club.add(new Coach("Liverpol",1901,"Liverpol","Morinio",36));
		
		Optional <Player> topPlayer = club.stream()
				.filter(p-> p instanceof Player)
				.map(p-> (Player)p)
				.max((s1,s2)-> Double.compare(s1.getSelary(), s2.getSelary()));
		
		topPlayer.ifPresentOrElse(p-> System.out.println(p.getName()+" ,"+p.getYear()+" ,"+p.getCity()+" ,"+p.getpName()+" ,"+p.getSelary()+" BGN"), ()-> System.out.println("Not match"));
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		club.stream()
		.filter(c-> c instanceof Coach)
		.map(c-> (Coach)c)
		.sorted(Comparator.comparing(Coach::getYearExp).thenComparing(Coach::getcName))
		.forEach(c-> System.out.println(c.getName()+" ,"+ c.getYear()+" ,"+c.getCity()+" ,"+c.getcName()+" , "+c.getYearExp()+" year"));
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		System.out.println("Insert money: ");
		Scanner scanner = new Scanner(System.in);
		double money = scanner.nextDouble();
		
		club.stream()
		.filter(p-> p instanceof Player && ((Player) p).getSelary()>money)
		.map(p-> (Player)p)
		.forEach(p-> System.out.println(p.getName()+" ,"+p.getYear()+" ,"+p.getCity()+" ,"+p.getpName()+" ,"+p.getSelary()+" BGN"));
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		double avgMoney = club.stream()
				.filter(p-> p instanceof Player && ((Player) p).getSelary()>money)
				.mapToDouble(p-> ((Player)p).getSelary())
				.average()
				.orElse(0);
		System.out.println("Average money: "+avgMoney + " BGN");
		
		double sumMoney = club.stream()
				.filter(p-> p instanceof Player && ((Player) p).getSelary()>money)
				.mapToDouble(p-> ((Player)p).getSelary())
				.sum();
				
		System.out.println("Sum money: "+sumMoney + "BGN");
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		club.sort((s1, s2) -> Integer.compare(s1.getYear(), s2.getYear()));
		
		for(Club p:club) {
			System.out.println(p.getName()+" ,"+p.getYear()+" year");
		}

	}

}
