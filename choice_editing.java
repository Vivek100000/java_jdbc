import java.awt.*;
import java.awt.event.*;
public class choice_editing extends Frame implements ActionListener
{
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TextField txt;
     Button btncl1;
     Button btncl2;
     Choice data;
     choice_editing()
     {
    	setLayout(new FlowLayout());
    	setSize(300,100);
    	setVisible(true);
        txt = new TextField(10);
        btncl1 = new Button("ADD");
        btncl2 = new Button("REMOVE");
        data = new Choice();
        btncl1.addActionListener(this);
        btncl2.addActionListener(this);
        txt.setEditable(true);
        data.add("anish");
        data.add("varun");
        data.add("deepak");
        data.add("aryan");
        data.add("chetan");
        data.add("chetan");
        data.add("bhavesh");
        data.add("Roshan");
        add(data);
        add(txt);
        add(btncl1);
        add(btncl2);
        addWindowListener(new WindowAdapter()
        		{
        	        public void windowClosing(WindowEvent e)
        	        {
        	        	System.exit(0);
        	        }
        		});
     }
     public static void main(String args[])
     {
    	 new choice_editing();
     }
     public void actionPerformed(ActionEvent e)
     {
    	 if(e.getActionCommand()== "ADD")
     	{
    		 data.add(txt.getText());
     	}
     	else if(e.getActionCommand() == "REMOVE")
     	{
     		 data.remove(data.getSelectedItem());
     	}
     }
}
