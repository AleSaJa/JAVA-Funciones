package functions;
import java.lang.Math;
import java.util.Scanner;

public class CalculatorBrain {

	static double suma(double a,double b) {
        return a+b;

    }
    static double resta(double a,double b) {
        return a-b;

    }
    static double multiplicacion(double a,double b) {
        return a*b;

    }
    static double division(double a,double b) {
        return a/b;

    }
    static double raiz(double a) {
    	return Math.sqrt(a);
    }
    static double potencia(double a, double b) {
    	return Math.pow(a,b);    	
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Que operación deseas hacer");

            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Multiplicación");
            System.out.println("4-División");
            System.out.println("5-Raiz cuadrada");
            System.out.println("6-Potencia");

            System.out.println("7-Salir");

            int option = s.nextInt();

            System.out.println("Ingresa el primer número");
            double num1 = s.nextDouble();
        double num2 = 0;
            if(option != 5){
                System.out.println("Ingresa el segundo número");
                num2 = s.nextDouble();
            }

            s.nextLine();


            switch (option){
                case 1:
                    System.out.println(suma(num1,num2));
                    break;
                case 2:
                    System.out.println(resta(num1,num2));
                    break;
                case 3:
                    System.out.println(multiplicacion(num1,num2));
                    break;
                case 4:
                    System.out.println(division(num1,num2));
                    break;
                case 5:
                    System.out.println("Raíz cuadrada: " + raiz(num1));
                    break;
                case 6:
                    System.out.println(String.format("%s ^ %s: %s ",num1,num2, potencia(num1,num2)));
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Error");

            }

        }

    }
}
