/**
 * Clase CCuenta
 */

package dam_ed04_actividad;


public class CCuenta {


    protected String nombre;/**Variable de tipo String que indica el nombre*/
    protected String cuenta;/**Variable de tipo String que indica el numero de cuenta*/
    protected double saldo;/**Variable de tipo double que indica el saldo*/
    protected double tipoInterés;/**Variable de tipo double que indica el tipo de interes*/

/**Constructor sin parametros*/
    public CCuenta()
    {
    }
/**@param nom, cue, sal*/
/**Constructor con parametros*/
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public void asignarNombre(String nom)/**Metodo para asignar el nombre*/
    {
        setNombre(nom);
    }
/**@return getNombre*/
    public String obtenerNombre()
    {
        return getNombre();
    }

/**@return estado*/
    public double estado()
    {
        return saldo;
    }

/**Metodo ingresar*/
    public void ingresar(double cantidad) throws Exception/**@throws Exception*/
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");/**@exception Exception*/
        setSaldo(saldo + cantidad);
    }
/**Metodo retirar*/
    public void retirar(double cantidad) throws Exception/**@throws Exception*/
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");/**@exception Exception*/
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(saldo - cantidad);
    }

/**@return cuenta*/
    public String obtenerCuenta()
    {
        return cuenta;
    }

/**@return nombre*/
    public String getNombre() {
        return nombre;
    }

/**Metodo para cambiar nombre*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

/**@return tipoInteres*/
    public double getTipoInterés() {
        return tipoInterés;
    }

/**Metodo para cambiar el interes*/
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

/**Metodo para cambiar cuenta*/    
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

/**Metodo para cambia saldo*/    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
