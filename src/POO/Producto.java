package POO;

import java.util.Scanner;

public class Producto {

    Scanner sc = new Scanner(System.in);

    //ATRIBUTOS

    int id;
    String name;
    double price;
    String category;

    String[][] products = new String[5][4]                  //almacenando 5 productos x 4 campos


    //METODOS

    public void createProduct(){
        String[] producto = new String[5];

        System.out.println("Ingrese el Id: ");
        id = sc.nextInt();
        producto[0] = id+"";                    //parseo de int a string
        sc.nextLine();                          //para que entre al siguiente campo, int y depsues string recomendable poner esta linea
        System.out.println("Ingrese nombre: ");
        name = sc.nextLine();
        System.out.println("Ingrese precio: ");
        price= sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese categoria: ");
        category = sc.nextLine();

        products[0] = producto;         //implementar while
    }


    public void selectProduct(){

    }

    public void updateProduct(){

    }

    public void deleteProduct(){

    }
}
