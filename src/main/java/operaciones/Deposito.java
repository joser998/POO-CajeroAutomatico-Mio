package operaciones;

import java.util.Scanner;

public class Deposito extends Sistema {

    //Constructor Vacio
    public Deposito() {
    }

    //Clase Scanner
    Scanner sc = new Scanner(System.in);

    @Override
    public void OperacionesAtm() {
        boolean verificar;
        do {
            verificar = false;
            System.out.print("¿Cuanto efectivo deseas depositar?: ");

            try {
                depositar = sc.nextInt();
            } catch (Exception e) {
                sc.next();
                verificar = true;
                System.out.println("Valor no valido\nIntente nuevamente\n");
            }
            if (depositar < 0) {
                verificar = true;
                System.out.println("Valor no valido\nIntente nuevamente\n");
            } else {
                verificar = false;
                abono = (depositar + getSaldo());
                setSaldo(abono);
                System.out.println("Saldo depositado\nTu Saldo actual es: " + getSaldo());
            }
        } while (verificar != false || verificar != false);
    }
}
