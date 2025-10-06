/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Billy
 */
public class CalculadoraVista extends JFrame {
    public JTextField num1Field = new JTextField(10);
    public JTextField num2Field = new JTextField(10);
    public JButton sumaBtn = new JButton("Suma");
    public JButton restaBtn = new JButton("Resta");
    public JButton multiBtn = new JButton("Multiplicación");
    public JButton divBtn = new JButton("División");
    public JButton potenciaBtn = new JButton("Potencia");
    public JButton raizBtn = new JButton("Raíz (solo primer número)");
    public JLabel resultadoLbl = new JLabel("Resultado:");
    public JLabel usuarioLbl = new JLabel();

    public CalculadoraVista() {
        setTitle("Calculadora MVC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 250);

        JPanel panel = new JPanel(new GridLayout(7, 2, 5, 5));
        panel.add(new JLabel("Usuario:"));
        panel.add(usuarioLbl);
        panel.add(new JLabel("Primer número:"));
        panel.add(num1Field);
        panel.add(new JLabel("Segundo número:"));
        panel.add(num2Field);

        panel.add(sumaBtn);
        panel.add(restaBtn);
        panel.add(multiBtn);
        panel.add(divBtn);
        panel.add(potenciaBtn);
        panel.add(raizBtn);

        panel.add(new JLabel(""));
        panel.add(resultadoLbl);

        add(panel);
        setLocationRelativeTo(null);
    }
}