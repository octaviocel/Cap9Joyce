/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class RentalDemo {

    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        Rental[] r1 = new Rental[3];
        Rental.logo();

        for (int i = 0; i < 3; i++) {
            r1[i]= new Rental();
            System.out.println("Dame los minutos de renta por favor [60-7200]");
            Integer renta = pen.nextInt();
            do {
                if (renta < 60 || renta > 7200) {
                    System.out.println("Por favor un numero valido [60-7200]");
                    renta = pen.nextInt();
                }
            } while (renta < 60 || renta > 7200);
            r1[i].setHorasAndMin(renta);
            System.out.println("Dame tu numero de ID");
            r1[i].setContrato(pen.next());
            System.out.println("Dame tu tipo de renta");
            System.out.println("[1]Moto Acuática [2]Pontón [3]bote de Remos [4]Canoa"
                    + " [5]Kayak [6]silla de Playa [7]Sombrilla [8]Otros");
            r1[i].setTiporenta(pen.nextInt());
            if (i != 0) {
                if (r1[i].getTiporenta().equals(r1[i - 1].getTiporenta())) {
                    r1[i].setTiporenta(8);
                }
            }
            System.out.println("Dame un telefono de contacto");
            r1[i].setTelefono(pen.next());

        }

        for (int i = 0; i < 3; i++) {
            r1[i].mostrar();
        }


    }
}
