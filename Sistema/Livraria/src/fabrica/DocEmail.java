package fabrica;

import javax.swing.text.PlainDocument;

public class DocEmail implements IDocument {

    PlainDocument doc;

    public DocEmail() {
        super();
    }

    @Override
    public PlainDocument getDocumentoPlano() {
        if (doc == null) {
            doc = new PlainDocument();
        }
        doc.setDocumentFilter(CaracterAceito
                .criar(CaracterAceito.EMAIL));
        return doc;
    }
}