package notasclase;

import java.util.Scanner;

public class PracticaArray3 {

    static Scanner sc = new Scanner(System.in);
    static String registroUsuario [] = new String[3];

    public static void main(String[] args) {

        // EN ESTA PRACTICA USAREMOS UN FOR PARA GUARDAR DATOS EN UN ARRAY

        for (int i = 0; i < registroUsuario.length; i++) {          //posicion 1. nombre 2. correo 3. clave
            System.out.println("Digite dato " + (i+1));
            registroUsuario[i] = sc.nextLine();
        }

        IniciarSesion();


    }

    public static void IniciarSesion(){

        System.out.println("Ingrese el correo");
        String correo = sc.nextLine();
        System.out.println("Ingrese contraseña");
        String password = sc.nextLine();

        if (correo.equals(registroUsuario[1]) && password.equals(registroUsuario[2])){
            System.out.println("Bienvenido " + registroUsuario[0]);

            for (String dato: registroUsuario){
                System.out.println(dato);
            }
        } else {
            System.out.println("Digite nuevamente, datos erroneos");
        }

    }
}
