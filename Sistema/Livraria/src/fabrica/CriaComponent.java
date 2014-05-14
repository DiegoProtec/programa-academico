package fabrica;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.text.PlainDocument;

public class CriaComponent {

    private final Mascara mascara;
    private JFormattedTextField campoFormatted;
    private ValorAceito valor;
    private PlainDocument doc;
    private JTextField campoText;
    private IDocument document;
    private JButton botao;

    public CriaComponent() {
        mascara = new Mascara();
    }

    public JFormattedTextField criaFormattedTextField(int lenght, String masc) {
        campoFormatted = new JFormattedTextField(mascara.setMascara(masc));
        valor = new ValorAceito(lenght, true, false, false, false);
        doc = new PlainDocument();
        doc.setDocumentFilter(valor);
        campoFormatted.setDocument(doc);
        campoFormatted.getDocument().putProperty("name", masc);
        campoFormatted.setFocusLostBehavior(JFormattedTextField.COMMIT);
        return campoFormatted;
    }

    public JFormattedTextField criaFormattedTextField(int lenght) {
        campoFormatted = new JFormattedTextField();
        doc = new PlainDocument();
        valor = new ValorAceito(lenght, false, false, true, true);
        doc.setDocumentFilter(valor);
        campoFormatted.setDocument(doc);
        campoFormatted.setSize(582, 28);
        return campoFormatted;
    }

    public JTextField criaTextFieldProduto(int lenght, String str) {
        campoText = new JTextField();
        valor = new ValorAceito(lenght, true, false, true, true);
        doc = new PlainDocument();
        doc.setDocumentFilter(valor);
        campoText.setDocument(doc);
        campoText.getDocument().putProperty("name", str);
        campoText.setSize(322, 28);
        return campoText;
    }

    public JTextField criaTextField(int lenght, String tipo) {
        campoText = new JTextField();
        doc = new PlainDocument();
        if (tipo.equals("email")) {
            document = new DocEmail();
            campoText.setDocument(document.getDocumentoPlano());
            return campoText;
        } else if (tipo.equals("semespecial")) {
            document = new DocSemEsp();
            campoText.setDocument(document.getDocumentoPlano());
            return campoText;
        } else {
            if (tipo.equals("semespeciais")) {
                valor = new ValorAceito(lenght, false, false, true, true);
            } else if (tipo.equals("numeros")) {
                valor = new ValorAceito(lenght, true, false, false, false);
            }
            doc.setDocumentFilter(valor);
            campoText.setDocument(doc);
            return campoText;
        }
    }

    public JButton criaButton() {
        botao = new JButton();
        botao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procurar.png")));
        return botao;
    }
}
