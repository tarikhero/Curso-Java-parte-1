
public class TestaFor {

	public static void main(String[] args) {
		
		for (int contador = 0; contador <= 10 ; contador++){	
			System.out.println(contador);		
		}	
		
		//esse sysout n�o vai funcionar, pois o contador est� no escopo do for
		//System.out.println(contador);
	}	
}
