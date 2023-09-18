package funcionesParaPalabras;

public class PrimerChar {

	public static char obtenerPrimerChar(String palabra) {
		return palabra.charAt(0);
	}

	public static boolean letrasEsNumero(char letra) {
		return  ((int)(letra)>47 && (int)(letra)< 58)? true:false;
		
	}

	public static boolean letraEsMin(char letra) {
		return  ((int)(letra)>96 && (int)(letra)< 123)? true:false;
	}

	public static boolean letraEsMayus(char letra) {
		return  ((int)(letra)>64 && (int)(letra)< 91)? true:false;
	}

	 static String palabraEs(char letra) {
		String result="Other";
		if(letrasEsNumero(letra)) {
			 result="Number";
		}else {
			if(letraEsMin(letra)) {
				result="Minus";
			}else {
				if(letraEsMayus(letra)) {
					result="Mayus";
				}
			}
		}
		return result;
	}
	
	public static String verificarPalabra(String palabra) {
		char primerChar =obtenerPrimerChar(palabra);
		System.out.println("La palabra es:"+palabraEs(primerChar));
		return palabraEs(primerChar);
	}


}
