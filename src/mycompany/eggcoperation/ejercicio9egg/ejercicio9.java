package mycompany.eggcoperation.ejercicio9egg;
import java.util.Scanner;
public class ejercicio9 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		double suma=0, nu,i=0;
		
		do {
			i++;
			System.out.println("Ingrese el primer numero");
			nu = num.nextDouble();
			if(nu>0) {
				suma=suma+nu;
			}else if(nu==0) {
				System.out.println("Se capturo el numero cero");
				break;
			}
		}while(i<20);{
			System.out.println("La suma es: " + suma);
		}

	}

}
