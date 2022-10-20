import java.util.Random;

public class Triangulo extends FiguraGeometrica {
	private double lado1;
	private double lado2;
	private double lado3;
	Random random = new Random();

	Triangulo(String id, double l1, double l2, double l3) throws Exception {
		super(id);
		if (!check(l1, l2, l3)) {
			throw new Exception();
		}
		lado1 = l1;
		lado2 = l2;
		lado3 = l3;
	}

	Triangulo() throws Exception {
		super("Triangulo");
		double l1 = Math.random() * 10;
		double l2 = Math.random() * 10;
		double l3 = Math.random() * 10;
		if (!check(l1, l2, l3)) {
			throw new Exception();
		}
		lado1 = l1;
		lado2 = l2;
		lado3 = l3;
	}

	@Override
	double perimetro() {
		return lado1 + lado2 + lado3;
	}

	@Override
	double superficie() {
		double s = perimetro() / 2;
		return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
	}

	private boolean check(double l1, double l2, double l3) {
		if (l1 + l2 <= l3) {
			return false;
		} else if (l1 + l3 <= l2) {
			return false;
		} else if (l2 + l3 <= l1) {
			return false;
		} else {
			return true;
		}
	}
}
