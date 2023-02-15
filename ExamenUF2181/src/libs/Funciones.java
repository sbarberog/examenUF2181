
package libs;

/**
 * Funciones matemáticas varias.
 * @author Sergio Barbero Gómez
 *
 */
public class Funciones {
	
	/**
	 * Devuelve el número cuyo valor se encuentra comprendido entre los otros dos números
	 *  recibidos como parámetros.
	 * @param num1 Primer número entero.
	 * @param num2 Segundo número entero.
	 * @param num3 Tercer número entero.
	 * @return Número entero cuyo valor está comprendido entre los otros dos.
	 */
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ((num1>=num2) && (num1<=num3) || (num1>=num3) && (num1<=num2)) {
			enMedio=num1;
		}  else if  ((num2>=num1) && (num2<=num3) || (num2>=num3) && (num2<=num1)) {
			enMedio= num2;
		} else {
			enMedio = num3; 
		}
		return enMedio;
	}
	
	/**
	 * Devuelve los minutos de diferencia entre dos horas de un mismo día introducidas 
	 * como parámetros.
	 * Si las horas o minutos introducidos no son correctos, devolverá una excepción 
	 * de tipo ArithmeticException.
	 * @param hora1 Horas enteras correspondientes a la primera hora.
	 * @param min1 Minutos enteros correspondientes a la primera hora.
	 * @param hora2 Horas enteras correspondientes a la segunda hora.
	 * @param min2 Minutos enteros correspondientes a la segunda hora.
	 * @return Minutos enteros de diferencia entre las dos horas.
	 */
	public int minutosEntre(int hora1, int min1, int hora2, int min2) {
		if(hora1<0 || hora1>23 || hora2<0 || hora2>23 
				|| min1<0 || min1>59 || min2<0 || min2>59) {
			throw new ArithmeticException();
		}
		
		int min1Totales=hora1*60 + min1;
		int min2Totales=hora2*60 + min2;
		
		return Math.abs(min1Totales-min2Totales);
	}
	
	/**
	 * Indica si el vector introducido es capicúa o no.
	 * @param v Vector de enteros.
	 * @return Booleano <strong>true</strong> si el vector es capicúa, 
	 * o <strong>false</strong> si no lo es.
	 */
	public boolean esCapicua(int v[]) {
		boolean capicua = true;
		
		for (int i=0, j=v.length-1; i<v.length/2; i++,j--) {
			if (v[i]!=v[j]) {
				capicua=false;
			}
		}
		return capicua;
	}

	/**
	 * Devuelve el vector suma de los dos vectores introducidos como parámetros.
	 * En caso de que los vectores no tengan la misma longitud, devolverá una excepción
	 * de tipo ArithmeticException.
	 * @param v Primer vector de enteros.
	 * @param v2 Segundo vector de enteros.
	 * @return Vector de enteros resultante de la suma de ambos vectores parámetro.
	 */
	public int [] suma_vectores(int v[], int v2[]) {
		int vector_suma [] = new int[v.length];
		
		if (v.length!=v2.length) 
		   throw new ArithmeticException("Los vectores deben tener el mismo tamaño");
		
		for (int i = 0; i < vector_suma.length; i++) {
			vector_suma[i]=v[i]+v2[i];
		}
		return vector_suma;
	}
	
	
}
