
import java.util.Objects;

/**
 * Clase que permite ver y modificar el salario de un empleado.
 * @author Cristina Sanz Alonso
 * @version 1.0
 */


public class Empleado {

    private String nombre;
    private double salario;

    /**
     * Constructor con los paramentros de la clase
     * @param nombre Es el nombre del empleado
     * @param salario Es el salario del empleado
     */

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    /**
     * Constructor por defecto que no recibe valores.
     */

    public Empleado() {
        super();
    }

    //Métodos propios:

    /**
     * Metodo que pide dos parametros:
     * @param nombre Es el nombre del empleado del tipo String
     * @param salario Es el salario del empleado de tipo double
     * @return true
     */

    public boolean empleado(String nombre, double salario) {
        System.out.println("Mi nombre es:" + nombre + " y gano: " + salario);
        return true;
    }

    /**
     * Metodo que calcula el aumento del salario mediante la suma del porcentaje dado en la entrada
     * @param porcentaje Es el porcentaje de subida que se aplica
     * @return El salario con el aumento aplicado
     */

    public double aumentarSalario(double porcentaje) {
        return salario + (salario * porcentaje/100);
    }

    /**
     * Metodo que imprime por el salario del empleado
     * @param salario Es el salario introducido
     * @return salario
     */

    public double obtenerSalario(double salario) {
        return salario;
    }
}
