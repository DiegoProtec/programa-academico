package fabrica;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class TextFielter extends DocumentFilter {

    private String er;     
     
   public TextFielter(String pEr){  
      super();  
      this.er = pEr;  
   }  
     
   @Override  
   public void insertString(FilterBypass fb, int offset, String text,  
         AttributeSet attr) throws BadLocationException {  
      fb.insertString(offset, text.replaceAll(this.er, ""), attr);  
   }  
  
   @Override  
   public void replace(FilterBypass fb, int offset, int length, String text,  
         AttributeSet attrs) throws BadLocationException {  
      fb.replace(offset, length, text.replaceAll(this.er, ""), attrs);    
   }

}