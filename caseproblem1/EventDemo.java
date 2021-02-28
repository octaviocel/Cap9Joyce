/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EventDemo {

    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        Event evento[] = new Event[8];
        Event.logo();
        
        for (int i = 0; i < 8; i++) {
            evento[i] = new Event();
            System.out.println("Dame el numero de invitados por favor [5-100] Evento"+i);
            Integer invitados = pen.nextInt();
            do {
                if (invitados < 5 || invitados > 100) {
                    System.out.println("Por favor un numero valido de invitados [5-100]");
                    invitados = pen.nextInt();
                }
            } while (invitados < 5 || invitados > 100);
            evento[i].setInvitados(invitados);
            System.out.println("Dame tu ID");
            evento[i].setEvento(pen.next());
            System.out.println("Dame un telefono de contacto: ");
            evento[i].setTelefono(pen.next());
            System.out.println("Dame tipo de evento\nboda[1] bautizos[2] cumpleaños[3]\ncorporativos[4] otros[5]");
            evento[i].setTipoevento(pen.nextInt());
        }

        for (int i = 0; i < 8; i++) {
            evento[i].mostrar();
            System.out.println();
        }
        Integer r= 1;        
        while(r!=0){
            System.out.println("Dime como lo quieres ordenar [1]ID [2]Invitados [3]Tipo [0] Salir");
            r= pen.nextInt();
            Event.ordenar(evento, r);
        }
    }
}
