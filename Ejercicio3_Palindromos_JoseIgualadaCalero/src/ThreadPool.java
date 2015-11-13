
public class ThreadPool implements Runnable{
	
	private String cadena;

	public ThreadPool(String c){
		this.cadena = c;
	}

	@Override
	public void run() {
	// TODO Auto-generated method stub
		esPalindromo(cadena);
	}

	public void esPalindromo(String cadena){
	
		if(cadena.equals(new StringBuilder(cadena).reverse().toString())){
			System.err.println(cadena + " --> Palindromo");
		}else{
			System.out.println(cadena + " --> NO Palindromo");
		}
	}

}
