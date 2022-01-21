/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author unair
 */
public class Reservas {
    //private static final Reservas instance=new Reservas();
    private GregorianCalendar fecha;
    private ArrayList<Reserva> ResNoche;
    private ArrayList<Reserva> ResDia;
    
    private Reservas(){
        ResNoche=new ArrayList<>();
        ResDia=new ArrayList<>();
        fecha=new GregorianCalendar();
    }
    Reservas(int dia, int mes, int year){
        ResNoche=new ArrayList<>();
        ResDia=new ArrayList<>();
        fecha=new GregorianCalendar(year,mes,dia);
    }
    
    public Boolean hacerReserva(Reserva r){
        if(r.getHora()<16 && r.getHora()>=13)
            ResDia.add(r);
        else if(r.getHora()>=20 && r.getHora()<=23)
            ResNoche.add(r);
        else
            return false;
        return true;
    }
    
    public Boolean consultarReserva(Reserva r){
        Boolean esta=ResDia.contains(r)||ResDia.contains(r);
        return esta;
    }
    
    public Boolean AnularReserva(Reserva r){
        if(consultarReserva(r)){
            if(r.deDia()){
                ResDia.remove(r);
            }
            else{
                ResNoche.remove(r);
            }
            return true;
        }
        else return false;
            
    }
    
    public Boolean cambiarReserva(Reserva antigua, Reserva nueva){
        if(consultarReserva(antigua)){
            if(antigua.deDia()){
                ResDia.remove(antigua);
                ResDia.add(nueva);
            }
            else{
                ResNoche.remove(antigua);
                ResNoche.add(nueva);
            }
            return true;
        }
        else return false;
    }
    
    public void verReservas(){
        to_String();
    }
    private void to_String(){
        System.out.println("Fecha: "+fecha.toString()
                +" Reservas de día:");
        to_StringDia();
        System.out.println("Reservas de noche:");
        to_StringNoche();
    }
    private void to_StringDia(){
        ResDia.forEach(r -> {
            r.to_String();
        });
    }
    private void to_StringNoche(){
        ResDia.forEach(r -> {
            r.to_String();
        });
    }
    
    
    
}
