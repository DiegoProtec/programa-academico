package fabrica;

import javax.swing.text.PlainDocument;

public class DocLetras implements IDocument {

    PlainDocument doc;

    @Override
    public PlainDocument getDocumentoPlano() {
        if (doc == null) {
            doc = new PlainDocument();
        }
        doc.setDocumentFilter(CaracterAceito
                .criar(CaracterAceito.SO_LETRAS));
        return doc;
    }
}