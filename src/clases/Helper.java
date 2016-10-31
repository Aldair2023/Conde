/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gcoronad2
 */
public class Helper {
    
     public static void mensaje(Component ventana, String mensaje, int tipo_mensaje) {
        switch (tipo_mensaje) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "INFO", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setRowCount(0);
        tm.setColumnCount(0);
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);
        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);
        }
    }

   public static int[][] pasoDeDatos(JTable tabla1){
        int nf, nc;
        int m[][];
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        m = new int [nf][nc];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int)tabla1.getValueAt(i, j);
            }
        }
        return m;
    }
  
    
    public static ArrayList traerDatos(String ruta){
        FileInputStream archivo;
        ObjectInputStream entrada;
        ArrayList personas = new ArrayList();
        Object p;
        try {
            archivo = new FileInputStream(ruta);
            entrada = new ObjectInputStream(archivo);
            while ((p=entrada.readObject())!=null) {
                personas.add(p);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return personas;
    }
    
    public static void llenarTabla(JTable tabla, String ruta){
        DefaultTableModel tm;
        int nf;
        ArrayList<Persona> personas = traerDatos(ruta);
        tm = (DefaultTableModel)tabla.getModel();
        limpiadoTabla(tabla);
        nf = personas.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i+1, i, 0);
            tabla.setValueAt(personas.get(i).getCc(), i, 1);
            tabla.setValueAt(personas.get(i).getNombre(), i, 2);
            tabla.setValueAt(personas.get(i).getApellido(), i, 3);
            tabla.setValueAt(personas.get(i).getDeuda(), i, 4);
            tabla.setValueAt(personas.get(i).getSexo(), i, 5);
        }
    }
    
     public static void llenarTabla(JTable tabla, ArrayList<Persona> personas){
        DefaultTableModel tm;
        int nf;
        tm = (DefaultTableModel)tabla.getModel();
        limpiadoTabla(tabla);
        nf = personas.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i+1, i, 0);
            tabla.setValueAt(personas.get(i).getCc(), i, 1);
            tabla.setValueAt(personas.get(i).getNombre(), i, 2);
            tabla.setValueAt(personas.get(i).getApellido(), i, 3);
            tabla.setValueAt(personas.get(i).getDeuda(), i, 4);
            tabla.setValueAt(personas.get(i).getSexo(), i, 5);
        }
    }
    
    public static void listadoPorSexo(JTable tabla, String ruta, String sexo){
        ArrayList<Persona> personas = traerDatos(ruta);
        ArrayList<Persona> personasFiltradas = new ArrayList();
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getSexo().equals(sexo)) {
                personasFiltradas.add(personas.get(i));
            }
        }
        llenarTabla(tabla, personasFiltradas);
    }
    
    public static void volcado(ObjectOutputStream salida, ArrayList personas){
        for (int i = 0; i < personas.size(); i++) {
            try {
                salida.writeObject(personas.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public static boolean buscarPersonaCedula(String cc, String ruta){
        ArrayList<Persona> personas = traerDatos(ruta);
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getCc().equals(cc)) {
                return true;
            }
        }
        return false;
    }
    
    public static Persona traerPersonaCedula(String cc, String ruta){
        ArrayList<Persona> personas = traerDatos(ruta);
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getCc().equals(cc)) {
                return personas.get(i);
            }
        }
        return null;
    }
    
    public static ArrayList<Persona> modificarPersona(String ruta, String cc, String nombre, String apellido, String deuda, String sexo){
        ArrayList<Persona> personas = traerDatos(ruta);
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getCc().equals(cc)) {
                personas.get(i).setNombre(nombre);
                personas.get(i).setApellido(apellido);
                personas.get(i).setDeuda(deuda);
                personas.get(i).setSexo(sexo);
                return personas;
           }
       }
       return null;
    }
    
    
}
