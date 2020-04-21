package operaciones;

import java.util.Scanner;
//Clase Principal para variables y metodos nadamas

public abstract class Sistema {

    //Clase Scanner
    Scanner sc = new Scanner(System.in);
    //Atributos
    private static int saldo;
    protected int retirar, diferencia, depositar, abono;
    
    //Constructor Vacio
    public Sistema() {
    }

    public void interfazUsuario() {
        boolean verificar = false;
        int opc = 0;
        do {
            verificar = false;
            System.out.println("Por favor seleccione una opcion:\n1.-Consulta de Saldo.\n2.-Retiro de Efectivo.\n"
                    + "3.-Deposito de Efectivo.\n4.-Salir.");
            try {
                opc = sc.nextInt();
            } catch (Exception e) {
                sc.next();
                verificar = true;
            }
            switch (opc) {
                case 1:     ConsultaSaldo ob = new ConsultaSaldo();
                            ob.OperacionesAtm();
                    break;

                case 2:     System.out.println("Retiro de Efectivo\n");
                            Retiro ob2 = new Retiro();
                            ob2.OperacionesAtm();
                    break;


                case 3:     System.out.println("Deposito de Efectivo\n");
                            Deposito ob3 = new Deposito();
                            ob3.OperacionesAtm();
                    break;

                case 4:     System.out.println("Fin del programa, Saludos...");
                    break;
                default:
                    System.out.println("Selecciona una opcion valida\nIntenta nuevamente...\n");
            }
        } while (opc != 4 || verificar != false);
    }

    //Metodo abstracto
    public abstract void OperacionesAtm();

    //Getter y Setter de saldo
    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        Sistema.saldo = saldo;
    }

}
