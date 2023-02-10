
package ec.edu.intsuperior.vista;

import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
             factorial();
    }
 
    public static void promedios(){
        
       Scanner leer= new Scanner(System.in);
         double n,acu=0,prom;
        for(int i=1;i<=5;i++){
           
             System.out.println("Ingrese la nota "+i+": ");
             n=leer.nextDouble();
             acu=acu+n;
        }
        prom=acu/5;
       
        System.out.println("el promedio acumulado es: "+prom);
        if (prom<=2) {
            System.out.println("perdida matricula");
        } else {
            if (prom<=4) {
                 System.out.println("remedial");
            } else {
                if (prom<=6) {
                    System.out.println("supletorio");
                } else {
                    if (prom<=7) {
                        System.out.println("Vuelve a dar examen");
                    } else {
                        System.out.println("Aprobado");
                    }
                }
            }
        }
        
    }
    public static void factorial(){
       Scanner leer= new Scanner(System.in);
       int num,fac=1;
        System.out.println("Ingresa el numero a ser calculado");
       num=leer.nextInt();
       for(int i=1;i<=num;i++){
           fac=fac*i;
           
       }
        System.out.println("el factorial de: "+num+" es:"+fac);
    }

}
