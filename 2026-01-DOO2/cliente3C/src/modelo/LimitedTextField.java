package modelo;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class LimitedTextField extends JTextField {
  private int limit;
  
  public LimitedTextField(int limit) {
    super();
    this.limit = limit;
  }

  @Override
  public void setText(String str)  {
    if (str == null)
      return;

    if (str.length() <= limit) 
      super.setText(str);
    else
    	super.setText(str.substring(0, limit));
  }
}

