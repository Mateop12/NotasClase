package ejercicios;

import java.util.Scanner;

public class validarClave {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        String name = "pepito";
        String email = "pepito@gmail.com";
        String phone = "30000000";
        int password = 123456;
        int intentos = 3;



        //sc.nextLine();                  //RESETEO DE CAMPO - SALTO DE LINEA ADICIONAL

        do {
            System.out.println("Ingrese su usuario: ");
            String user = sc.nextLine();

            System.out.println("Ingrese su password: ");
            int userPassword = sc.nextInt();

            if((user.equals(name) && userPassword == password)) {
                System.out.println("Bienvenido " + name);
                break;
            }else {
                System.out.println("Revise sus credenciales");
                intentos--;
            }

        }while (intentos >0);

        if (intentos == 0){
            System.out.println("muchos intentos, cuenta bloqueada");
        }

    }
}
