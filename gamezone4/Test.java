/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone4;


/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        RockPaperScissors3 juego= new RockPaperScissors3();
        
        System.out.println("Juego Rock Paper Scissors");
        System.out.println("El juego esta diseñado para 10 tiradas");
        for (int i = 0; i < 10; i++) {
            System.out.println("Dame tu tirada:");
            juego.setUsuario();
            juego.ganador();
            juego.tiradaRonda();
        }
        juego.estadisticas();
        
        
        
       
    }
    
}
