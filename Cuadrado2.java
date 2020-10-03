import java.util.*;
public class Cuadrado2{
	public static void main(String [] ar){
		Scanner sc = new Scanner(System.in);
		int tam;
		System.out.println("-              CUADRADOS             -");
		System.out.println("Ingrese un numero para el tamano del cuadrado:");
			tam = sc.nextInt();
			for(int i=1; i<=tam; i++){
				for(int j=1; j<=tam; j++){
					if(j==1|| j==tam|| i==1||  i==tam){
					System.out.print("A  ");
				}else{
					System.out.print("   ");
				}
			}
			System.out.println("");
		}
		System.out.println("-   Alfredi 3-oct-2020   -");
	}
}