import java.awt.*;
import java.awt.event.*;

public class q16 extends Frame implements ActionListener,ItemListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Panel P1,P2,P3;
	Label l1,l2,l3;
	TextField txt1, txt2;
	Button btncal;
	Checkbox chkdiscount,chkwholesaler, chkretailer;
	CheckboxGroup cbg;
	double cost = 0.0;
	double temp = 0.0;
	q16()
	{
		setLayout(new FlowLayout());
		setTitle("Brilliant packaging company");
		setVisible(true);
		setSize(500,200);
		l1 = new Label("unit ordered");
		l2 = new Label("customer type");
		l3 = new Label("total cost in Rs", Label.CENTER);
		txt1 = new TextField(20);
		txt2 = new TextField(20);
		txt2.setEditable(false);
		btncal = new Button("calculate");
	    cbg = new CheckboxGroup();
		chkdiscount = new Checkbox("special discount");
		chkwholesaler = new Checkbox("wholesaler",cbg,true);
		chkretailer = new Checkbox("retailer",false,cbg);
        P1 = new Panel(new GridLayout(3,1));
        P2 = new Panel(new GridLayout(3,1));
        P3 = new Panel(new GridLayout(1,3));
        P1.add(l1);
        P1.add(txt1);
        P1.add(chkdiscount);
        P2.add(l2);
        P2.add(chkwholesaler);
        P2.add(chkretailer);
        P3.add(btncal);
        P3.add(l3);
        P3.add(txt2);
        add(P1);
        add(P2);
        add(P3);
        btncal.addActionListener(this);
        chkdiscount.addItemListener(this);
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
	new q16();
}
public void actionPerformed(ActionEvent arg0)
{
	int i=Integer.parseInt(txt1.getText());
	if(i>0&&i<=15)
	{
		if(chkwholesaler.getState())
			cost = 50*i;
		else
			cost = 60*i;
	}
	if(i>15&&i<=20)
	{
		if(chkwholesaler.getState())
			cost = 45*i;
		else
			cost = 55*i;
	}
	if(i>20&&i<=30)
	{
		if(chkwholesaler.getState())
			cost = 40*i;
		else
			cost = 50*i;
	}
	if(i>30&&i<=50)
	{
		if(chkwholesaler.getState())
			cost = 35*i;
		else
			cost = 45*i;
	}
	if(i>50)
	{
		if(chkwholesaler.getState())
			cost = 30*i;
		else
			cost = 40*i;
	}
	txt2.setText(cost+"");
	temp = cost;
}
  public void itemStateChanged(ItemEvent e)
  {
  	if(chkdiscount.getState())
  	
  		cost = cost - (cost*0.1);
  	else
  		cost = temp;
  	txt2.setText(cost+"");
  }
}