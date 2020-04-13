public class ChineeseChef implements Chef{
	public Soup prepareSoup() {
		return new KlangBakKuTehSoup();
	}
	
	public MainDish prepareMainDish() {
		return new KungPaoChicken();
	}
}
