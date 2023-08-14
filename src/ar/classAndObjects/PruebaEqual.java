package ar.classAndObjects;

public class PruebaEqual {
  private String nombre;
  
  public PruebaEqual(String n) {
	  this.nombre = n;
  }

  @Override
  public boolean equals(Object obj) {
	  
	  
	  System.out.println("Comparando " + this.getClass() + " con "+ obj.getClass());
	  if (obj instanceof PruebaEqual) {
		  return this.equals((PruebaEqual)obj);
//		  return this.equals(obj);
	  } else {
		  return super.equals(obj);
	  }
  }  

  public boolean equals(PruebaEqual obj) {
	  return this.nombre.equals(obj.nombre);
  }
  
  
  public static void main(String[] args) {
	  PruebaEqual p1 = new PruebaEqual("Hola");
	  Object p2 = new PruebaEqual("Hola");
//	  PruebaEqual p2 = new PruebaEqual("Hola");
	  
	  System.out.println(p1.equals(p2));
	  
	  
	  
	  Dias hoy = Dias.JUEVES;
	  
	  System.out.println(hoy.name() + " " + hoy.getPosicion() + " " + Dias.getDayOf(hoy.getPosicion()));
  }
}
