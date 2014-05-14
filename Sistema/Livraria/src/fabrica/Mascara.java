package fabrica;

import javax.swing.text.MaskFormatter;

public class Mascara {

    private String masc;

    public Mascara() {
    }

    public MaskFormatter setMascara(String nome) {
        if (nome.equals("CPF")) {
            masc = "###.###.###-##";
        } else if (nome.equals("CEP")) {
            masc = "##.###-###";
        }
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter(masc);
            mask.setPlaceholderCharacter(' ');
        } catch (java.text.ParseException ex) {
        }
        return mask;

    }
}
