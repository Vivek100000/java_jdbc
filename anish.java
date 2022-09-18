
import java.awt.*;
import java.awt.event.*;
public class anish  extends Frame implements ActionListener{
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TextField tf;
     Label l2;
     Button b;
       anish()
     {
    	   setLayout(new FlowLayout());
    	   setSize(400,300);
      	 setVisible(true);
    	 b=new Button("FIND IP");
    	 tf=new TextField(20);
    	 l2=new Label("IP");
    	 add(b);
    	 add(tf);
    	 add(l2);
    	 b.addActionListener(this);
    	  
     }
    
	public void actionPerformed(ActionEvent e)
     {
    	 try {
    		   String host = tf.getText();
    		 String ip=java.net.InetAddress.getByName(host).getHostAddress();
    		 tf.setText(ip);
    		
    	 }
    	 catch(Exception ex)
    	 {
    		 System.out.println(ex);
    	 }
     }
     public static void main(String args[])
     {
         new anish(); 
    }
}