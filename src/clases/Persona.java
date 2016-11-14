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
 * @author GABRIEL
 */
public class Persona implements java.io.Serializable {
    private String cc;
    private String nombre;
    private String apellido;
    private String address;
    private String num_tel;
    private String sexo;

    public Persona(String cc, String nombre, String apellido, String address, String num_tel, String sexo) {
        this.cc = cc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.address = address;
        this.num_tel = num_tel;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }
    
     public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public final void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }
    
}
