package notasclase;

public class ArraySimple {

    public static void main(String[] args) {

        // ESTE ARRAY ES ESTATICO - INICIALIZADO
        int edades[] = {35, 45, 23, 38, 46,0};

        /*
        System.out.println(edades[0]);
        System.out.println(edades[1]);
        System.out.println(edades[2]);
        System.out.println(edades[5]);
        */
        edades[5]= 40;
        //System.out.println(edades[5]);

        //Para recorrer los array tenemos las estructuras for y foreach
        //podemos saber el tamaño del array usando el atributo .length

        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }
        System.out.println("----------------");

        System.out.println("-----CICLO foreach--------");
        for (int i:edades){
            System.out.println(i);              //el i se puede cambiar
        }

        //podemos recorrer el array con un ciclo while

        System.out.println("------CICLO WHILE");
        int i = 0;
        while (i < edades.length){
            System.out.println(edades[i]);
            i++;
        }
    }

}
