import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

/**
 * Esta clase contiene los test para probar los metodos de la clase Empleado
 * @see Empleado
 */
class EmpleadoTest {

    /**
     * Se crea un objeto empleado antes de que se ejecuten cada uno de los test
     * Se inicializa la variable salario
     */

    @BeforeEach
    void setUp() {
        Empleado empleado = new Empleado("Juan",1200);
    }

    /**
     * Es metodo aumenta el salario según el porcentaje
     */

    @Test
    void aumentarSalario() {
        double nuevoSalario = Empleado.aumentarSalario(10);
        Assertions.assertTrue(nuevoSalario > Empleado.getSalario());
    }

    /**
     * Es metodo devuelve el salario
     */

    @Test
    void obtenerSalario() {
        Assertions.assertEquals(1200, Empleado.getSalario());
    }
}