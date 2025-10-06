/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;
import modelo.CalculadoraM;
import modelo.User;
import vista.CalculadoraVista;
import controlador.CalculadoraControlador;
import javax.swing.JOptionPane;

/**
 *
 * @author Billy
 */



public class Calculadora {



    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre:");
        User usuario = new User(nombre);
        CalculadoraM modelo = new CalculadoraM();
        CalculadoraVista vista = new CalculadoraVista();
        new CalculadoraControlador(modelo, vista, usuario);
        vista.setVisible(true);
    }
}
