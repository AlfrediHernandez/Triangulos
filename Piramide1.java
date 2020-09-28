import java.util.*;
public class Piramide1{
	public static void main(String [] ar){
		Scanner sc = new Scanner(System.in);
		char espacio=' ',asterisco='&';
		int x;
		System.out.println("-------------------------------");
		System.out.println("-          Piramides          -");
		System.out.println("-------------------------------");
		System.out.println("Porfavor ingrese un Numero:");
			x = sc.nextInt();
			for(int i=1; i<=x; i++){
			for(int espacios=x+1; espacios>i; espacios--)
				System.out.print(espacio);
			for(int lineas=1; lineas<2*i; lineas++)
				System.out.print(asterisco);
				System.out.println("");
		}
		System.out.println("                           ");
		System.out.println("---------------------------");
		System.out.println("-   Alfredi 28-sep-2020   -");
		System.out.println("---------------------------");
	}
}