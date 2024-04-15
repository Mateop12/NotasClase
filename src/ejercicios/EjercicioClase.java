package ejercicios;

import java.util.Scanner;

public class EjercicioClase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, opcion2;
        boolean usuarioRegistrado = false;
        String nombreUsuario = "";
        double imc = 0;

        do {
            System.out.println("Menú\n" +
                    "1.Registrar usuario\n" +
                    "2.Iniciar sesión\n" +
                    "3.Salir\n" +
                    "Seleccione una opción");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Registro de usuario");
                    System.out.print("Ingrese nombre de usuario: ");
                    nombreUsuario = sc.next();
                    usuarioRegistrado = true;
                    System.out.println("Usuario registrado exitosamente.");
                    break;
                case 2:
                    if (usuarioRegistrado) {
                        System.out.println("Iniciando sesión...");
                        System.out.print("Ingrese nombre de usuario: ");
                        String nombreIngresado = sc.next();
                        if (nombreIngresado.equals(nombreUsuario)) {
                            System.out.println("Sesión iniciada correctamente.");

                            do {
                                System.out.println("Menú\n" +
                                    "1.Calcular IMC\n" +
                                    "2.Validar rango de IMC\n" +
                                    "3.Salir\n" +
                                    "Seleccione una opción");
                                opcion2 = sc.nextInt();

                                switch (opcion2) {
                                    case 1:
                                        System.out.println("Digite su peso");
                                        double peso = sc.nextDouble();
                                        System.out.println("Digite su estatura");
                                        double estatura = sc.nextDouble();

                                        imc = Math.round(peso/(estatura*estatura));

                                        if (imc <18){
                                            System.out.println("Bajo peso");
                                        } else if (imc > 18 && imc < 25) {
                                            System.out.println("Peso normal");
                                        } else if (imc >= 25 && imc < 30) {
                                            System.out.println("Sobrepeso");
                                        } else {
                                            System.out.println("Obesidad");
                                        }
                                        System.out.println("Su IMC es: " + imc);
                                        break;
                                    case 2:
                                        if (imc <18){
                                            System.out.println("El rango en el que está es: 18 o menos, se encuentra en bajo peso");
                                            System.out.println("Recomendaciones medicas par aumentar el imc");
                                        } else if (imc > 18 && imc < 25) {
                                            System.out.println("El rango en el que está es: mayor a 18 y menor a 25, se encuentra en peso normal");
                                            System.out.println("Recomendaciones para sostener o aumentar el imc");
                                        } else if (imc >= 25 && imc < 30) {
                                            System.out.println("El rango en el que está es: mayor o igual a 25 y menor a 30, se encuentraen sobrepeso");
                                            System.out.println("Recomendaciones para bajar el imc");
                                        } else {
                                            System.out.println("El rango en el que está es: mayor a 30, se encuentra en obesidad");
                                            System.out.println("Recomendaciones para bajar obesidad");
                                        }
                                        System.out.println("Su IMC es: " + imc);
                                        break;

                                }

                            } while (opcion2 != 3);
                        } else {
                            System.out.println("Nombre de usuario incorrecto.");
                        }
                    } else {
                        System.out.println("No hay usuario registrado. Por favor, registre un usuario primero.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 3);
    }
}
