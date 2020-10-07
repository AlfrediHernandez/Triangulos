import java.util.*;
public class Cuadrado3{
	public static void main(String [] ar){
		Scanner sc = new Scanner(System.in);
		int tam;
		System.out.println("                CUADRADOS              ");
		System.out.println("Ingrese un numero para el Cuadrado: ");
			tam = sc.nextInt();
			for(int a=1; a<=tam; a++){
				for(int b=1; b<=tam; b++){
					if(b==1|| b==tam|| a==1|| a==tam){
						System.out.print("M  ");
				}else{
						System.out.print("   ");
				}
			}
			System.out.println("");
		}
		System.out.println("     Alfredi 7-oct-2020    ");
	}
}