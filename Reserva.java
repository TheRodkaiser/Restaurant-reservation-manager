/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author unair
 */
class Reserva {
    private String nombre;
    private int personas;
    private int numTlf;
    private int numMesa;
    private Date fecha;
    private ArrayList<String> comentarios;
    
    Reserva(String n,int p, int t, Date f){
        nombre=n;
        personas=p;
        numTlf=t;
        numMesa=-1;
        fecha=f;
    }
    
    int getHora() {
        return fecha.getHours();
    }

    Boolean deDia() {
        return(getHora()>13 && getHora()<15);
    }
    
    public String getNombre(){
        return nombre;
    }

    public int getPersonas() {
        return personas;
    }

    public int getNumTlf() {
        return numTlf;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public Date getFecha() {
        return fecha;
    }
    
    public void setMesa(int n){
        numMesa=n;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }
    
    String to_s_Comentarios(){
        String c="";
        for(int i=0;i<comentarios.size();i++){
            c+="-"+comentarios.get(i)+"\n";
        }
        return c;
    }

    void to_String() {
        System.out.println("Nombre: "+nombre+"\nNúmero de teléfono: "+ numTlf+
                "\nPersonas: "+personas+"\nMesa: "+numMesa+"\nFecha: "+fecha);
                //"\nComentarios: "+to_s_Comentarios());
    }
    
}
