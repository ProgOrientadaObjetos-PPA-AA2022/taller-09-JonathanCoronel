/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;
        String cadena = "";
        do {
            System.out.printf("Menu de opciones de los Tipos de Prestamos\n"
                    + "1-Prestamo de Automovil\n2-Prestamo De Estudiante\n");
            int opc = entrada.nextInt();
            if (opc != 1 && opc != 2) {
                System.out.println("Valor fuera del Rango Permitido");
            } else {
                entrada.nextLine();
                System.out.println("Ingrese los Nombres del Beneficiario");
                String nom = entrada.nextLine();
                System.out.println("Ingrese los Apellidos del Beneficiario");
                String ape = entrada.nextLine();
                System.out.println("Ingrese el Usuario del Beneficiario");
                String iden = entrada.nextLine();
                Persona benefi = new Persona(nom, ape, iden);
                System.out.println("Tiempo del Préstamo en Meses");
                int tiem = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ciudad del Préstamo");
                String ciu = entrada.nextLine();
                if (opc == 1) {
                    System.out.println("Tipo de Automovil");
                    String tipoAuto = entrada.nextLine();
                    System.out.println("Marca del Automovil");
                    String marca = entrada.nextLine();
                    System.out.println("Ingrese los Nombres del Garante");
                    String nomga = entrada.nextLine();
                    System.out.println("Ingrese los Apellidos del Garante");
                    String apega = entrada.nextLine();
                    System.out.println("Ingrese el Usuario del Garante");
                    String usuga = entrada.nextLine();
                    Persona garante = new Persona(nomga, apega, usuga);
                    System.out.println("Ingrese el valor del Automovil");
                    double valAuto = entrada.nextDouble();
                    PrestamoAutomovil presAutomovil
                            = new PrestamoAutomovil(benefi, tiem, ciu, tipoAuto,
                                    marca, garante, valAuto);
                    presAutomovil.calcularValorMensual();
                    cadena = String.format("%s%s\n", cadena, presAutomovil);
                } else {
                    if (opc == 2) {
                        System.out.println("Nivel de Estudio");
                        String nivel = entrada.nextLine();
                        System.out.println("Nombre de la Institucion Educativa");
                        String nomInsti = entrada.nextLine();
                        System.out.println("Siglas de la Institucion Educativa");
                        String siglas = entrada.nextLine();
                        InstitucionEducativa insti
                                = new InstitucionEducativa(nomInsti, siglas);
                        System.out.println("Ingrese el valor de la Carrera");
                        double valorCar = entrada.nextDouble();
                        PrestamoEducativo presEducativo
                                = new PrestamoEducativo(benefi, tiem, ciu,
                                        nivel, insti, valorCar);
                        presEducativo.calcularValorMensual();
                        cadena = String.format("%s%s\n", cadena, presEducativo);
                    }
                }
            }
            entrada.nextLine();
            System.out.println("Para salir del Programa Digite (n), "
                    + "para continuar digite cualquier tecla");
            String salida = entrada.nextLine();
            if (salida.equals("n")) {
                bandera = false;
            }
        } while (bandera);
        System.out.println("------------------------------------");
        System.out.printf("%s\n", cadena);
    }
}
