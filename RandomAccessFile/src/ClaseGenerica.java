
public class ClaseGenerica <T, Y> {
	private T patata ;
	private Y alcachofa;
	
	public ClaseGenerica(T t, Y y) {
		patata = t;
		alcachofa = y;
	}
	public T getPatata() {
		return patata;
	}
	public Y getAlcachofa() {
		return alcachofa;
	}

}
