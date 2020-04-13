
public class KlangBakKuTehSoup implements Soup{
	public void associateMainDish(MainDish md){
		System.out.println("A  " +this +" leveshez a " + md + " foetelt tarsitottam");
	}
	public String toString() {
		return getClass().getSimpleName();
	}
}
