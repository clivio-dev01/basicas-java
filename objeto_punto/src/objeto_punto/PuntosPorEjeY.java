package objeto_punto;

import java.util.Comparator;

public class PuntosPorEjeY implements Comparator<Punto>{

	@Override
	public int compare(Punto o1, Punto o2) {
		return o1.getY().compareTo(o2.getY());	
	}
	
}
