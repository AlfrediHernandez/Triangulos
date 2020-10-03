import java.util.Scanner;
public class Piramide2{
	public static void main(String [] ar){
		Scanner sc = new Scanner (System.in);
		char espacio=' ',asterisco='A';
		int x;
		System.out.println("=              Piramides            =");
		System.out.println("Ingrese un numero para la Piramide: ");
			x = sc.nextInt();
			for(int i=1; i<=x; i++){
				for(int espacios=x+1; espacios>i; espacios--)
					System.out.print(espacio);
				for(int lineas=1; lineas<2*i; lineas++)
					System.out.print(asterisco);
					System.out.println("");
		}
		System.out.println("=   Alfredi 3-oct-2020   =");
	}
}