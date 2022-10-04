
package modelo;

import vista.*;
import java.util.GregorianCalendar;

/**
 *
 * @author Inmaculada Rueda Bautista
 */
public class Cuenta {
    
    
    //atributos del objeto
    private int numeroCuenta;
    private GregorianCalendar fecha;
    private float saldo;
    private String propietario;
  
    
    
    //variables tipo CuentaBancaria
    private Cuenta siguiente;
    private Cuenta atrás;

    public Cuenta(int numeroCuenta, GregorianCalendar fecha) {
        this.fecha = fecha;
        this.numeroCuenta = numeroCuenta;
    }

    public Cuenta(int numeroCuenta, GregorianCalendar fecha, float saldo) {
        this(numeroCuenta, fecha);
        this.saldo = saldo;
    }

    public Cuenta(int numeroCuenta, GregorianCalendar fecha, float saldo, String propietario) {
        this(numeroCuenta, fecha, saldo);
        this.propietario = propietario;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }


    public GregorianCalendar getFecha() {
        return fecha;
    }

  
    

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Cuenta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Cuenta siguiente) {
        this.siguiente = siguiente;
    }

    public Cuenta getAtrás() {
        return atrás;
    }

    public void setAtrás(Cuenta atrás) {
        this.atrás = atrás;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    

    
    
    
    
}
