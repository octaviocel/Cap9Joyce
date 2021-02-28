/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem2;

/**
 *
 * @author DELL
 */
public class Rental {

    private final static Integer HORA = 60;
    private final static Integer RENTAHORA = 40;
    private final static String TIPO[]={"Moto Acuática", "Pontón", "bote de Remos", "Canoa", 
                                        "Kayak", "silla de Playa", "Sombrilla", "Otros"};

    private String contrato;
    private Integer horas;
    private Integer min;
    private Integer precio;
    private String telefono;
    private String tiporenta;

    public Rental() {
        this.setContrato("A000");
        this.setHorasAndMin(0);
    }

    public Rental(String contrato, Integer min) {
        this.setContrato(contrato);
        this.setHorasAndMin(min);
    }

    public void setContrato(String contrato) {
        if (contrato.length() > 4 || contrato.length() < 0) {
            this.contrato = "A000";
        } else if (!Character.isLetter(contrato.charAt(0))) {
            this.contrato = "A000";
        } else if (!Character.isUpperCase(contrato.charAt(0))) {
            this.contrato = contrato.toUpperCase();
        } else {
            this.contrato = contrato;
        }
    }
    
    public void setTelefono(String telefono){
        String tel="";
        for (int i = 0; i < telefono.length(); i++) {
            if(Character.isDigit(telefono.charAt(i))){
                tel+=telefono.charAt(i);
            }
        }
        if(tel.length()!=10){
            this.telefono = "(000) 000-0000";
        }else{
            this.telefono=convParentesis(tel);
        }
    }
    
    private String convParentesis(String tel){
        String part1= tel.substring(0, 3);
        String part2= tel.substring(3, 6);
        String part3= tel.substring(6, 10);
        return "("+part1+")"+part2+"-"+part3;
    }

    public void setHorasAndMin(Integer min) {
        this.horas = min/HORA;
        this.min = min;
        if (min <= 40) {
            this.precio = (this.horas * RENTAHORA) + this.min;
        } else {
            this.precio = (this.horas * RENTAHORA) + RENTAHORA;
        }
    }
    public String getTiporenta() {
        return tiporenta;
    }

    public void setTiporenta(Integer tipo) {        
        switch(tipo){
            case 1:
                this.tiporenta= TIPO[0];
                break;
            case 2:
                this.tiporenta= TIPO[1];
                break;
            case 3:
                this.tiporenta= TIPO[2];
                break;            
            case 4:
                this.tiporenta= TIPO[3];
                break;            
            case 5:
                this.tiporenta= TIPO[4];
                break;
            case 6:
                this.tiporenta= TIPO[5];
                break;
            case 7:
                this.tiporenta= TIPO[6];
                break;
            case 8:
                this.tiporenta= TIPO[7];
                break;
            default:
                break;
        }
    }    

    public static void masLargo(Rental r1, Rental r2) {
        if (r1.getHoras().equals(r2.getHoras())) {
            if (r1.getMin().equals(r2.getMin())) {
                System.out.println("Los tiempos son iguales");
                r1.mostrar();
            } else if (r1.getMin() > r2.getMin()) {
                System.out.println("El mas largo es:");
                r1.mostrar();
            } else {
                System.out.println("El mas largo es:");
                r2.mostrar();
            }
        } else if (r1.getHoras() > r2.getHoras()) {
            System.out.println("El mas largo es:");
            r1.mostrar();
        } else {
            System.out.println("El mas largo es:");
            r2.mostrar();
        }
        System.out.println();
    }

    public String getContrato() {
        return contrato;
    }

    public Integer getHoras() {
        return horas;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getPrecio() {
        return precio;
    }
    
    public String getTelefono(){
        return telefono;
    }

    public void mostrar() {
        System.out.println(String.format("Renta No. %s\nTipo de renta: %s\nHoras: %d\nMinutos: %d\nCosto total: $%d"
                + "\nTelefono de contacto: %s", this.contrato,this.tiporenta, this.horas, this.min, this.precio,this.telefono));
    }

    public static void logo() {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("<   Sammy’s Seashore   <");
        System.out.println("< Rents Beach Equipmen <");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<");
    }

    public void rentas(){
        for (int i = 0; i < this.horas; i++) {
            System.out.println("Coupon good for 10 percent off next rental");
        }
    }
}
