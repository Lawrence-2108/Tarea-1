/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablademultiplicar;

/**
 *
 * @author lawre
 */
public class TablaDeMultiplicar {
    
    public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la tabla que desea mostrar: ");
        int tabla = sc.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(tabla + " x " + i + " = " + (tabla * i));
        }

        sc.close();
    }
}