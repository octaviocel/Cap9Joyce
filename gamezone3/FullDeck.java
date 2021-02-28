/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone3;

/**
 *
 * @author DELL
 */
public class FullDeck {

    private Card[] baraja;

    public FullDeck() {
        this.baraja = new Card[52];
        this.inicializar();
    }

    private void inicializar() {
        Integer carta = 1;
        Integer nu = 1;
        for (int i = 0; i < 52; i++) {
            this.baraja[i] = new Card(carta, nu);
            nu++;
            if (nu > 13) {
                nu = 1;
                carta++;
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < 52; i++) {
            System.out.println("Carta: " + baraja[i].getCarta() +" "+ baraja[i].getNumero());

        }
    }
}
