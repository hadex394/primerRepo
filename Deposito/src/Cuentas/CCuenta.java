package Cuentas;

public class CCuenta {

	/**
	 * CCuenta representa una cuenta bancaria con nombre, numero de cuenta, saldo y el tipo de interes.
	 * @author Adrian Jabalera Leon
	 * 
	 */
	
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor  la clase CCuenta.
     */
    
    public CCuenta()
    {
    }
    /** 
     * Constructor que inicializa los parametros de CCuenta
     * @param nom Nombre
     * @param cue Cuenta
     * @param sal Saldo
     * @param tipo Interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
/**
 * Devuelve el saldo de la cuenta
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * Realiza un ingreso en la cuenta
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Realiza una retirada en la cuenta
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
/**
 * Metodos getter y setter
 */
	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInterés() {
		return tipoInterés;
	}

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
