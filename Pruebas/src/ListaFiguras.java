import java.util.ArrayList;

public final class ListaFiguras {

	private static ArrayList<FiguraGeometrica> lista;
	private static ListaFiguras instance;

	private ListaFiguras() {
		lista = new ArrayList<FiguraGeometrica>();
	}

	public static ListaFiguras getInstance() {
		if(instance == null)
			instance = new ListaFiguras();
		return instance;
	}
	
	public static void meterFigura(FiguraGeometrica figura) {
		lista.add(figura);
	}

	public static ArrayList<FiguraGeometrica> sacarLista() {
		return lista;
	}
}
