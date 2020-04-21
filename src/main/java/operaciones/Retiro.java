package operaciones;

import java.util.Scanner;
//Clase se usa solo para Retirar efectivo cajero

public class Retiro extends Sistema {

    //Constructor Vacio
    public Retiro() {
    }

    //Clase Scanner
    Scanner sc = new Scanner(System.in);

    @Override
    public void OperacionesAtm() {
        boolean verificar;
        do {
            verificar = false;
            System.out.print("¿Cuanto deseas retirar?: ");

            try {
                retirar = sc.nextInt();
            } catch (Exception e) {
                sc.next();
                verificar = true;
            }
            if (retirar <= 0 || retirar > getSaldo()) {
                verificar = true;
                System.out.println("Valor no valido\nIntenta con otra cantidad\n");
            } else {
                diferencia = (retirar - getSaldo());
                diferencia = diferencia * -1;
                setSaldo(diferencia);
                System.out.println("Tu Saldo Actual es: " + getSaldo());
            }

        } while (verificar != false || verificar != false);
    }
}
