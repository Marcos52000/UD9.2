package Serie;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class Act2App {
	public static VIdeojuego[] juegos = new VIdeojuego[5];
	public static Serie[] series = new Serie[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crearSeries();
		crearVideojuego();
		mostrar();

	}

	public static void crearSeries() {
		for (int i = 0; i < series.length; i++) {
			String titulo = JOptionPane.showInputDialog("Introduce el titulo de la serie");
			int temporadas = Integer.parseInt(JOptionPane.showInputDialog("Numero de temporadas"));
			String genero = JOptionPane.showInputDialog("Genero de la serie");
			String creador = JOptionPane.showInputDialog("Creador de la serie");
			Serie s1 = new Serie(titulo, temporadas, genero, creador);
			series[i] = s1;
		}
	}

	public static void crearVideojuego() {
		for (int i = 0; i < juegos.length; i++) {
			String titulo = JOptionPane.showInputDialog("Introduce el titulo del juego");
			double horas = Double.parseDouble((JOptionPane.showInputDialog("Numero de horas estimadas")));
			String genero = JOptionPane.showInputDialog("Genero del videojuego");
			String creador = JOptionPane.showInputDialog("Compañia del videojuego");
			VIdeojuego v1 = new VIdeojuego(titulo, horas, genero, creador);
			juegos[i] = v1;
		}
	}

	// funcion encontrar videojuegos y series entregados
	public static void entregados() {
		int cont = 0;
		System.out.println("-----------------------------------");
		System.out.println("Juegos y Series entregados");
		for (int i = 0; i < series.length; i++) {
			if (series[i].isEntregado() == true) {
				cont++;
				System.out.println(series[i].toString());

			} else if (juegos[i].isEntregado() == true) {
				cont++;
				System.out.println(juegos[i].toString());
			}
		}
		System.out.println("-----------------------------------");
		System.out.println("Hay un total de videojuegos y series entregados de: " + cont);
	}

	// funcion encontrar serie con mas temporadas
	
	public static void mostrarTemporadas() {
		Serie masTemporadas = new Serie();
		for (int i = 0; i < series.length; i++) {
			if (series[i].compareTo(masTemporadas)) {
				masTemporadas = series[i];
			}
		}
		System.out.println("-----------------------------------");
		System.out.println("Serie con mas temporadas");
		System.out.println(masTemporadas.toString());
	}

	// funcion encontrar videojuego con mas horas
	public static void mostrarHoras() {
		VIdeojuego masHoras = new VIdeojuego();
		for (int i = 0; i < juegos.length; i++) {
			if (juegos[i].compareTo(masHoras)) {
				masHoras = juegos[i];
			}
		}
		System.out.println("-----------------------------------");
		System.out.println("Videojuego con mas horas");
		System.out.println(masHoras.toString());
	}

	public static void mostrar() {
		series[0].entregar();
		series[4].entregar();
		juegos[1].entregar();
		juegos[2].entregar();
		System.out.println("Series:");
		for (int i = 0; i < series.length; i++) {
			System.out.println(series[i].toString());
		}
		System.out.println("-----------------------------------");
		System.out.println("Videojuegos:");
		for (int i = 0; i < juegos.length; i++) {

			System.out.println(juegos[i].toString());
		}
		entregados();
		mostrarTemporadas();
		mostrarHoras();
	}

}
