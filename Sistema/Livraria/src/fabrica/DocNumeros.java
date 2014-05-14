package fabrica;

import javax.swing.text.PlainDocument;

public class DocNumeros implements IDocument {

    PlainDocument doc;

    public DocNumeros() {
        super();
    }

    @Override
    public PlainDocument getDocumentoPlano() {
        if (doc == null) {
            doc = new PlainDocument();
        }
        doc.setDocumentFilter(CaracterAceito
                .criar(CaracterAceito.SO_NUMEROS));
        return doc;
    }
}
