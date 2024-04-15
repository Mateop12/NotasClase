package notasclase;
import java.util.Scanner;

public class Operadores {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //int resultado = 3+2/7*3;
        //System.out.println(resultado);

        System.out.println("Ingrese valor uno");
        int num1 = sc.nextInt();

        System.out.println("Ingrese valor dos");
        int num2 = sc.nextInt();

        int operacionSuma = num1 + num2;
        int operacionResta = num1 - num2;
        int operacionMultip = num1 * num2;
        int operacionDiv = num1 / num2;

        boolean esMayor = num1 > num2;
        boolean esMenor = num1 < num2;
        boolean mayorIgual = num1 >= num2;
        boolean menorIgual = num1 <= num2;
        boolean noEsIgual = num1 != num2;

        boolean telefono = false;
        boolean correo = true;
        boolean password = true;
        boolean ingreso = (telefono || correo) && password ;

        System.out.println("su ingreso es: " + ingreso);

        System.out.println("El resultado es: "+operacionSuma);
        System.out.println("El resultado es: "+operacionResta);
        System.out.println("El resultado es: "+operacionMultip);
        System.out.println("El resultado es: "+operacionDiv);

        System.out.println("num1 es mayor a num 2: " + esMayor);
        System.out.println("num1 es menor a num 2: " + esMenor);
        System.out.println("num1 es mayor o igual a num 2: " + mayorIgual);
        System.out.println("num1 es menor o igual a num 2: " + menorIgual);
        System.out.println("num1 diferente a num 2: " + noEsIgual);

        //EJEMPLO USO DE OPERADORES DE ASIGNACION

        int num3 = 0;

        //num3 = num3 + num2;
        //num3 = num3 + num1;    //
        num3 += num1;           // SE SUMA EL MISMO Y EL NUM1 - EQUIVALE A UN CONTADOR
        //num3++;               //SUMA UNO AL MISMO VALOR (CONTADOR)

        System.out.println(num3);
    }
}
