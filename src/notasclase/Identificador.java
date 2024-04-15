package notasclase;

import java.util.Scanner;

public class Identificador {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] rostros = {"Carlos","Maria","Pedro"};
        System.out.println("Acerque su rostro");
        String studentFace = sc.nextLine();


        if (studentFace.equals(rostros[0]) || studentFace.equals(rostros[1]) || studentFace.equals(rostros[2])){ //SIRVE PARA VALIDAR POCOS ELEMENTOS EN EL ARRAY
            System.out.println("Bienvenido");
        }else {
            System.out.println("Dirijase a la oficina de registro");
        }
    }
}
