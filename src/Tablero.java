public class Tablero {
    private Casilla[][] casillas;

    public Tablero(){
        casillas = new Casilla[3][3];
        initializeCasillas();
    }


    public Casilla[][] getCasillas() {
        return casillas;
    }


    private void initializeCasillas() {
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j] = new Casilla();
            }
        }
    }

    public boolean markCasilla(char value, Posicion pos) {
        try {
            return casillas[pos.getX()][pos.getY()].isEmpty() && casillas[pos.getX()][pos.getY()].setValue(value);
        }catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }

    }


}
