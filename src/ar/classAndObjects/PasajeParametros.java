package ar.classAndObjects;

public class PasajeParametros {
	
	class Contenedor {
		private int value;
		
		public Contenedor(int i) {
			this.value = i;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
		
		
	}
	
	private Contenedor incrementarContenedor(int value) {
		Contenedor cont = new Contenedor(value);
		
		System.out.println("Previo incremento de value -> " + value);
		this.incrementar(cont);
		System.out.println("Post incremento de value -> " + cont.getValue());
		
		return cont;
	}
	
	private void incrementar(int value) {
		value += 1;
		System.out.println("Value -> " + value);
	}

	private void incrementar(Contenedor c) {
		c.setValue(c.getValue() + 1);
		System.out.println("Value -> " + c.getValue());
	}	
	
	public static void main(String[] args) {
		PasajeParametros pp = new PasajeParametros();
		
		int inicial = 10;
		
		System.out.println("Inicial -> " + inicial);
		
		pp.incrementar(inicial);

		System.out.println("Inicial -> " + inicial);

		
		Contenedor c = new PasajeParametros().new Contenedor(inicial);
		
		pp.incrementar(c);
		
		System.out.println("Inicial por contenedor -> " + c.getValue());

		
		Contenedor c2 = pp.incrementarContenedor(inicial);
		
		
		System.out.println("Inicial por contenedor 2 -> " + c2.getValue());		
	}

}
