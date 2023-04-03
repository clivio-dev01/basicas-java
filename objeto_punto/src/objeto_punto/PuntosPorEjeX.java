package objeto_punto;

import java.util.Comparator;

public class PuntosPorEjeX implements Comparator<Punto>{

	@Override
	public int compare(Punto o1, Punto o2) {
		return o1.getX().compareTo(o2.getX());
	}
	
}
