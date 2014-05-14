package fabrica;

import javax.swing.text.AttributeSet;  
import javax.swing.text.BadLocationException;  

public class ValorAceito extends LimitaLargura {

    private char[] specialCharactersAllowed;  
    private boolean allSpecialCharacterAllowed;   
    private boolean intAllowed;  
    private boolean lettersAllowed;  
    private boolean floatValidation;  

    private boolean point;  
      
    public ValorAceito(int maxLenght, boolean intAllowed, boolean floatValidation, boolean lettersAllowed, boolean allSpecialCharacterAllowed, char ... specialCharactersAllowed) {  
        super(maxLenght);  
        this.intAllowed = intAllowed;  
        this.floatValidation = floatValidation;  
        this.lettersAllowed = lettersAllowed;  
        this.allSpecialCharacterAllowed = allSpecialCharacterAllowed;  
        this.specialCharactersAllowed = specialCharactersAllowed;          
    }  
      
    @Override  
    public void insertString(FilterBypass fb, int offset, String str, AttributeSet attr) throws BadLocationException {  
         
    }  
  
    @Override  
    public void replace(FilterBypass fb, int offset, int length, String str, AttributeSet attr) throws BadLocationException {  
        char c;  
        byte n = 1;
        if (floatValidation) {  
            if(length > 0)  
                for(int i=0;i<length;i++) {  
                    c = fb.getDocument().getText(offset, length).charAt(i);  
                    if(c == '.') {  
                        point = false;  
                        break;  
                    }  
                }
            else  
                for(int i=0;i<fb.getDocument().getLength();i++) {  
                    c = fb.getDocument().getText(0, fb.getDocument().getLength()).charAt(i);  
                    if(c == '.') {  
                        point = true;  
                        break;  
                    } else {  
                        point = false;  
                    }  
                }  
        }  
        for (byte i=0;i<str.length();i++){  
            boolean isDigit = false;  
            boolean isLetter = false;  
            c = str.charAt(i);  
            if(Character.isDigit(c) && !intAllowed) {  
                n = 0;  
                isDigit = true;    
            } else if(Character.isDigit(c))  
                isDigit = true;  
            if((Character.getNumericValue(c) >= 10 && Character.getNumericValue(c) <= 35) && (!lettersAllowed || floatValidation)) {  
                n = 0;  
                isLetter = true;  
            } else if(Character.getNumericValue(c) >= 10 && Character.getNumericValue(c) <= 35)  
                isLetter = true;  
              
            if (!allSpecialCharacterAllowed && specialCharactersAllowed.length > 0 && !isLetter && !isDigit)  
                for(int k=0;k<specialCharactersAllowed.length;k++)  
                    if(c != specialCharactersAllowed[k])  
                        n = 0;  
                    else {  
                        n = 1;  
                        break;  
                    }  
            else if (allSpecialCharacterAllowed && !isLetter && !isDigit)  
                n = 1;  
            else if (!isLetter && !isDigit)  
                n = 0;  
              
            if (floatValidation) {              
                if ((c == '.') & point)  
                    n = 0;  
                else if (c == '.') {  
                    n = 1;  
                    point = true;  
                }  
            }  
        }  
          
        if(n != 0)  
            super.replace(fb, offset, length, str, attr);  
    }  
  
    public boolean isFloatValidation() {  
        return floatValidation;  
    }  
  
    public void setFloatValidation(boolean floatValidation) {  
        this.floatValidation = floatValidation;  
    }  
  
    public boolean isIntAllowed() {  
        return intAllowed;  
    }  
  
    public void setIntAllowed(boolean intAllowed) {  
        this.intAllowed = intAllowed;  
    }  
  
    public boolean isLettersAllowed() {  
        return lettersAllowed;  
    }  
  
    public void setLettersAllowed(boolean lettersAllowed) {  
        this.lettersAllowed = lettersAllowed;  
    }  
  
    public char[] getSpecialCharactersAllowed() {  
        return specialCharactersAllowed;  
    }  
  
    public void setSpecialCharactersAllowed(char[] specialCharactersAllowed) {  
        this.specialCharactersAllowed = specialCharactersAllowed;  
    }  
  
    public boolean isAllSpecialChacacterAllowed() {  
        return allSpecialCharacterAllowed;  
    }  
  
    public void setAllSpecialChacacterAllowed(boolean allSpecialChacacterAllowed) {  
        this.allSpecialCharacterAllowed = allSpecialChacacterAllowed;  
    }  
  
    public boolean hasPoint() {  
        return point;  
    }  
  
    public void setPoint(boolean point) {  
        this.point = point;  
    }  
}  
