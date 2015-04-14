import java.util.Scanner;

//añadimos comentario para simular cambios en nuestro proyecto

//añadirmos segundo comentario.... otra versión del proyecto



public class Esprimo {
	
	public static void main (String [] ar){
		int numero;
		boolean resultado;
		Scanner teclado= new Scanner (System.in);
		System.out.print("por favor introduzca un número entero positivo  :: ");
		numero=teclado.nextInt();
		resultado = Esprimo.esprimo(numero);
		if (resultado == true){
			System.out.print("El número introducido es PRIMO");
		}
		else{
			System.out.print("El número introducido NO es primo");
		}
	}
	
	public static boolean esprimo(int num){
		if (num>0){
			boolean primo=true;
			for (int i=2; i<num; i++){
				if (num%i==0){primo=false;}	
			}
			return primo;
		}
		else{
			Esprimo.error("número negativo");
			return false;}
	}
	
	public static void error(String s){
		System.out.print(s);
	}
}
