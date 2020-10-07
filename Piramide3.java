import java.util.Scanner;
public class Piramide3{
	public static void main(String [] ar){
		Scanner sc = new Scanner(System.in);
		char espacio=' ',asterisco='M';
		int x;
		System.out.println("              PIRAMIDES              ");
		System.out.println("Ingrese un numero para la piramide: ");
			x = sc.nextInt();
			for(int a=1; a<=x; a++){
			for(int espacios=x+1; espacios>a; espacios--)
				System.out.print(espacio);
			for(int lineas=1; lineas<2*a; lineas++)
				System.out.print(asterisco);
				System.out.println("");
		}
		System.out.println("        Alfredi 7-oct-2020      ");
	}
}