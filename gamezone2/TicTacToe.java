/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

/**
 *
 * @author DELL
 */
public class TicTacToe {

    private Matriz[][] matriz;
    private final String user;
    private final String comp;

    public TicTacToe() {
        this.matriz = new Matriz[3][3];
        this.tictac();
        this.user = "X";
        this.comp = "O";
    }

    /*private void inici(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.matriz[i][j]= new Matriz();
            }
        }
    }*/
    public void tiroComp() {
        System.out.println("Esta tirando la computadora");
        Boolean tiroco = true;
        do {
            Integer tiro = ((int) (Math.random() * 100) % 9 + 1);
            tiroco = this.buscar(tiro);
            if (tiroco == false) {
                this.tiroComp(tiro);
            } else {
                System.out.println("Intento tirar en una casilla ocupada");
            }
        } while (tiroco == true);
        System.out.println("Tiro con exito de la computadora");
    }

    private void tiroComp(Integer t) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.matriz[i][j].campo.equals(Integer.toString(t))) {
                    this.matriz[i][j].campo = this.comp;
                    this.matriz[i][j].tirado = true;
                }
            }
        }
    }

    private void tictac() {
        int g = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.matriz[i][j] = new Matriz();
                this.matriz[i][j].campo = Integer.toString(g++);
                this.matriz[i][j].tirado = false;

            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz.length; j++) {
                System.out.print("[" + this.matriz[i][j].campo + "]");
            }
            System.out.println();
        }
    }

    private Boolean buscar(Integer tirado) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.matriz[i][j].campo.equals(Integer.toString(tirado))) {
                    if (this.matriz[i][j].tirado == true) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public Boolean tirarUser(Integer tirada) {
        if (this.buscar(tirada)) {
            System.out.println("Intenta de nuevo, lugar ocupado");
            return false;
        } else {
            System.out.println("Tiro con exito");
            this.tira(tirada);
            return true;
        }
    }

    private void tira(Integer t) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.matriz[i][j].campo.equals(Integer.toString(t))) {
                    this.matriz[i][j].campo = this.user;
                    this.matriz[i][j].tirado = true;
                }
            }
        }
    }

    public Boolean ganar() {
        if ((this.matriz[0][0].campo == "X") && (this.matriz[0][1].campo == "X") && (this.matriz[0][2].campo == "X")) {
            System.out.println("Gano user");
            return true;
        } else if ((this.matriz[1][0].campo == "X") && (this.matriz[1][1].campo == "X") && (this.matriz[1][2].campo == "X")) {
            System.out.println("Gano user");
            return true;
        } else if ((this.matriz[2][0].campo == "X") && (this.matriz[2][1].campo == "X") && (this.matriz[2][2].campo == "X")) {
            System.out.println("Gano user");
            return true;
        } else if ((this.matriz[0][0].campo == "X") && (this.matriz[1][0].campo == "X") && (this.matriz[2][0].campo == "X")) {
            System.out.println("Gano user");
            return true;
        } else if ((this.matriz[0][1].campo == "X") && (this.matriz[1][1].campo == "X") && (this.matriz[1][2].campo == "X")) {
            System.out.println("Gano user");
            return true;
        } else if ((this.matriz[0][2].campo == "X") && (this.matriz[1][2].campo == "X") && (this.matriz[2][2].campo == "X")) {
            System.out.println("Gano user");
            return true;
        } else if ((this.matriz[0][0].campo == "X") && (this.matriz[1][1].campo == "X") && (this.matriz[2][2].campo == "X")) {
            System.out.println("Gano user");
            return true;
        } else if ((this.matriz[0][2].campo == "X") && (this.matriz[1][1].campo == "X") && (this.matriz[2][0].campo == "X")) {
            System.out.println("Gano user");
            return true;
        } else if ((this.matriz[0][0].campo == "O") && (this.matriz[0][1].campo == "O") && (this.matriz[0][2].campo == "O")) {
            System.out.println("Gano el computador");
            return true;
        } else if ((this.matriz[1][0].campo == "O") && (this.matriz[1][1].campo == "O") && (this.matriz[1][2].campo == "O")) {
            System.out.println("Gano el computador");
            return true;
        } else if ((this.matriz[2][0].campo == "O") && (this.matriz[2][1].campo == "O") && (this.matriz[2][2].campo == "O")) {
            System.out.println("Gano el computador");
            return true;
        } else if ((this.matriz[0][0].campo == "O") && (this.matriz[1][0].campo == "O") && (this.matriz[2][0].campo == "O")) {
            System.out.println("Gano el computador");
            return true;
        } else if ((this.matriz[0][1].campo == "O") && (this.matriz[1][1].campo == "O") && (this.matriz[1][2].campo == "O")) {
            System.out.println("Gano el computador");
            return true;
        } else if ((this.matriz[0][2].campo == "O") && (this.matriz[1][2].campo == "O") && (this.matriz[2][2].campo == "O")) {
            System.out.println("Gano el computador");
            return true;
        } else if ((this.matriz[0][0].campo == "O") && (this.matriz[1][1].campo == "O") && (this.matriz[2][2].campo == "O")) {
            System.out.println("Gano el computador");
            return true;
        } else if ((this.matriz[0][2].campo == "O") && (this.matriz[1][1].campo == "O") && (this.matriz[2][0].campo == "O")) {
            System.out.println("Gano el computador");
            return true;
        } else {
            return false;
        }
    }

    public Boolean empate() {
        int c = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.matriz[i][j].tirado == true) {
                    c++;
                }
            }
        }
        if (c == 9) {
            return true;
        } else {
            return false;
        }
    }
}
