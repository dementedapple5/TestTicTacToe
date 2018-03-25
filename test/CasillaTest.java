import org.junit.Test;

import static org.junit.Assert.*;

public class CasillaTest {


    @Test
    public void checkValueIsEmptyOnCreateCasilla() {
        Casilla casilla = new Casilla();

        assertEquals(' ', casilla.getValue());

    }


    @Test
    public void checkValueChangeOnSetValue() {
        Casilla casilla = new Casilla();

        assertTrue(casilla.setValue('X'));

        assertEquals('X', casilla.getValue());
    }


    @Test
    public void checkIfCasillaValueIsEmpty() {
        Casilla casilla = new Casilla();

        assertTrue(casilla.isEmpty());
    }


    @Test
    public void checkIfCasillaValueIsNotEmpty() {
        Casilla casilla = new Casilla();
        casilla.setValue('X');
        assertFalse(casilla.isEmpty());
    }

    @Test
    public void checkIntroducedValue() {
        Casilla casilla = new Casilla();
        assertFalse(casilla.setValue('P'));
        assertEquals(' ', casilla.getValue());
    }




}