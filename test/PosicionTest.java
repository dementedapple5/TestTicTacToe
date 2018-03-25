import org.junit.Test;

import static org.junit.Assert.*;

public class PosicionTest {

    @Test
    public void checkIfGetXReturnValue() {
        Posicion pos = new Posicion(2, 1);

        assertEquals(2, pos.getX());
    }

    @Test
    public void checkIfGetYReturnValue() {
        Posicion pos = new Posicion(2, 1);

        assertEquals(1, pos.getY());
    }


    @Test
    public void checkIfSetXChangeValue() {
        Posicion pos = new Posicion(2, 1);
        int expectedX = 3;
        pos.setX(expectedX);
        assertEquals(expectedX, pos.getX());
    }

    @Test
    public void checkIfSetYChangeValue() {
        Posicion pos = new Posicion(2, 1);
        int expectedY = 3;
        pos.setY(expectedY);
        assertEquals(expectedY, pos.getY());
    }

}