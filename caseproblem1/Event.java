/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author DELL
 */
public class Event {

    private final static Integer PRECIOINVITADOALTO = 35;
    private final static Integer PRECIOINVITADOBAJO = 32;
    private final static String[] TIPO = {"Boda", "Bautizos", "Cumpleaños", "Corporativos", "Otros"};

    private String nevento;
    private Integer invitados;
    private Integer precio;
    private String telefono;
    private String tipoevento;

    public Event() {
        this.nevento = "A000";
        this.invitados = 0;
    }

    public Event(String nevento, Integer invitados) {
        this.setEvento(nevento);
        this.setInvitados(invitados);
    }

    public Boolean isLargeEvent() {
        return this.invitados >= 50;
    }

    public void setEvento(String nevento) {
        if (nevento.length() > 4 || nevento.length() < 0) {
            this.nevento = "A000";
        } else if (!Character.isLetter(nevento.charAt(0))) {
            this.nevento = "A000";
        } else if (!Character.isUpperCase(nevento.charAt(0))) {
            this.nevento = nevento.toUpperCase();
        } else {
            this.nevento = nevento;
        }
    }

    public void setTelefono(String telefono) {
        String tel = "";
        for (int i = 0; i < telefono.length(); i++) {
            if (Character.isDigit(telefono.charAt(i))) {
                tel += telefono.charAt(i);
            }
        }
        if (tel.length() != 10) {
            this.telefono = "(000) 000-0000";
        } else {
            this.telefono = convParentesis(tel);
        }
    }

    private String convParentesis(String tel) {
        String part1 = tel.substring(0, 3);
        String part2 = tel.substring(3, 6);
        String part3 = tel.substring(6, 10);
        return "(" + part1 + ")" + part2 + "-" + part3;
    }

    public void setInvitados(Integer invitados) {
        this.invitados = invitados;
        if (isLargeEvent()) {
            this.precio = invitados * PRECIOINVITADOBAJO;
        } else {
            this.precio = invitados * PRECIOINVITADOALTO;
        }
    }

    public void invitacion() {
        for (int i = 0; i < this.invitados; i++) {
            System.out.println("Please come to my event");
        }
    }

    public String getTipoevento() {
        return tipoevento;
    }

    public void setTipoevento(Integer tipoevento) {
        switch (tipoevento) {
            case 1:
                this.tipoevento = TIPO[0];
                break;
            case 2:
                this.tipoevento = TIPO[1];
                break;
            case 3:
                this.tipoevento = TIPO[2];
                break;
            case 4:
                this.tipoevento = TIPO[3];
                break;
            case 5:
                this.tipoevento = TIPO[4];
                break;
            default:
                break;
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNevento() {
        return nevento;
    }

    public Integer getInvitados() {
        return invitados;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void mostrar() {
        System.out.println(String.format("Evento No.%s\nTotal Invitados: %d\nTipo de Evento: %s\nCosto Total: $%d"
                + "\nTelefono: %s", this.nevento, this.invitados, this.tipoevento, this.precio, this.telefono));
        this.costo();
    }

    private void costo() {

        if (this.invitados >= 50) {
            System.out.println("Evento grande");
            System.out.println("Precio por invitado $32");
        } else {
            System.out.println("Evento chico");
            System.out.println("Precio por invitado $35");
        }
    }

    public static void logo() {
        System.out.println("----------------------");
        System.out.println("-  Carly’s Catering  -");
        System.out.println("-    party foods     -");
        System.out.println("----------------------");
    }

    public static void masGrande(Event e1, Event e2) {
        if (e1.getInvitados().equals(e2.getInvitados())) {
            System.out.println("Son eventos iguales");
            e1.mostrar();
        } else if (e1.getInvitados() < e2.getInvitados()) {
            System.out.println("El evento mas garnde es:");
            e2.mostrar();
        } else {
            System.out.println("El evento mas garnde es:");
            e1.mostrar();
        }
        System.out.println();
    }

    public static void ordenar(Event[] e, Integer orden) {
        switch (orden) {
            case 1:
                Event.ordenarId(e);
                break;
            case 2:
                Event.ordenarInvitados(e);
                break;
            case 3:
                Event.ordenarTipoevento(e);
                break;
            default:
                break;
        }
    }

    private static void ordenarId(Event[] e) {
        ArrayList r = new ArrayList();
        for (int i = 0; i < e.length; i++) {
            r.add(e[i].getNevento());
        }
        Collections.sort(r);
        for (int i = 0; i < r.size(); i++) {
            System.out.println(r.get(i));
        }
    }

    private static void ordenarInvitados(Event[] e) {
        ArrayList r = new ArrayList();
        for (int i = 0; i < e.length; i++) {
            r.add(e[i].getInvitados());
        }
        Collections.sort(r);
        for (int i = 0; i < r.size(); i++) {
            System.out.println(r.get(i));
        }
    }

    private static void ordenarTipoevento(Event[] e) {
        ArrayList r = new ArrayList();
        for (int i = 0; i < e.length; i++) {
            r.add(e[i].getTipoevento());
        }
        Collections.sort(r);
        for (int i = 0; i < r.size(); i++) {
            System.out.println(r.get(i));
        }
    }
}
