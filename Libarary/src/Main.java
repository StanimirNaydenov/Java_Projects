import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Publication> library = new ArrayList<>();
		library.add(new Book("Под игото", 1894, "Иван Вазов"));
        library.add(new Book("Бай Ганьо", 1895, "Алеко Константинов"));
        library.add(new Book("Тютюн", 1951, "Димитър Димов"));

        library.add(new Magazine("Наука и техника", 2010, true));
        library.add(new Magazine("Кулинарен журнал", 2022, false));
        library.add(new Magazine("История", 2015, true));
        
      library.stream()
      .filter(b-> b instanceof Book)
      .map(b-> (Book)b)
      .sorted(Comparator.comparing(Book::getAuthorName).thenComparing(Book::getYear))
      .forEach(book-> System.out.println(book.getAuthorName()+book.getTitle()+book.getYear()));
      
      System.out.println("------------------------------------");
       
       library.stream()
       .filter(m->m instanceof Magazine)
       .map(m -> (Magazine) m)
       .sorted(Comparator.comparing(Magazine::getYear))
       .forEach(magazine -> System.out.println(magazine.getTitle() + magazine.getYear()));
       
       System.out.println("------------------------------------");
       
       library.sort((s1,s2)-> s1.getTitle().compareTo(s2.getTitle()));
       for(Publication pub:library)
       {
    	   System.out.println(pub);
       }
       
       System.out.println("------------------------------------");
       
       library.sort(Comparator.comparing(Publication::getYear));
       for(Publication pub1 : library)
       {
    	   System.out.println(pub1);
       }
        
       System.out.println("------------------------------------");
       
      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("\nВъведете година: ");
        int targetYear = scanner.nextInt();*/
       
       System.out.println("Insert year");
       Scanner scanner = new Scanner(System.in);
       int year = scanner.nextInt();
        
        System.out.println("\n--- Списания, издадени след " + year + " г. ---");
        library.stream()
        .filter(m-> m instanceof Magazine && m.getYear()>year)
        .map(m-> (Magazine)m)
        .forEach(mag-> System.out.println(mag.getTitle()+mag.getYear()+mag.isPublishOrNo()));
        
        

		

	}

}
