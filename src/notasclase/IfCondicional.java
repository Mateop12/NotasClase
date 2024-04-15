package notasclase;

import java.util.Scanner;

public class IfCondicional {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        String name = "pepito";
        String email = "pepito@gmail.com";
        String phone = "30000000";
        int password = 123456;

        System.out.println("Ingrese su usuario: ");
        String user = sc.nextLine();

        System.out.println("Ingrese su password: ");
        int userPassword = sc.nextInt();

        sc.nextLine();                  //RESETEO DE CAMPO - SALTO DE LINEA ADICIONAL

        if((user.equals(email)|| user.equals(phone)) && userPassword == password) {
            System.out.println("Bienvenido " + name);

        }else {
            System.out.println("Revise sus credenciales");
        }

    }
}
