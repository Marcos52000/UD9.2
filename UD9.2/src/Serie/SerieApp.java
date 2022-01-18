package Serie;

public class SerieApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serie s1 = new Serie();
		Serie s2 = new Serie("Spiderman", "Jon Watts");
		Serie s3 = new Serie("Juego de Tronos", 8, "Fantasia", "David Benioff y D. B. Weiss");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}

}
