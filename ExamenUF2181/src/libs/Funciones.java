
package libs;


public class Funciones {
	
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ((num1>num2) && (num1<num3) || (num1>num3) && (num1<num2)) {
			enMedio=num1;
		}  else if  ((num2>num1) && (num2<num3) || (num2>num3) && (num2<num1)) {
			enMedio= num2;
		} else {
			enMedio = num3;
		}
		return enMedio;
	}
	
	public int minutosEntre(int hora1, int min1, int hora2, int min2) {
		return 0;
	}
	
	
	public static boolean esCapicua(int v[]) {
		boolean capicua = true;
		
		for (int i=0, j=v.length-1; i<v.length/2; i++,j--) {
			if (v[i]!=v[j]) {
				capicua=false;
			}
		}
		return capicua;
	}

	public static int [] suma_vectores(int v[], int v2[]) {
		int vector_suma [] = new int[v.length];
		
		if (v.length!=v2.length) 
		   throw new ArithmeticException("Los vectores deben tener el mismo tama�o");
		
		for (int i = 0; i < vector_suma.length; i++) {
			vector_suma[i]=v[i]+v2[i];
		}
		return vector_suma;
	}
	
	
}
