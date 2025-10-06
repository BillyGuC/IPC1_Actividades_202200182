/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.CalculadoraM;
import modelo.User;
import vista.CalculadoraVista;
/**
 *
 * @author Billy
 */
public class CalculadoraControlador {
    private CalculadoraM modelo;
    private CalculadoraVista vista;
    private User usuario;

    public CalculadoraControlador(CalculadoraM modelo, CalculadoraVista vista, User usuario) {
        this.modelo = modelo;
        this.vista = vista;
        this.usuario = usuario;

        this.vista.usuarioLbl.setText(usuario.getNombre());

        this.vista.sumaBtn.addActionListener(e -> realizarOperacion("suma"));
        this.vista.restaBtn.addActionListener(e -> realizarOperacion("resta"));
        this.vista.multiBtn.addActionListener(e -> realizarOperacion("multi"));
        this.vista.divBtn.addActionListener(e -> realizarOperacion("div"));
        this.vista.potenciaBtn.addActionListener(e -> realizarOperacion("potencia"));
        this.vista.raizBtn.addActionListener(e -> realizarOperacion("raiz"));
    }

    private void realizarOperacion(String tipo) {
        try {
            int num1 = Integer.parseInt(vista.num1Field.getText());
            int num2 = 0;
            if (!tipo.equals("raiz")) {
                num2 = Integer.parseInt(vista.num2Field.getText());
            }
            int resultado = 0;

            switch (tipo) {
                case "suma":
                    resultado = modelo.suma(num1, num2);
                    break;
                case "resta":
                    resultado = modelo.resta(num1, num2);
                    break;
                case "multi":
                    resultado = modelo.multiplicacion(num1, num2);
                    break;
                case "div":
                    resultado = modelo.division(num1, num2);
                    break;
                case "potencia":
                    resultado = modelo.potencia(num1, num2);
                    break;
                case "raiz":
                    resultado = modelo.raiz(num1);
                    break;
            }
            vista.resultadoLbl.setText("Resultado: " + resultado);
        } catch (NumberFormatException ex) {
            vista.resultadoLbl.setText("Error: Ingresa números válidos");
        } catch (ArithmeticException ex) {
            vista.resultadoLbl.setText("Error: " + ex.getMessage());
        }
    }
}