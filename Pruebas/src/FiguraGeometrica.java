
public abstract class FiguraGeometrica {
	String id;

	FiguraGeometrica(String id) {
		this.id = id;
	}

	abstract double superficie();

	abstract double perimetro();

	String getId() {
		return id;
	}
}
