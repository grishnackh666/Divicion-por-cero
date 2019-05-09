
package hacer;

import java.util.Scanner;


public class Mainsuma{

    
    public static void main(String[] args) {
        Aritmetica arit = new Aritmetica();
        Scanner numero = new Scanner(System.in);
        int nume1, nume2, resultado, opcion;
        boolean o = true;
        while(o){
            
            System.out.println("1:sumar");
            System.out.println("2:restar");
            System.out.println("3:multi");
            System.out.println("4:dividir");
            opcion=numero.nextInt();
        switch (opcion){
            case 1:
                System.out.println("ingrese numero 1: " );
                nume1 = numero.nextInt();
                System.out.println("ingrese numero 2: " );
                nume2 = numero.nextInt();
                resultado = arit.sumar(nume1,nume2);
                System.out.println("la suma es "+resultado);
                
                case 2:
                System.out.println("ingrese numero 1: " );
                nume1 = numero.nextInt();
                System.out.println("ingrese numero 2: " );
                nume2 = numero.nextInt();
                resultado = arit.resta(nume1,nume2);
                System.out.println("la suma es "+resultado);
                
                case 3:
                System.out.println("ingrese numero 1: " );
                nume1 = numero.nextInt();
                System.out.println("ingrese numero 2: " );
                nume2 = numero.nextInt();
                resultado = arit.multiplicacion(nume1,nume2);
                System.out.println("la suma es "+resultado);
                
                case 4:
                    try{
                System.out.println("ingrese numero 1: " );
                nume1 = numero.nextInt();
                System.out.println("ingrese numero 2: " );
                nume2 = numero.nextInt();
                resultado = arit.dividir(nume1,nume2);
                System.out.println("la suma es "+resultado);
                 }catch(Exception e){
                        System.out.println("no se puede dividir entre 0 ");
                }
        }
                
        }
        
        
    }
    
}
