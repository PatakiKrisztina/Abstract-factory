
public class AlmondSoup implements Soup{
	public void associateMainDish(MainDish md){
		System.out.println("Az " + this +" leveshez a " + md + " foetelt tarsitottam");
	}
	public String toString() {
		return "AlmondSoup";
	}
}
