/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.determinante;

import java.util.Scanner;

/**
 *
 * @author sergiocarrillocarranza
 */
public class Determinante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int det,x,mat[][];
        System.out.println("Este programa calcula la determinante de una matriz"
                + "Seleccione una de las siguientes opciones\n1)Matriz 2x2\n2)Matriz 3x3");
        x=sc.nextInt();
        switch(x){
            case 1: mat = new int [2][2];
                    System.out.println("Ud selecciono Matriz de 2x2\n\nIngrese los datos de la matriz");
                    System.out.print("A11:");mat[0][0]=sc.nextInt();
                    System.out.print("A12:");mat [0][1]=sc.nextInt();
                    System.out.print("A21:");mat[1][0]=sc.nextInt();
                    System.out.print("A22:");mat[1][1]=sc.nextInt();
                    det=mat[0][0]*mat[1][1]-mat[1][0]*mat[0][1];
                    System.out.println("La determinante de la matriz es "+det);
                    break;
                
            case 2: mat=new int[3][3];
                    System.out.println("Ud selecciono Matriz de 3x3\n\nIngrese los datos de la matriz");
                    System.out.print("A11:");mat[0][0]=sc.nextInt();
                    System.out.print("A12:");mat[0][1]=sc.nextInt();
                    System.out.print("A13:");mat[0][2]=sc.nextInt();
                    System.out.print("A21:");mat[1][0]=sc.nextInt();
                    System.out.print("A22:");mat[1][1]=sc.nextInt();
                    System.out.print("A23:");mat[1][2]=sc.nextInt();
                    System.out.print("A31:");mat[2][0]=sc.nextInt();
                    System.out.print("A32:");mat[2][1]=sc.nextInt();
                    System.out.print("A33:");mat[2][2]=sc.nextInt();
                    
                    det=mat[0][0]*mat[1][1]*mat[2][2]-mat[0][0]*mat[1][2]*mat[2][1]
                        -mat[0][1]*mat[1][0]*mat[2][2]+mat[0][1]*mat[2][0]*mat[1][2]
                        +mat[0][2]*mat[1][0]*mat[2][1]-mat[0][2]*mat[1][1]*mat[2][0];
                    System.out.println(det);
                    break;
        }
        
    }
}
