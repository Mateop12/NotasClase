package notasclase;

import java.util.Scanner;

public class PracticaArray2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //String paises[]= new String[5];

        System.out.println("Digite primer pais");
        String primerPais = sc.nextLine();
        System.out.println("Digite segundo pais");
        String segundoPais = sc.nextLine();
        System.out.println("Digite tercer pais");
        String tercerPais = sc.nextLine();

        String paises[] = {primerPais,segundoPais,tercerPais};

        System.out.println(paises[0]);
        System.out.println(paises[1]);
        System.out.println(paises[2]);

        System.out.println("-------For-----------");
        for (int i = 0; i < paises.length; i++) {
            System.out.println("el pais  "  + (i+1) + " ingresado es " + paises[i]);
        }


    }
}
