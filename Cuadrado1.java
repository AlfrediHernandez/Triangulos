import java.util.Scanner;
public class Cuadrado1{
	public static void main(String [] ar){
		Scanner sc = new Scanner(System.in);
		int tam;
		System.out.println("-------------------------------");
		System.out.println("-          Cuadrados          -");
		System.out.println("-------------------------------");
		System.out.println("Por favor Ingrese un numero:");
			tam = sc.nextInt();
			for(int i=1; i<=tam; i++){
			for(int j=1; j<=tam; j++){
				if(j==1|| j==tam|| i==1|| i==tam){
					System.out.print("&  ");
				}else{
					System.out.print("   ");
				}
			}
			System.out.println("");
		}
		System.out.println("                           ");
		System.out.println("---------------------------");
		System.out.println("-   Alfredi 28-sep-2020   -");
		System.out.println("---------------------------");
	}
} 