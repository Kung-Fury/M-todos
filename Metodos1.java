// EJERCICIO MÉTODOS 1
// De las dos cadenas introducidas en la función devuelve la más larga.

class cadena{
	int largo1;
	int largo2;
	String str;
	String maslarga(String cad1, String cad2){
		largo1 = cad1.length();
		largo2 = cad2.length();
		if (largo1 > largo2) 
			str = cad1;
		if (largo2 > largo1)
			str = cad2;
		return str;
	}
}

public class Metodos1 {
	public static void main(String args[]) {
		cadena var = new cadena();
		if (var.maslarga("programa" , "spring") != null)
			System.out.println(var.maslarga("programa" , "spring"));
		else
			System.out.println("Ambas cadenas tienen la misma longitud.");
	}


}
