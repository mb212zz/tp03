/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author mbenjelloun
 */
import java.util.Scanner;
public class Tp3 {
    public static int carre(int a) {
        return a*a;
    }
    public static int cube(int a) {
        return a*a*a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0; 
        int b = 0;
        int resultat = 0;                
        System.out.print("Entrez un nombre : ");
        a = sc.nextInt();       
        System.out.print("1. Calculer le carré.   2. Calculer le cube. : ");
        b = sc.nextInt();   
        if (b == 1) {
            resultat = carre(a); 
            System.out.print("Le résultat est : " + resultat);                
        }
        if (b == 2) {
            resultat = cube(a);
            System.out.print("Le résultat est : " + resultat);
        }
    }
}
        


