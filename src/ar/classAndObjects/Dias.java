package ar.classAndObjects;

public enum Dias {
	LUNES (1),
	MARTES (2),
	MIERCOLES (3),
	JUEVES (4),
	VIERNES (5),
	SABADO (6),
	DOMINGO (7);

	private int posicion;
	
	private Dias(int pos) {
		this.posicion = pos;
	}
	
	public int getPosicion() {
		return this.posicion;
	}
	
	public static Dias getDayOf(int pos) {
		Dias arrDays[] = Dias.values();
		
		return arrDays[pos - 1];
	}
}
