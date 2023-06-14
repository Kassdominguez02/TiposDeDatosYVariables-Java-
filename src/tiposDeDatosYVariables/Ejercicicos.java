package tiposDeDatosYVariables;

public class Ejercicicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Hola Mundo");
		
		//tipo de datos
		
			//byte: sirve para representar un valor numerico de 8 bits
		
			byte salas=10;
			System.out.println(salas);
			
			//short: sirva para un valor numerico de 16 bits
			
			short numDeAsientos=1120;
			System.out.println(numDeAsientos);
			
			
			//int:sirve para almacenar un valor numerico de 32 bits
			
			int dulces= 3476;
			
			System.out.println(dulces);
			
			long clientes=313600l;
			System.out.println(clientes);
			
			
			//datos que pueden tener numero decimales
			
			//float: sirve para valores num de 32bits
			
			float palomitas=35.5f;
			System.out.println(palomitas);
			
			//double: sirve para valores numericos de 64bits
			
			
			
			
			double ganancia=23770880.7d;
			System.out.println(ganancia);
			
			//boolean
			
			// char: sirve para representar un caracter o num, pero solamente 1 digito
			
			// casting o casteo: sirve para realizar una conversion de tipos de datos a uno mas grande o mas pequeño o diferente
			
			double num=59.7d;
			
			//casteo
			
			int numInt=(int)num; //solo quita el decimal, no redondea
			
			System.out.println(numInt);
			
			
			long numlong=(long)num;
			
			System.out.println(numlong);
			
			
			String cantidad="85";
			
			String precio="59.7";
			
			int cantidadEntero=Integer.parseInt(cantidad);
			double precioDouble= Double.parseDouble(precio);
			
			System.out.println("el valor de la compra es : "+ (cantidadEntero*precioDouble));
			
			//operadores aritmeticos
			
			int dias=28;
			
			dias=dias/2;
			System.out.println(dias);
			
			//operadores de incremento y decremento
			
			int p=0;
			
			p++;
			p++;
			p++;
			
			System.out.println(p);
			
			// operadores relacionales
			
			//== compara si un operador es igual a otro
			//!0 diferente a
		
			
			int a=10;
			int b=15;
			boolean resultado;
			
			resultado=a!=b;
			
			System.out.println(resultado);
			
			
		
		
		
		
		
		
		
		
		

	}

}
