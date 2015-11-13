
public class Maximo extends Thread{
	
	Inicio inicio;
	int[]array;
	
	public void run(){
		calculaMaximo(array);
	}
	
	public Maximo(int[]num){
		array = num;
	}
	
	public void calculaMaximo(int[]array){
		
		int maximo = 0;
		for(int i = 0; i < array.length; i++){
			
			if(maximo >= array[i]){
				maximo = maximo;
			}else{
				maximo = array[i];
			}
			
		}
		
		System.out.println("Número máximo --> " + maximo);
		
	}
	
}
