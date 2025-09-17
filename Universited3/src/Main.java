import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalInt;

public class Main {

	public static void main(String[] args) {
		ArrayList<People> people = new ArrayList<>();
		people.add(new Student("Иван Иванов", "m", "1234567890", 5));
		people.add(new Student("Мария Петрова", "f", "0987654321", 6));
        people.add(new Student("Петя Петров", "f", "1122334455", 4));
        people.add(new Teachers("Георги Георгиев", "m", "1122334455", 1500));
        people.add(new Teachers("Анна Антонова", "f", "5566778899", 1800));
        
        Optional<Student> topStudent = people.stream()
        		.filter(p->p instanceof Student && "f".equals(p.getGender()))
        		.map(p-> (Student) p)
        		.max((s1,s2)->Integer.compare(s1.getAvgGrade(), s2.getAvgGrade()));
        topStudent.ifPresentOrElse (student -> System.out.println("Name="+student.getName()+"ArgGrade="+student.getAvgGrade()) , ()-> System.out.println("Not match"));
        
        int avgSalary = (int) people.stream()
        		.filter(t->t instanceof Teachers)
        		.mapToInt(t-> ((Teachers)t).getSalary())
        		.average()
        		.orElse(0);
        
        
        
        System.out.println("Higher price=" + avgSalary);
        
        int sumSalary = (int) people.stream()
        		.filter(a->a instanceof Teachers)
        		.mapToInt(a-> ((Teachers)a).getSalary())
        		.sum();
        System.out.println("Sum=" + sumSalary);
        
        OptionalInt minSalary =  people.stream()
        		.filter(d->d instanceof Teachers)
        		.mapToInt(d-> ((Teachers)d).getSalary())
        		.min();
        
        OptionalInt maxSalary = people.stream()
        		.filter(o->o instanceof Teachers)
        		.mapToInt(o-> ((Teachers)o).getSalary())
        		.min();
        if(maxSalary.isPresent() && minSalary.isPresent()) {
        	int count = maxSalary.getAsInt() - minSalary.getAsInt();
        	System.out.println("Minus"+count);
        }else {
        	System.out.println("Error!");
        }
        		
        people.sort((s1,s2)->s1.getName().compareTo(s2.getName()));
        for(People person:people) {
        	System.out.println("wdwd: " + person);
        }
        				

	}

}
