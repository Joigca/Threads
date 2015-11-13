
public class Minimo extends Thread{
	
	Inicio inicio;
	int[]array;
	
	public void run(){
		calculaMinimo(array);
	}
	
	public Minimo(int[]num){
		array = num;
	}
	
	public void calculaMinimo(int[]array){
		
		int minimo = 100;
		for(int i = 0; i < array.length; i++){
			
			if(minimo <= array[i]){
				minimo = minimo;
			}else{
				minimo = array[i];
			}
			
		}
		
		System.out.println("Número mínimo --> " + minimo);
		
	}

}
