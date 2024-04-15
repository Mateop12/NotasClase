package notasclase;

import java.util.Scanner;

public class ElseIf {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //imc = 18 o menos -> bajo peso
        //imc = > 18 y < a 25 -> peso normal
        //imc = >= 25 y < a 30 -> sobrepeso
        //imc = >=30 ->obesidad

        System.out.println("Digite su peso");
        double peso = sc.nextDouble();
        System.out.println("Digite su estatura");
        double estatura = sc.nextDouble();

        double imc = Math.round(peso/(estatura*estatura));

        if (imc <18){
            System.out.println("Bajo peso");
        } else if (imc > 18 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }
        System.out.println("Su IMC es: " + imc);
    }
}
