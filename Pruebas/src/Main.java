//import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
//		ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
//		ListaFiguras figuras = new ListaFiguras();
		ListaFiguras figuras =ListaFiguras.getInstance();
		ListaFiguras figuras2 =ListaFiguras.getInstance();
		for (int i = 0; i < 50; i++) {
			Rectangulo rec = new Rectangulo();
			figuras.meterFigura(rec);
//			Rectangulo rec = new Rectangulo(Random.nextDouble() * 100, Random.nextDouble() * 100);
//			System.out.println(" - Rectangulo Nº" + (i + 1)  + ":\n\t - Superficie: " + rec.superficie() + "\n\t - Perimetro: " + rec.perimetro());
//			System.out.printf("- Rectangulo Nº %d: \n\t - Supercifie: %f \n\t - Perimetro: %f\n", i + 1,
//					rec.superficie(), rec.perimetro());

			Triangulo tri = null;
			try {
				tri = new Triangulo();
				figuras2.meterFigura(tri);
//				System.out.printf("- Triangulo Nº %d: \n\t - Supercifie: %f \n\t - Perimetro: %f\n", i + 1,
//						tri.superficie(), tri.perimetro());
			} catch (Exception e) {
				System.out.println("* Error al crear el triangulo");
			}
			Circulo cir = new Circulo();
			figuras2.meterFigura(cir);
		}
		figuras.sacarLista().forEach(figura -> {

			System.out.printf("- Figura: \n\t- Tipo: %s \n\t- Supercifie: %f \n\t- Perimetro: %f\n", figura.getId(),
					figura.superficie(), figura.perimetro());
			if (figura instanceof Animable) {
				Animable animable = (Animable) figura;
				animable.mover();
			}

		});
	}
}
