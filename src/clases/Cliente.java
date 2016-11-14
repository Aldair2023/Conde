/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author GABRIEL
 */
public class Cliente extends Persona {
    
    private String deuda;
    private String num_tel_fiador;
    private Trabajador encargado;

    public Cliente(String deuda, String num_tel_fiador, Trabajador encargado, String cc, String nombre, String apellido, String address, String num_tel, String sexo) {
        super(cc, nombre, apellido, address, num_tel, sexo);
        this.deuda = deuda;
        this.num_tel_fiador = num_tel_fiador;
        this.encargado = encargado;
    }

    public String getDeuda() {
        return deuda;
    }

    public void setDeuda(String deuda) {
        this.deuda = deuda;
    }

    public String getNum_tel_fiador() {
        return num_tel_fiador;
    }

    public void setNum_tel_fiador(String num_tel_fiador) {
        this.num_tel_fiador = num_tel_fiador;
    }

    public Trabajador getEncargado() {
        return encargado;
    }

    public void setEncargado(Trabajador encargado) {
        this.encargado = encargado;
    }
    

}
