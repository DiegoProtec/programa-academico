package fabrica;

import javax.swing.text.PlainDocument;

public class DocSemEsp implements IDocument {

    PlainDocument doc;

    public DocSemEsp() {
        super();
    }

    @Override
    public PlainDocument getDocumentoPlano() {
        if (doc == null) {
            doc = new PlainDocument();
        }
        doc.setDocumentFilter(CaracterAceito
                .criar(CaracterAceito.SEMESPECIAL));
        return doc;
    }
}
