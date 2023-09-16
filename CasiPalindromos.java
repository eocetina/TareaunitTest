/**
 * 
 */
package funcionesParaPalabras;

/**
 * 
 */
public class CasiPalindromos {
	String str;
	/**
	 * 
	 */
	public CasiPalindromos(String palabrainicial) {
	this.str= palabrainicial;
	}
	
	
	public static String normalizarPalabra(String palabra) {
		return palabra.toLowerCase();
	 };
	 
	 
	 
	public static String invertirPalabra(String palabra) {
	        // conversion from String object to StringBuffer
	        StringBuffer sbr = new StringBuffer(palabra);
	        // To reverse the string
	       String palabrarevertida=new String(sbr.reverse().toString());
	        return palabrarevertida;
	 };
	 
	 
	public static int revisarDiferencias(String palabra,String palabraInvertida) {
		int diferencias=0;
		for (int i = 0; i < palabra.length(); i++) { 
			if (palabra.charAt(i)!=palabraInvertida.charAt(i)) {
				diferencias++;
			}
		}
		return diferencias; 
	 };
	/**
	 * @param args
	 */
	 public static boolean esCasiPalindromo(String palabra) {
		String palabraNormalizada= normalizarPalabra(palabra.replaceAll("[, ]",""));
		String palabraInvertidaNormalizada=invertirPalabra(palabraNormalizada);
		
		if(revisarDiferencias(palabraNormalizada, palabraInvertidaNormalizada)==2) {
				System.out.println(palabra+" es casiPalindromo");
				return true;
			}
		
		return false;
	}
	 
	 public boolean esCasiPalindromo() {
			String palabraNormalizada= normalizarPalabra(str.replaceAll("[, ]",""));
			String palabraInvertidaNormalizada=invertirPalabra(palabraNormalizada);
			
			if(revisarDiferencias(palabraNormalizada, palabraInvertidaNormalizada)==2) {
					System.out.println(str+" es casiPalindromo");
					return true;
				}
			
			return false;
		}

}
