/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Jhona
 */
public class InstitucionEducativa {

    private String nombreInst;
    private String siglas;
    
    public InstitucionEducativa(String nom,String sig){
        nombreInst= nom;
        siglas=sig;
    }
    public void establecerNombreInst(String nom) {
        nombreInst = nom;
    }

    public void establecerSiglas(String sig) {
        siglas = sig;
    }

    public String obtenerNombreInst() {
        return nombreInst;
    }

    public String obtenerSiglas() {
        return siglas;
    }
}
