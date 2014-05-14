package fabrica;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class LimitaLargura extends DocumentFilter {

    private int iMaxLength;

    public LimitaLargura(int maxLen) {
        super();
        iMaxLength = maxLen;
    }

    @Override
    public void insertString(FilterBypass fb, int offset, String str, AttributeSet attr) throws BadLocationException {
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String str, AttributeSet attr) throws BadLocationException {
        if (str == null) {
            return;
        }

        if (iMaxLength <= 0) {
            if (length == 0) {
                fb.insertString(offset, str, attr);
            } else {
                fb.replace(offset, length, str, attr);
            }
            return;
        }
        int ilen = (fb.getDocument().getLength() + str.length());

        if (ilen <= iMaxLength) {
            if (length == 0) {
                fb.insertString(offset, str, attr);
            } else {
                fb.replace(offset, length, str, attr);
            }
        } else {
            if (fb.getDocument().getLength() == iMaxLength) {
                return;
            }
            String newStr = str.substring(0, (iMaxLength - fb.getDocument().getLength()));
            if (length == 0) {
                fb.insertString(offset, newStr, attr);
            } else {
                fb.replace(offset, length, newStr, attr);
            }
        }
    }
}