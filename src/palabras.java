/*Realice un algoritmo que use un método sin parámetros y sin retorno que imprime en pantalla tu nombre completo*/

/*7. Realiza un algoritmo donde se simule un diccionario simple. Crea un HashMap o HashTable donde las claves sean palabras en inglés y los valores sean las traducciones al español. Permite al usuario ingresar una palabra en inglés y muestra su traducción en español si está en el diccionario.*/
import java.util.Hashtable;

import javax.swing.JOptionPane;


public class palabras {
	public static void main(String[] args) {
		palabras diccionario=new palabras();
		diccionario.palabrasEnDiccionario();
	}
	public void palabrasEnDiccionario() {
		Hashtable<String, String> palabra = new Hashtable<String, String>();
		
		palabra.put("Hello", "Hola");
		palabra.put("Sorry", "Perdon");
		palabra.put("Love", "Amor");
		
		JOptionPane.showMessageDialog(null, palabra.get("Hello"));
	}
}
