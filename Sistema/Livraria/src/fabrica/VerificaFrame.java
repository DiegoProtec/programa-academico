package fabrica;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class VerificaFrame {

    public VerificaFrame() {
    }

    public static Boolean verificaFrame(JDesktopPane jDesktopPane, JInternalFrame frame) {
        Boolean valor = false;
        JInternalFrame[] results;
        results = jDesktopPane.getAllFrames();
        for (int i = 0; i < results.length; i++) {
            if (results[i].equals(frame)) {
                valor = true;
                break;
            }
        }
        return valor;
    }
}
