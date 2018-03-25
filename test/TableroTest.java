import javafx.geometry.Pos;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class TableroTest {


    @Test
    public void checkCasillasHasRightLenght() {
        Tablero tablero = new Tablero();
        Casilla[][] casillas = tablero.getCasillas();
        int casillasRows = casillas.length;
        int casillasCols = casillas[1].length;

        assertEquals(3, casillasCols);
        assertEquals(3, casillasRows);

    }


    @Test(expected = NullPointerException.class)
    public void checkAllCasillasAreInitialized() {
        Tablero tablero = new Tablero();

        Casilla[][] casillas = tablero.getCasillas();
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                System.out.println(casillas[i][j].getValue());
            }
        }
    }


    @Test
    public void checkIfCasillaInPositionHasUpdated() {
        Posicion pos = Mockito.mock(Posicion.class);
        when(pos.getX()).thenReturn(2);
        when(pos.getY()).thenReturn(2);

        Tablero tablero = new Tablero();
        assertTrue(tablero.markCasilla('X',pos));
    }



}