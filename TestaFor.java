
public class TestaFor {

	public static void main(String[] args) {
		
		for (int contador = 0; contador <= 10 ; contador++){	
			System.out.println(contador);		
		}	
		
		//esse sysout não vai funcionar, pois o contador está no escopo do for
		//System.out.println(contador);
	}	
}
