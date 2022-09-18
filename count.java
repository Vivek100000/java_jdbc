import java.awt.*;
import java.awt.event.*;
public class count extends Frame implements ActionListener
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button btncl;
    TextField txt;
    Label l1;
    int value = 0;
    count()
    {
    	setLayout(new FlowLayout());
    	setSize(300,200);
    	setVisible(true);
    	btncl = new Button("counter");
    	txt = new TextField(10);
    	l1 = new Label("count");
    	add(l1);add(txt);add(btncl);
    	txt.setEditable(false);
    	txt.setText(Integer.toString(value));
    	btncl.addActionListener(this);
    	addWindowListener(new WindowAdapter()
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
		new count();

	}
	public void actionPerformed(ActionEvent e)
	{
		value++;
		txt.setText(Integer.toString(value));
	}

}
