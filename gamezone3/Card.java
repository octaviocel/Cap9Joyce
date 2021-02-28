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
public class Card {

    private Palo carta;
    private NumCarta numero;
    private Integer original;

    public Card(Palo carta) {
        this.carta = carta;
        this.setNumero();
    }

    public Card() {
        this.setCarta();
        this.setNumero();
    }

    public Card(Integer carta, Integer numero) {
        this.setCarta(carta);
        this.setNumero(numero);
    }

    public Palo getCarta() {
        return carta;
    }

    public void setCarta() {
        final int Cardt = 4;
        int nu = ((int) (Math.random() * 100) % Cardt + 1);
        switch (nu) {
            case 1:
                this.carta = Palo.CORAZONES;
                break;
            case 2:
                this.carta = Palo.DIAMANTES;
                break;
            case 3:
                this.carta = Palo.ESPADAS;
                break;
            default:
                this.carta = Palo.TREBOLES;
                break;
        }
    }

    public void setCarta(Integer nu) {

        switch (nu) {
            case 1:
                this.carta = Palo.CORAZONES;
                break;
            case 2:
                this.carta = Palo.DIAMANTES;
                break;
            case 3:
                this.carta = Palo.ESPADAS;
                break;
            default:
                this.carta = Palo.TREBOLES;
                break;
        }
    }

    public static Boolean ganador(Card uno, Card dos) {
        return uno.original > dos.original;
    }

    public void setNumero() {
        final int CARDS_IN_SUIT = 13;
        int nu = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
        this.original = nu;
        switch (nu) {
            case 1:
                this.numero = NumCarta.ACE;
                break;
            case 2:
                this.numero = NumCarta.II;
                break;
            case 3:
                this.numero = NumCarta.III;
                break;
            case 4:
                this.numero = NumCarta.IV;
                break;
            case 5:
                this.numero = NumCarta.V;
                break;
            case 6:
                this.numero = NumCarta.VI;
                break;
            case 7:
                this.numero = NumCarta.VII;
                break;
            case 8:
                this.numero = NumCarta.VIII;
                break;
            case 9:
                this.numero = NumCarta.IX;
                break;
            case 10:
                this.numero = NumCarta.X;
                break;
            case 11:
                this.numero = NumCarta.JACK;
                break;
            case 12:
                this.numero = NumCarta.QUEEN;
                break;
            case 13:
                this.numero = NumCarta.KING;
                break;

        }
    }

    public void setNumero(Integer nu) {
        this.original = nu;
        switch (nu) {
            case 1:
                this.numero = NumCarta.ACE;
                break;
            case 2:
                this.numero = NumCarta.II;
                break;
            case 3:
                this.numero = NumCarta.III;
                break;
            case 4:
                this.numero = NumCarta.IV;
                break;
            case 5:
                this.numero = NumCarta.V;
                break;
            case 6:
                this.numero = NumCarta.VI;
                break;
            case 7:
                this.numero = NumCarta.VII;
                break;
            case 8:
                this.numero = NumCarta.VIII;
                break;
            case 9:
                this.numero = NumCarta.IX;
                break;
            case 10:
                this.numero = NumCarta.X;
                break;
            case 11:
                this.numero = NumCarta.JACK;
                break;
            case 12:
                this.numero = NumCarta.QUEEN;
                break;
            case 13:
                this.numero = NumCarta.KING;
                break;

        }
    }

    public NumCarta getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return (this.getNumero() + " of " + this.getCarta());
    }
}
