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
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
  
    
    public static LinkedList traerDatos(String ruta){
        FileInputStream archivo;
        ObjectInputStream entrada;
        LinkedList personas = new LinkedList();
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
    
    public static void llenarTablaTrabajadores(JTable tabla, String ruta){
        DefaultTableModel tm;
        int nf;
        LinkedList<Trabajador> trabajadores = traerDatos(ruta);
        tm = (DefaultTableModel)tabla.getModel();
        limpiadoTabla(tabla);
        nf = trabajadores.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i+1, i, 0);
            tabla.setValueAt(trabajadores.get(i).getCc(), i, 1);
            tabla.setValueAt(trabajadores.get(i).getNombre(), i, 2);
            tabla.setValueAt(trabajadores.get(i).getApellido(), i, 3);
            tabla.setValueAt(trabajadores.get(i).getAddress(), i, 4);
            tabla.setValueAt(trabajadores.get(i).getNum_tel(), i, 5);
            tabla.setValueAt(trabajadores.get(i).getSexo(), i, 6);
        }
    }
    
     public static void llenarTablaClientes(JTable tabla, String ruta){
        DefaultTableModel tm;
        int nf;
        LinkedList<Cliente> clientes = traerDatos(ruta);
        tm = (DefaultTableModel)tabla.getModel();
        limpiadoTabla(tabla);
        nf = clientes.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i+1, i, 0);
            tabla.setValueAt(clientes.get(i).getDeuda(), i, 1);
            tabla.setValueAt(clientes.get(i).getNum_tel_fiador(), i, 2);
            tabla.setValueAt(clientes.get(i).getEncargado().getNombre(), i, 3);
            tabla.setValueAt(clientes.get(i).getCc(), i, 4);
            tabla.setValueAt(clientes.get(i).getNombre(), i, 5);
            tabla.setValueAt(clientes.get(i).getApellido(), i, 6);
            tabla.setValueAt(clientes.get(i).getAddress(), i, 7);
            tabla.setValueAt(clientes.get(i).getNum_tel(), i, 8);
            tabla.setValueAt(clientes.get(i).getSexo(), i, 9);
        }
    }
    
     public static void llenarTablaTrabajadores(JTable tabla, LinkedList<Trabajador> trabajadores){
        DefaultTableModel tm;
        int nf;
        tm = (DefaultTableModel)tabla.getModel();
        limpiadoTabla(tabla);
        nf = trabajadores.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i+1, i, 0);
            tabla.setValueAt(trabajadores.get(i).getCc(), i, 1);
            tabla.setValueAt(trabajadores.get(i).getNombre(), i, 2);
            tabla.setValueAt(trabajadores.get(i).getApellido(), i, 3);
            tabla.setValueAt(trabajadores.get(i).getAddress(), i, 4);
            tabla.setValueAt(trabajadores.get(i).getNum_tel(), i, 5);
            tabla.setValueAt(trabajadores.get(i).getSexo(), i, 6);
        }
    }
     
     public static void llenarTablaClientes(JTable tabla, LinkedList<Cliente> clientes){
        DefaultTableModel tm;
        int nf;
        tm = (DefaultTableModel)tabla.getModel();
        limpiadoTabla(tabla);
        nf = clientes.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i+1, i, 0);
            tabla.setValueAt(clientes.get(i).getDeuda(), i, 1);
            tabla.setValueAt(clientes.get(i).getNum_tel_fiador(), i, 2);
            tabla.setValueAt(clientes.get(i).getEncargado().getNombre(), i, 3);
            tabla.setValueAt(clientes.get(i).getCc(), i, 4);
            tabla.setValueAt(clientes.get(i).getNombre(), i, 5);
            tabla.setValueAt(clientes.get(i).getApellido(), i, 6);
            tabla.setValueAt(clientes.get(i).getAddress(), i, 7);
            tabla.setValueAt(clientes.get(i).getNum_tel(), i, 8);
            tabla.setValueAt(clientes.get(i).getSexo(), i, 9);
        }
    }
    
    public static void listadoPorSexo(JTable tabla, String ruta, String sexo){
        LinkedList<Trabajador> trabajadores = traerDatos(ruta);
        LinkedList<Trabajador> trabajadoresFiltradas = new LinkedList();
        for (int i = 0; i < trabajadores.size(); i++) {
            if (trabajadores.get(i).getSexo().equals(sexo)) {
                trabajadoresFiltradas.add(trabajadores.get(i));
            }
        }
        llenarTablaTrabajadores(tabla, trabajadoresFiltradas);
    }
    
    public static void volcado(ObjectOutputStream salida, LinkedList personas){
        for (int i = 0; i < personas.size(); i++) {
            try {
                salida.writeObject(personas.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public static boolean buscarTrabajadorCedula(String cc, String ruta){
        LinkedList<Trabajador> trabajadores = traerDatos(ruta);
        for (int i = 0; i < trabajadores.size(); i++) {
            if (trabajadores.get(i).getCc().equals(cc)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean buscarClienteCedula(String cc, String ruta){
        LinkedList<Cliente> clientes = traerDatos(ruta);
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCc().equals(cc)) {
                return true;
            }
        }
        return false;
    }
    
    public static Trabajador traerTrabajadorCedula(String cc, String ruta){
        LinkedList<Trabajador> trabajadores = traerDatos(ruta);
        for (int i = 0; i < trabajadores.size(); i++) {
            if (trabajadores.get(i).getCc().equals(cc)) {
                return trabajadores.get(i);
            }
        }
        return null;
    }
    
    public static Cliente traerClienteCedula(String cc, String ruta){
        LinkedList<Cliente> clientes = traerDatos(ruta);
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCc().equals(cc)) {
                return clientes.get(i);
            }
        }
        return null;
    }
    
    public static LinkedList<Trabajador> modificarTrabajador(String ruta, String cc, String nombre, String apellido, String address, String num_tel, String sexo){
        LinkedList<Trabajador> trabajadores = traerDatos(ruta);
        for (int i = 0; i < trabajadores.size(); i++) {
            if (trabajadores.get(i).getCc().equals(cc)) {
                trabajadores.get(i).setNombre(nombre);
                trabajadores.get(i).setApellido(apellido);
                trabajadores.get(i).setAddress(address);
                trabajadores.get(i).setNum_tel(num_tel);
                trabajadores.get(i).setSexo(sexo);
                return trabajadores;
           }
       }
       return null;
    }
    
    public static LinkedList<Cliente> modificarCliente(String ruta, String deuda, String num_tel_fiador, Trabajador encargado, String cc, String nombre, String apellido, String address, String num_tel, String sexo){
        LinkedList<Cliente> clientes = traerDatos(ruta);
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCc().equals(cc)) {
                clientes.get(i).setNombre(nombre);
                clientes.get(i).setApellido(apellido);
                clientes.get(i).setAddress(address);
                clientes.get(i).setNum_tel(num_tel);
                clientes.get(i).setNum_tel_fiador(num_tel_fiador);
                clientes.get(i).setEncargado(encargado);
                clientes.get(i).setSexo(sexo);
                clientes.get(i).setDeuda(deuda);
                return clientes;
           }
       }
       return null;
    }
    
    public static void llenarComboTrabajadores(JComboBox combo, String ruta){
        LinkedList<Trabajador> trabajadores = traerDatos(ruta);
        DefaultComboBoxModel dcbm =(DefaultComboBoxModel) combo.getModel();
        dcbm.removeAllElements();
        Trabajador t;
        for (int i = 0; i < trabajadores.size(); i++) {
            t = trabajadores.get(i);
           dcbm.addElement(t.getCc()+" - "+t.getNombre()+" "+t.getApellido());
        }
    } 
    
}
