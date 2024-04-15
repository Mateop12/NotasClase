package notasclase;

public class Variable {

    public static void main (String[] args) {

        byte numByte;                   //declarar variable

        numByte = 127;                  // variable inicialiazada

        short numShort = 32767;

        int numInt = 21455555;

        //CASTING DE VARIABLE

        short numByteShort = (short) numByte;           //VARIABLE CASTEO

        System.out.println(numByteShort);

        numByteShort = 128;

        System.out.println(numByteShort);

        int numShortInt = (int) numByteShort;

        numShortInt = 1160000;

        System.out.println(numShortInt);


        //PARSEO

        String numString = "32";

        int numStringToInt = Integer.parseInt(numString); //metodo para casteo, cambiar tipo de dato de variable

        System.out.println(numStringToInt);

        int numInt2 = 25;
        String numIntToSting = 25 + "";          //parseo a string, pasar el 25 a texto.

        //VARIABLES X TIPO DE DATOS

        String name = "pepito";

        byte num1 = 127;

        float nota = 4.5f;

        double salary = 1300000;

        long numeroLargo = 3218841452l;

        boolean trabaja = true;

        boolean casado = false;

        char arroba = 64;    //caracteres unicode

        System.out.println(arroba);

        final float PI = 3.1416f;  // declarar constante, se nombra en mayuscula


        //concatenacion con operador +

        String nombre = "mateo";
        int edad = 23;
        double pagoRecibido = 1300000;
        boolean esEmpleado = true;

        System.out.println("El empleado " + nombre + "\n"
                +"tiene " + edad + "\n"
                +"años y gana "
                +pagoRecibido + "\n"
                +"se encuentra activo: "+esEmpleado);
    }
}
