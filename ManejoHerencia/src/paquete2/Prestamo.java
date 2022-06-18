/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona beneficiario;
    protected int tiemPres;
    protected String ciudad;

    public Prestamo(Persona ben, int tiem, String ciud) {
        beneficiario = ben;
        tiemPres = tiem;
        ciudad = ciud;
    }

    public Prestamo(Persona ben, int tiem) {
        beneficiario = ben;
        tiemPres = tiem;
    }

    public void establecerBeneficiario(Persona bene) {
        beneficiario = bene;
    }

    public void establecerTiemPres(int tiem) {
        tiemPres = tiem;
    }

    public void establecerCiudad(String ciu) {
        ciudad = ciu;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerTiemPreso() {
        return tiemPres;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("Nombre del Beneficiario: %s\n"
                + "Apellido del Beneficiario: %s\n"
                + "Usuario del Beneficiario: %s\n"
                + "Tiempo de Prestamo en Meses: %d\n"
                + "Ciudad: %s\n",
                beneficiario.obtenerNombre(),
                beneficiario.obtenerApellido(),
                beneficiario.obtenerUsername(),
                tiemPres,
                ciudad);
        return cadenaFinal;
    }
}
