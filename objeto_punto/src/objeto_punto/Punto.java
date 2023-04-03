package objeto_punto;

import java.util.Objects;

public class Punto implements Comparable<Punto> {
	double x, y;

	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double getModulo() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}

	public Punto mover(double dx, double dy) {
		return new Punto(this.x + dx, this.y + dy);
	}
	
	@Override
	public int compareTo(Punto o) {
		Double miModulo = this.getModulo();
		Double otroModulo = o.getModulo();
		return miModulo.compareTo(otroModulo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.x, this.y);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		Punto punto = (Punto) obj;
		
		if(Double.doubleToLongBits(this.x) != Double.doubleToLongBits(punto.x))
			return false;
		if(Double.doubleToLongBits(this.y) != Double.doubleToLongBits(punto.y))
			return false;
		return true;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Punto(this.x, this.y);
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
}
