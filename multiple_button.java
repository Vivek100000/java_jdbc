import java.awt.*;
import java.awt.event.*;
public class multiple_button extends Frame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button btncl, bat;
    TextField txt;
    multiple_button()
    {
    	setLayout(new GridLayout(3,1));
    	setSize(400,200);
        txt = new TextField(20);
        btncl = new Button("click");
        bat = new Button("press");
        btncl.addActionListener(this);
        add(txt);
        add(btncl);
        add(bat);
        bat.addActionListener(this);
        btncl.addActionListener(this);
        setVisible(true);
        addWindowListener (new WindowAdapter()
        {
             public void windowClosing(WindowEvent e)
            {
        	System.exit(0);
            }
        });
    }
    public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        new multiple_button();
     }
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getActionCommand()== "press")
    	{
    		txt.setText("PRESSED");
    	}
    	else if(e.getActionCommand() == "click")
    	{
    		txt.setText("CLICKED");
    	}
    }
	

}
