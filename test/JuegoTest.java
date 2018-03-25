import org.junit.Test;

import static org.junit.Assert.*;

public class JuegoTest {

    @Test
    public void tableroInitializedSuccessfully(){
        Juego juego = new Juego();
        assertNotEquals(null, juego.getTablero());
    }

}