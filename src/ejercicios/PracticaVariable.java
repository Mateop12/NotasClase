package ejercicios;

public class PracticaVariable {

    public static void main(String[] args) {

        String nombre= "Mateo", apellido= "patiño", direccion = "calle 32", curso = "moviles", pago = "900000", pagoCarnet = "150000" ;
        int edad = 23;
        long telefono = 321884144l;
        double totalPagos = 0;
        boolean activo = true;

        Double pagoInt = Double.parseDouble (pago);
        Double pagoCarnetInt = Double.parseDouble (pagoCarnet);

        totalPagos = pagoInt + pagoCarnetInt;

        System.out.println("El nombre completo es: " + nombre + " "
        + apellido + " la dirección es: " + direccion + "\n" + "el curso es: " + curso
        + " Esta activo ?: " + activo + "\n"
        + "el total a pagar por el curso es: " +totalPagos);


    }
}
