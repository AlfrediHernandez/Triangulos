import java.util.Scanner; 
public class Piramide{
	public static void main(String [] ar){
		Scanner sc = new Scanner(System.in);
		char espacio=' ',asterisco='@';
		int x;
		System.out.println("--------------------------------------");
		System.out.println("-             PRIRAMIDES             -");
		System.out.println("--------------------------------------");
		System.out.println("Ingrese numero filas para la piramide:");
			x = sc.nextInt();
			for(int a=1; a<=x; a++){
			for(int espacios=x+1; espacios>a; espacios--)
				System.out.print(espacio);
			for(int lineas=1; lineas<2*a; lineas++)
				System.out.print(asterisco);
				System.out.println("");
		}
		System.out.println("                                    ");
		System.out.println("------------------------------------");
		System.out.println("-   AlfrediHernandez 10-sep-2020   -");
		System.out.println("------------------------------------");
	}
}
