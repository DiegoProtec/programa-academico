package fabrica;

public class CaracterAceito {

    public static final int SO_NUMEROS = 0;
    public static final int SO_LETRAS = 1;
    public static final int EMAIL = 2;
    public static final int SEMESPECIAL = 3;

    public static TextFielter criar(int tipo) {
        switch (tipo) {
            case SO_NUMEROS:
                return new TextFielter("[^0-9]");
            case SO_LETRAS:
                return new TextFielter("[^A-Z|^a-z|^ ]");
            case EMAIL:
                return new TextFielter("[^A-Z|^a-z|^0-9|^@|^_|^.]");
            case SEMESPECIAL:
                return new TextFielter("[^A-Z|^a-z|^0-9|]");
            default:
                return new TextFielter("");
        }
    }

    public static TextFielter criar(String er) {
        return new TextFielter(er);
    }
}
