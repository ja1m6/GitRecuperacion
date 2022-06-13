/**
 * Clase Principal
 * @author JoseLuis Almansa
 *
 */
public class PrincipalApp {
	public static void main(String []args) {
		String frase="mañana me voy a la playa";
		calcularletras(frase);
	}
/**
 * 
 * @param Metodo para Calcular Letras
 */
	public static void calcularletras(String frase) {
		int ca=0,cu=0,ci=0,ce=0,co=0;
			for(int p=0;p<frase.length();p++) {
				char letra = frase.charAt(p);
				if(String.valueOf(letra).equals("a")) {
					ca++;
				}
				if(String.valueOf(letra).equals("e")) {
					ce++;
				}
				if(String.valueOf(letra).equals("u")) {
					cu++;
				}
				if(String.valueOf(letra).equals("i")) {
					ci++;
				}
				if(String.valueOf(letra).equals("o")) {
					co++;
				}
				
		}
		System.out.println("Contador A "+ca);
		System.out.println("Contador E "+ce);
		System.out.println("Contador I "+ci);
		System.out.println("Contador O "+co);
		System.out.println("Contador U "+cu);
	}
}
