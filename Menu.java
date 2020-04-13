
public class Menu {
	private Soup soup;
	private MainDish mainDish;
	
	public void createMenu(Chef c) {
		soup=c.prepareSoup();
		mainDish=c.prepareMainDish();
		soup.associateMainDish(mainDish);
	}
	
	public static void main(String args[]) {
		Menu m1=new Menu();
		m1.createMenu(new ChineeseChef());
		
		Menu m2=new Menu();
		m2.createMenu(new IndianChef());
	}

}
