package operaciones;
//Clase se usa solo para consultar el saldo del usuario

public class ConsultaSaldo extends Sistema {

    public ConsultaSaldo() {
    }

    @Override
    public void OperacionesAtm() {
        System.out.println("Tu Saldo Actual es: " + getSaldo());
    }

}
