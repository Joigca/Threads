import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
		
		String cadena[] = new String[]{"palabras", "executor", "ana", "amor y roma", "esto es una frase", "auricular", "movil", "ordenador",
				"raton", "teclado", "agua", "gafas", "anillo", "pulsera", "ojo", "ladron", "silla", "pantalones", "uña", "oso", "zapato", 
				"bufanda", "mochila", "tapon", "cable"};
		
		for(int i = 0; i < cadena.length; i++){
			
			ThreadPool threadPool = new ThreadPool(cadena[i]);
			executor.execute(threadPool);
			
		}
			
	}
		
}