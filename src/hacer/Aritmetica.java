package hacer;

import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Aritmetica {

    public Aritmetica() {
    }
    
    public int sumar(int numero1, int numero2){
        int resultado=0;
        resultado = numero1+numero2;
        return resultado;
    }
    public int resta(int numero1, int numero2){
        int resultado=0;
        resultado = numero1-numero2;
        return resultado;
    }
    
    public int multiplicacion(int numero1, int numero2){
        int resultado=0;
        resultado = numero1*numero2;
        return resultado;
    }
    public int dividir(int numero1, int numero2)throws Exception{
        int resultado=0;
        
        if(numero2==0){
            throw new Exception("el numero no puede ser 0");
             //numero2 = numero2;
        }
        resultado=(int)(numero1/numero2);
        return resultado;
        
    }
}
