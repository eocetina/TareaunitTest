/**
 * 
 */
package funcionesParaPalabras;

import java.text.Normalizer;
import java.util.Iterator;

/**
 * 
 */
public class CasiPalindromos {
//	String palabra;
//	/**
//	 * 
//	 */
//	public CasiPalindromos(String palabrainicial) {
//	this.palabra= palabrainicial;
//	}
	
	
	static String normalizarPalabra(String palabra) {
		return palabra.toLowerCase();
	 };
	 
	 boolean esPalindromo(String palabra1,String palabra2) {
		 return  (palabra1==palabra2);
	 };
	 
	static String invertirPalabra(String palabra) {
	        // conversion from String object to StringBuffer
	        StringBuffer sbr = new StringBuffer(palabra);
	        // To reverse the string
	       String palabrarevertida=new String(sbr.reverse().toString());
	        return palabrarevertida;
	 };
	 
	 
	static int revisarDiferencias(String palabra1,String palabra2) {
		int diferencias=0;
		for (int i = 0; i < palabra1.length(); i++) { 
			if (palabra1.charAt(i)!=palabra2.charAt(i)) {
				diferencias++;
			}
		}
		return diferencias; 
	 };
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String palabra= "Oso";
		normalizarPalabra(palabra);
		invertirPalabra();
		

	}

}

