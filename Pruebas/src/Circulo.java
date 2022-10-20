
public class Circulo extends FiguraGeometrica implements Animable {
	double radio;

	Circulo() {
		super("Circulo");
		radio = Math.random() * 10;
	}

	Circulo(String id, double radio) {
		super(id);
		this.radio = radio;
	}

	@Override
	public double superficie() {
		return Math.PI * (radio * radio);
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * radio;
	}

	@Override
	public void mover() {
		System.out.println("MIRA COMO ME MUEVO FIUUUUUUUUUUUU \nSOY UN CIRCULO FIUUUUUUUUUUUUUUUUUUU");
	}
}
