
public class Media extends Thread{
	
	Inicio inicio;
	int[]array;
	
	public void run(){
		calculaMedia(array);
	}
	
	public Media(int[]num){
		array = num;
	}
	
	public void calculaMedia(int[]array){
		
		int suma = 0;
		int total = array.length;
		int media = 0;
		
		for(int i = 0; i < array.length; i++){
			suma = suma + array[i];
		}
		
		media = (int)(suma / total);
		System.out.println("Media --> " + media);
		
	}
}
