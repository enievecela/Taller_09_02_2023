
package ec.edu.intsuperior.vista;

import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
            desintegrarNumero();
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

    public static void sumaDosNumeros(){
        Scanner leer = new Scanner(System.in);
        int n1,n2;
        System.out.println("Ingresa el numero 1:");
        n1=leer.nextInt();
        System.out.println("Ingresa el numero 2:");
        n2=leer.nextInt();
        System.out.println("La suma es: "+(n1+n2));
    }
    
    public static void generarNumerosEnteros(){
        Scanner leer= new Scanner(System.in);
        int n1, n2;
        System.out.println("Ingresa el limite inferior");
        n1=leer.nextInt();
        System.out.println("Ingresa el numero superior mayor a:"+n1);
        n2=leer.nextInt();
        for(int i=n1;i<(n2-1);i++){
            System.out.print(i+1+" ");
        }
    }
    
    public static void desintegrarNumero(){
        Scanner leer = new Scanner(System.in);
        int num,aux=0;
        System.out.println("Ingresa un numero positivo");
        num= leer.nextInt();
       
        //aux=numero-numero/10*10;
       while(num>aux){
        aux=num%10;
        num=num/10;
        System.out.println(aux+"    "+num);
       }
    }
}
