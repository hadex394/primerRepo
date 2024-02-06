package Cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = operativa_cuenta(cuenta1, 0).estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            operativa_cuenta(cuenta1, 0).retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            operativa_cuenta(cuenta1, 0).ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

	private static CCuenta operativa_cuenta(CCuenta cuenta1, float cantidad) {
		return cuenta1;
	}
}
