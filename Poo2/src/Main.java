
public class Main {

	public static void main(String[] args) {
		Mundo mundo1 = new Mundo("Terra", 100, 100);
		Character location1 = new Character(120,-10);
		
		
		System.out.println("Pessoa está em " + mundo1.getWorldName() + " é: X-" + location1.getLocationX() + " Y-" + location1.getLocationY());
		

	}

}
