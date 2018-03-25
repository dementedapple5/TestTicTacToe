public class Casilla {

    private char value;

    public Casilla() {
        value = ' ';
    }


    public char getValue() {
        return value;
    }


    public boolean setValue(char value) {
        if (value == 'X' || value == 'O') {
            this.value = value;
            return true;
        }
        return false;
    }


    public boolean isEmpty() {
        return value == ' ';
    }
}
