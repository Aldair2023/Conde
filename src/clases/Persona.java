/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author gcoronad2
 */
public class Persona implements java.io.Serializable{
    private String cc;
    private String nombre;
    private String apellido;
    private String deuda;
    private String sexo;

    public Persona(String cc, String nombre, String apellido, String deuda, String sexo) {
        this.cc = cc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.deuda = deuda;
        this.sexo = sexo;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDeuda() {
        return deuda;
    }

    public void setDeuda(String deuda) {
        this.deuda = deuda;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }
    
}
