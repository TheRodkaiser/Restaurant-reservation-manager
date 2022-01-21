/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author unair
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalendarioReservas calendario = new CalendarioReservas();
        
        GregorianCalendar c= new GregorianCalendar(Calendar.YEAR,01,20);
        
        Reservas reservas = calendario.getDia(c);
        
        Date f0=new Date(122,0,20,14,0);
        Date f1=new Date(122,0,20,13,0);
        Date f2=new Date(122,0,20,17,0);
        
        Reserva r0 = new Reserva("Unai",5,662206797,f0);
        Reserva r1 = new Reserva("Juan",4,657605682,f1);
        Reserva r2 = new Reserva("Paqui Sánchez",5,686305415,f2);
        
        r1.to_String();
        
        Reservas reservas2 = new Reservas(31,0,c.get(Calendar.YEAR));
        
        reservas2.hacerReserva(r0);
        reservas2.hacerReserva(r1);
        reservas2.hacerReserva(r2);
        
        reservas2.verReservas();
    }
    
}
