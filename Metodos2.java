// EJERCICIO MÉTODOS 2
// Dada una letra y una cadena, indica las veces que aparece la letra en la cadena.

class metodo{
	int i;
	int j;
	int longitud;
	int num;
	int num_aux;
	boolean aux;
	 	
	int veces(String s1, char letra) {
		 i = 0;
		 j = 0;
		 num_aux = 0;
		 aux = false;
		 longitud = s1.length(); // se extrae la longitud de la cadena de texto y se almacena.
	 while (i < longitud) { 
		 num = s1.indexOf(letra , i);
		 
		 if (num > i) {
			 num_aux = num;
			 aux = true; 
		 } else {aux = false;}
		 
		 if (aux != true) 
			 j++;
		 
		 if (num == -1)
			 j--;
		 i++;
	 }
	
	 return j; 
	 
	 }
}

public class Metodos2 {
	public static void main(String args[]) {
		metodo numero = new metodo();
		System.out.println ("La letra a aparece " + numero.veces("programa java", 'a') + " veces.");
	}	
}