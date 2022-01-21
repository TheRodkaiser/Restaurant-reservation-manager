/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TreeMap;
import java.util.Map;

/**
 *
 * @author unair
 */
public class CalendarioReservas {
    private Map<Calendar,Reservas> calendarioReservas;
    /**
     * 
     */    
    public CalendarioReservas(){
        Calendar c=Calendar.getInstance();
        calendarioReservas=new TreeMap<>();
        for(int i=0;i<11;i++){
            Reservas n;
            GregorianCalendar a=new GregorianCalendar(31,i,c.get(Calendar.YEAR));
            if(i==0||i==2||i==4||i==6||i==7||i==9||i==11){
                n=new Reservas(31,i,c.get(Calendar.YEAR));
            }
            else if(i==3||i==5||i==8||i==10){
                n=new Reservas(30,i,c.get(Calendar.YEAR));
            }
            else{
               n=new Reservas(28,i,c.get(Calendar.YEAR));
            }
            calendarioReservas.put(a, n);
        }
    }
    /**
     * 
     * @param d fecha
     * @return arrayList de las reservas en esa fecha
     */
    public Reservas getDia(GregorianCalendar d){
        return calendarioReservas.get(d);
    }
    public void verReservas(GregorianCalendar d){
        calendarioReservas.get(d).verReservas();
    }
    
    
    
}
