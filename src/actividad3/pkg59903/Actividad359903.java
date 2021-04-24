/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3.pkg59903;
import java.util.Scanner;
/**
 *
 * @author Adrian Quej
 */
public class Actividad359903 {
    public static int opciones;
    public static void encabezado() {
        System.out.println("---------------------------------");
        System.out.println("Universidad Autonoma de Campeche");
        System.out.println("Facultad de Ingenieria");
        System.out.println("Ingenieria en Sistemas Computacionales");
        System.out.println("Abril 2021");
        System.out.println("ADRIAN ERNESTO AGUILAR QUEJ");
    }
    public static void cuerpo(){
        System.out.println("--------------------");
        System.out.println("ACTIVIDAD 3");
        System.out.println("Seleccione la opcion a efectuar");
        System.out.println("1 - Obtener la suma consecutiva del 0 al 10");
        System.out.println("2 - Obtener el factorial del 1 al 10");
        System.out.println("3 - Obtener el factorial de un numero introducido");
        System.out.println("4 - Calcular la media de la suma del 0 hasta un número introducido");
        System.out.println("5 - Suma,Promedio,Menor y Mayor, distancia entre mayor y menor de los números");
        System.out.println("6 - Arreglo con los nombres de la semana");
        System.out.println("7 - Arreglo de 3 X 3 con el modelo del juego gato");
        System.out.println("--------------------");
    }
    public static void pie(){
        System.out.println("-----------");
        System.out.println("AQ.2021");
    }
    public static void SumaConsecutiva(){
        int suma=0;
        for(int i=0; i<=10; i++){
            suma+=i;
        }
        System.out.println("La suma consecutiva del 0 al 10 es = " + suma);
    }
    public static void factorial(){
        int factorial;
        factorial = 1;
        for (int i = 1; i <= 10; i++) {
            //factorial = factorial + (factorial*i);
            factorial *=i;
        }
        System.out.println("El factorial del 1 al 10 es = " + factorial);
    }
    public static void factorialNumIntro(){
        int numero;
        Scanner miConsola = new Scanner(System.in);
        System.out.println("Escribe un numero natural : ");
        numero = miConsola.nextInt();
        double factorial;
        factorial = 1;
        for (int i = numero; i >= 1; i--) {
            //factorial = factorial + (factorial*i);
            factorial *=i;
        }
        System.out.println("El factorial de "+numero +" es de = " + factorial);
        
    }
    public static void MediaNumero(){
        int numero;
        double cantidad;
        double media= 0;
        Scanner miConsola = new Scanner(System.in);
        System.out.println("Escribe un numero entero: ");
        numero = miConsola.nextInt();
        int suma=0;
        for(int i=0; i<=numero; i++){
            suma+=i;
        }
        if (numero>0) {
            cantidad= numero+1;
            media=suma/cantidad;
            System.out.println("La media de la suma entre 0 y " + numero +" es de =" + media);
        } else{
            System.out.println("Ingrese un numero entero positivo");
        }
    }    
    public static void OperacionesNnumeros(){
        int numero;
        double suma= 0;
        int numaden;
        double cantidad=0;
        int mayor = -9999999;
        int menor = 99999999;
        double promedio;
        int diferencia;
        Scanner miConsola = new Scanner(System.in);
        System.out.println("¿Con cuantos numeros quieres que opere? : ");
        numero = miConsola.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println("Ingrese un numero: ");
            numaden = miConsola.nextInt();
            suma+=numaden;
            cantidad++;
            if (numaden > mayor) {
                mayor=numaden;
            }
            if (numaden < menor) {
                menor=numaden;
            }
        }
        promedio = suma/cantidad;
        diferencia = mayor - menor;
        System.out.println("La suma de los numeros introducidos es = " + suma);
        System.out.println("El promedio de los numeros introducidos es = " + promedio);
        System.out.println("El numero mayor de los introducidos es = " + mayor);
        System.out.println("El numero menor de los introducidos es = " + menor);
        System.out.println("La diferencia entre el numero mayor y menor es = " + diferencia);
    }    
    public static void diasSemana(){
        String dias[] = new String[7];
        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miercoles";
        dias[3] = "Jueves";
        dias[4] = "Viernes";
        dias[5] = "Sabado";
        dias[6] = "Domingo";
        for(String diaS: dias){
            System.out.println(diaS);
        }
    }
    public static void JuegoGato(){
        
        String gato[][] = new String[3][3];
        System.out.println("EL JUEGO DEL GATO :D ");
        for(String vertical[]: gato){
            for(String horizontal: vertical){
                System.out.print("+" + " ");
            }
            System.out.println("");
        }
    }
    public static void Principal(int opcion){
    switch(opcion){
        
            case 1:
                SumaConsecutiva();
                break;
            case 2:
                factorial();
                break;
            case 3:
                factorialNumIntro();
                break;
            case 4:
                MediaNumero();
                break;
            case 5:
                OperacionesNnumeros();
                break;
            case 6:
                diasSemana();
                break;
            case 7:
                JuegoGato();
                break;
            default :
                System.out.println("Opcion no valida");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        encabezado();
        cuerpo();
        Scanner miConsola = new Scanner(System.in);
        opciones = miConsola.nextInt();
        Principal(opciones);
        pie();
        
    }
    
}

