/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete1.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoAutomovil;
    private String marca;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensual;

    public PrestamoAutomovil(Persona bene, int tiem, String ciu, String tipo,
            String mar, Persona garan, double valorAu) {
        super(bene, tiem);
        establecerCiudad(ciu);
        tipoAutomovil = tipo;
        marca = mar;
        garante1 = garan;
        valorAutomovil = valorAu;
    }

    @Override
    public void establecerCiudad(String ciu) {
        ciudad = ciu.toLowerCase();
    }

    public void establecerTipoAutomovil(String tipo) {
        tipoAutomovil = tipo;
    }

    public void establecerMarca(String mar) {
        marca = mar;
    }

    public void establecerGarante1(Persona gar) {
        garante1 = gar;
    }

    public void establecerValorAutomovil(double val) {
        valorAutomovil = val;
    }

    public void calcularValorMensual() {
        valorMensual = valorAutomovil / tiemPres;
    }

    public String obtenerTipoAutomovil() {
        return tipoAutomovil;
    }

    public String obtenerMarca() {
        return marca;
    }

    public Persona obtenerGarante1() {
        return garante1;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {

        String cadenaFinal = String.format("Prestamo Automovil\n%s"
                + "Tipo de Automovil: %s\n"
                + "Marca de Automovil: %s\n"
                + "Nombre del Garante: %s\n"
                + "Apellido del Garante: %s\n"
                + "Usuario del Garante: %s\n"
                + "Valor del Automovil: %.2f\n"
                + "Valor Mensual de Pago: %.2f\n"
                + "------------------------------------",
                super.toString(),
                tipoAutomovil,
                marca,
                garante1.obtenerNombre(),
                garante1.obtenerApellido(),
                garante1.obtenerUsername(),
                valorAutomovil,
                valorMensual);
        return cadenaFinal;
    }
}
