/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;
import java.util.Scanner;

/**
 *
 * @author Billy
 */



public class Calculadora {

// Scanner    
static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        
        String tipo;
        do{
            System.out.println("------ CALCULADORA ------");
            System.out.println("uno. SUMA ");
            System.out.println("dos. RESTA");
            System.out.println("tres. MULTIPLICACION");
            System.out.println("cuatro. DIVISION");
            System.out.println("cinco. POTENCIA");
            System.out.println("seis. RAIZ");
            System.out.println("siete. SALIR");
            tipo = sc.nextLine();
            

            switch(tipo){
                // Suma
                case "uno":
                    System.out.println("INGRESE EL PRIMER NUMERO");
                    int a = sc.nextInt(); 
                    sc.nextLine();
                    
                    System.out.println("INGRESE EL SEGUNDO NUMERO");
                    int b = sc.nextInt();
                    sc.nextLine();
                    
                    int resultadoSuma = Suma(a,b);
                    System.out.println("EL RESULTADO DE LA SUMA ES: "+resultadoSuma);
                    break;
                case "dos" :
                // Resta
                    System.out.println("INGRESE EL PRIMER NUMERO");
                    int c = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("INGRESE EL SEGUNDO NUMERO");
                    int d = sc.nextInt();
                    sc.nextLine();
                    
                    int resultadoResta = Resta(c,d);
                    System.out.println("EL RESULTADO DE LA RESTA ES: "+ resultadoResta );
                    break;
                case "tres":
                // Multiplicación
                    System.out.println("INGRESE EL PRIMER NUMERO");
                    int e = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("INGRESE EL SEGUNDO NUMERO");
                    int f = sc.nextInt();
                    sc.nextLine();
                    
                    int resultadoMulti = Multiplicacion(e,f);
                    System.out.println("EL RESULTADO DE LA MULTIPLICACION ES: " + resultadoMulti);
                    break;
                case "cuatro":
                // División
                    System.out.println("INGRESE EL PRIMER NUMERO");
                    int g = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("INGRESE EL SEGUNDO NUMERO");
                    int h = sc.nextInt();
                    sc.nextLine();
                    
                    int resultadoDivision = Division(g,h);
                    System.out.println("EL RESULTADO DE LA DIVISION ES: " + resultadoDivision);
                    break;
                case "cinco":
                // Potencia
                    System.out.println("INGRESE EL PRIMER NUMERO");
                    int i = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("INGRESE EL SEGUNDO NUMERO");
                    int j = sc.nextInt();
                    sc.nextLine();
                    
                    int resultadoPotencia = potencia(i,j);
                    System.out.println("EL RESULTADO DE LA POTENCIA ES: " + resultadoPotencia);
                    break;
                case "seis":
                // Raiz
                    System.out.println("INGRESE EL NUMERO");
                    int k = sc.nextInt();
                    sc.nextLine();
                    
                    int resultadoRaiz = raiz(k,1);
                    System.out.println("LA RAÍZ CUADRADA ENTERA ES: " + resultadoRaiz);
                    break;
                case "siete":
                System.out.println("SALIENDO DE CALCULADORA");
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
                    break;

            }
        }while(!tipo.equals("siete"));
    }
        
    static int Suma(int a, int b){               
        if(b == 0 ){
            return a;
        }else{
            return Suma(a+1, b-1);
        }              
    }
    static int Resta(int c, int d){
        if(d == 0 ){
            return c;
        }else{
            return Resta(c-1,d-1);
        }
    }
    static int Multiplicacion(int e, int f){
       if(f==0){
           return 0;
       }else{
           return e + Multiplicacion(e, f-1);
       }
    }
    static int Division (int g, int h){
        if(h==0){
             throw new ArithmeticException("DIVISION POR CERO");
        }else if(g<h){
            return 0;
        }else{
            return 1 + Division(g-h,h);
        }
    }
    static int potencia (int i, int j ){
        if(j == 0){
            return 1;
        }else{
            return i * potencia(i,j-1);
        }
    }
    static int raiz (int k, int l){
        if(l*l>k){
            return l-1;
        }else{
            return raiz(k, l+1);
        }
    }
}
