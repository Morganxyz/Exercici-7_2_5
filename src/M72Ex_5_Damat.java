import java.util.Scanner;

public class M72Ex_5_Damat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		int i = 0;
		int sumaRest = 0;
		boolean pri = false;
				
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdueix un nombre: ");
		num1 = entrada.nextInt();
	
		pri = primo(num1,i,sumaRest);
		
		System.out.println(primo(num1,i,sumaRest) ? ("El numero es primo"):("El número no es primo"));	
		
	}
	
	public static boolean primo (int num1,int i, int sumaRest) {
		
		boolean pri = false;
		
		for(i = 1; i <= num1; i++) {
			
			if(num1 % i == 0) {
				sumaRest++;
			}
		}
		if(sumaRest <= 2) {
			pri = true;
			
		}else {
			pri = false;
		}
		
			return pri;
			
	}	
}
	

	


