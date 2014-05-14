package fabrica;

import javax.swing.InputVerifier;
import javax.swing.JComponent;

public class MyInputVerifier extends InputVerifier {

    private boolean res;

    public MyInputVerifier(boolean res) {
        this.res = res;
    }

    @Override
    public boolean verify(JComponent input) {
        if (res) {
            return true;
        } else {
            return false;
        }
    }
}
