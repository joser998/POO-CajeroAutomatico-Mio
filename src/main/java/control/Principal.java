package control;

import operaciones.ConsultaSaldo;
import operaciones.Sistema;
//Clase para control del programa

public class Principal {

    public static void main(String[] args) {
        //Creamos Objeto hacia ConsultaSaldo, ya que sera la primera clase a consultar con el menu heredado
        Sistema ob = new ConsultaSaldo();
        
        System.out.println("Bienvenido a Cajero Automatico\n");
        
        //Establezco saldo a 500 ante de arrancar el programa
        ob.setSaldo(500);
        
        //Metodo heredado de Sistema a ConsultaSaldo //Llamada a metodo
        ob.interfazUsuario();
        
        
        
        
        
    }
}
