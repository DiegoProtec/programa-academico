package fabrica;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class DecimalFormatedField extends JTextField {

    private static final long serialVersionUID = -7506506392528621022L;
    private static final NumberFormat MONETARY_FORMAT = new DecimalFormat("R$ #,##0.00");
    private NumberFormat numberFormat;
    private int limit = -1;

    public DecimalFormatedField(int casasDecimais) {
        this(new DecimalFormat((casasDecimais == 0 ? "#,##0" : "#,##0.") + makeZeros(casasDecimais)));
    }

    public DecimalFormatedField() {
        this(MONETARY_FORMAT);
    }

    public DecimalFormatedField(NumberFormat format) {
        numberFormat = format;
        setHorizontalAlignment(RIGHT);
        setDocument(new PlainDocument() {
            private static final long serialVersionUID = 1L;

            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                String text = new StringBuilder(DecimalFormatedField.this.getText().replaceAll("[^0-9]", "")).append(str.replaceAll("[^0-9]", "")).toString();
                super.remove(0, getLength());
                if (text.isEmpty()) {
                    text = "0";
                } else {
                    text = new BigInteger(text).toString();
                }
                super.insertString(0, numberFormat.format(new BigDecimal(getLimit() > 0 == text.length() > getLimit() ? text.substring(0, getLimit()) : text).divide(new BigDecimal(Math.pow(10, numberFormat.getMaximumFractionDigits())))), a);
            }

            @Override
            public void remove(int offs, int len) throws BadLocationException {
                super.remove(offs, len);
                if (len != getLength()) {
                    insertString(0, "", null);
                }
            }
        });
        addCaretListener(new CaretListener() {
            boolean update = false;

            @Override
            public void caretUpdate(CaretEvent e) {
                if (!update) {
                    update = true;
                    setCaretPosition(getText().length());
                    update = false;
                }
            }
        });
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                    setText("");
                }
            }
        });
        setText("0");
        setCaretPosition(getText().length());
    }

    public void setValue(BigDecimal value) {
        super.setText(numberFormat.format(value));
    }

    public final BigDecimal getValue() {
        return new BigDecimal(getText().replaceAll("[^0-9]", "")).divide(new BigDecimal(Math.pow(10, numberFormat.getMaximumFractionDigits())));
    }

    public NumberFormat getNumberFormat() {
        return numberFormat;
    }

    public void setNumberFormat(NumberFormat numberFormat) {
        this.numberFormat = numberFormat;
    }

    private static final String makeZeros(int zeros) {
        if (zeros >= 0) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < zeros; i++) {
                builder.append('0');
            }
            return builder.toString();
        } else {
            throw new RuntimeException("Número de casas decimais inválida (" + zeros + ")");
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

}
