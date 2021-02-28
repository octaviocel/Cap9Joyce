/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {

    public static void main(String[] args) {
        TicTacToe juego = new TicTacToe();
        Scanner pen = new Scanner(System.in);
        System.out.println("Este es el tablero, el primero que tira es el user");
        juego.mostrar();
        Boolean empate = false, gano = false;

        while (empate == false && gano == false) {
            System.out.println("Dame tiro user");
            Boolean j = false;
            do {
                j = juego.tirarUser(pen.nextInt());
                if (j == false) {
                    System.out.println("Lugar ocupado");
                }
            } while (j == false);
            gano = juego.ganar();
            empate = juego.empate();
            juego.mostrar();
            if (gano != true && empate != true) {
                juego.tiroComp();

                juego.empate();
                juego.ganar();
                juego.mostrar();
            }
        }
    }
}
