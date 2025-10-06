/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Billy
 */
public class CalculadoraM {

    public int suma(int a, int b) {
        if (b == 0) return a;
        return suma(a + 1, b - 1);
    }

    public int resta(int a, int b) {
        if (b == 0) return a;
        return resta(a - 1, b - 1);
    }

    public int multiplicacion(int a, int b) {
        if (b == 0) return 0;
        return a + multiplicacion(a, b - 1);
    }

    public int division(int a, int b) {
        if (b == 0) throw new ArithmeticException("DIVISION POR CERO");
        if (a < b) return 0;
        return 1 + division(a - b, b);
    }

    public int potencia(int a, int b) {
        if (b == 0) return 1;
        return a * potencia(a, b - 1);
    }

    public int raiz(int a) {
        return raizRecursiva(a, 1);
    }

    private int raizRecursiva(int a, int l) {
        if (l * l > a) return l - 1;
        return raizRecursiva(a, l + 1);
    }
}
