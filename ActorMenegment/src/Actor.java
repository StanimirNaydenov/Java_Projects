
public class Actor extends Cinema {
	
	public int countFilms;

	public Actor(String name, String gender, String egn, int countFilms) {
		super(name, gender, egn);
		this.countFilms = countFilms;
	}

	public int getCountFilms() {
		return countFilms;
	}

	public void setCountFilms(int countFilms) {
		this.countFilms = countFilms;
	}

	@Override
	public String toString() {
		return "Actor [countFilms=" + countFilms + ", name=" + name + ", gender=" + gender + ", egn=" + egn + "]";
	}

}
