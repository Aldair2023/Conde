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
public class Usuario implements java.io.Serializable{
    
    private String user;
    private String pass;

    public Usuario(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }
    
}
