/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumatoria_del_1_al_50;

/**
 *
 * @author lawre
 */
public class Sumatoria_del_1_al_50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;   
        int i = 1;      

        do {
            suma += i;  
            i++;        
        } while (i <= 50);

        System.out.println("La sumatoria de los números del 1 al 50 es: " + suma);
    }
}

