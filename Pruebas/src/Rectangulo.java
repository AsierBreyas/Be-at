import java.util.Random;

public class Rectangulo extends FiguraGeometrica implements Animable {
	private double altura;
	private double ancho;
	Random random = new Random();

	@Override
	double perimetro() {
		return Math.round((altura * 2) + (ancho * 2) * 100.0) / 100.0;
	}

	@Override
	double superficie() {
		return Math.round((altura * ancho) * 100.0) / 100.0;
	}

	Rectangulo(String id, double altura, double ancho) {
		super("id");
		this.altura = altura;
		this.ancho = ancho;
	}

	Rectangulo() {
		super("Rectangulo");
		altura = random.nextDouble() * 10;
		ancho = random.nextDouble() * 10;
	}

	@Override
	public void mover() {
		System.out.println("MIRA COMO ME MUEVO FIUUUUUUUUUUUU \nSOY UN CUADRADO FIUUUUUUUUUUUUUUUU");
	}
}
