package notasclase;

import java.util.Scanner;

public class PracticaArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Como se declara un array

        //1er caso llenar un formulario

        String[] datosUsuario = new  String[5];     //Declarar arreglo

        //datosUsuario[0]= "William";


        for (int i = 0; i < datosUsuario.length; i++) {             //llenado de array
            System.out.println("Digite el dato #" + (i+1));
            datosUsuario[i] = sc.nextLine();
        }

        for (String datoUsuario : datosUsuario) {               //imprimir array
            System.out.println(datoUsuario);
        }

    }
}
