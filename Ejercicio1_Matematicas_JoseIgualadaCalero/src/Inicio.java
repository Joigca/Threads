
public class Inicio {
	
	static final int TOTAL = 2000;
	static int[] vector = new int[100];
	static Media media;
	static Maximo maximo;
	static Minimo minimo;
	
	
	public Inicio(){
	}
	
	public static void main(String[] args) {
		crearVector();
		media = new Media(vector);
		maximo = new Maximo(vector);
		minimo = new Minimo(vector);
		
		try {
			media.start();
			media.join();
			
			maximo.start();
			maximo.join();
			
			minimo.start();
			minimo.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	
	public static void crearVector(){
		
		for(int i = 0; i < vector.length; i++){
			vector[i] = (int)(Math.random()* TOTAL + 1);
		}
		System.out.println("Has generado un array de --> " + vector.length + " elementos");
		
	}

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}

	public static int getTotal() {
		return TOTAL;
	}
	
}
