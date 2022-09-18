import java.awt.*;
import java.awt.event.*;
public class capital_checker extends Frame implements ActionListener
{
      /*
	 * 
	 */
	private static final long serialVersionUID = 1L;
	  Label l1,l2,l3;
      Choice country, capital;
      Button btncl;
      TextField txt;
      String a[] = {"New delhi","Beijing","Washington-DC","London","Moscow"};
      capital_checker()
      {
    	 setLayout(new FlowLayout());
    	 setTitle("capital checker");
         setSize(800,500);
         btncl = new Button("check");
         country = new Choice();
         capital = new Choice();
    	 l1 = new Label("select country");
    	 l2 = new Label("select capital");
    	 txt = new TextField(30);
    	 txt.setEditable(false);
    	 country.add("India");
    	 country.add("China");
    	 country.add("America");
    	 country.add("England");
    	 country.add("Russia");
    	 capital.add("Beijing");
    	 capital.add("New delhi");
    	 capital.add("Washington-DC");
    	 capital.add("London");
    	 capital.add("Moscow");
    	 add(country);
    	 add(l1);
    	 add(capital);
    	 add(l2);
    	 add(btncl);
         add(txt);
    	 setVisible(true);
    	 btncl.addActionListener(this);
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
    	  new capital_checker();
      }
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if((country.getSelectedItem()=="India")&&(capital.getSelectedItem()=="New delhi"))
		{
			txt.setText("CORRECT ANSWER");
		}
		else if((country.getSelectedItem()=="China")&&(capital.getSelectedItem()=="Beijing"))
		{
			txt.setText("CORRECT ANSWER");
		}
		else if((country.getSelectedItem()=="England")&&(capital.getSelectedItem()=="London"))
		{
			txt.setText("CORRECT ANSWER");
		}
		else if((country.getSelectedItem()=="America")&&(capital.getSelectedItem()=="Washington-DC"))
		{
			txt.setText("CORRECT ANSWER");
		}
		else if((country.getSelectedItem()=="Russia")&&(capital.getSelectedItem()=="Moscow"))
		{
			txt.setText("CORRECT ANSWER");
		}
		else
		{
	        if(country.getSelectedItem()== "India")
	        {
	        	txt.setText("wrong the correct answer is: "+a[0]);
	        }
	        else if(country.getSelectedItem()== "China")
	        {
	        	txt.setText("wrong the correct answer is: "+a[1]);
	        }
	        else if(country.getSelectedItem()== "America")
	        {
	        	txt.setText("wrong the correct answer is: "+a[2]);
	        }
	        else if(country.getSelectedItem()== "England")
	        {
	        	txt.setText("wrong the correct answer is: "+a[3]);
	        }
	        else if(country.getSelectedItem()== "Russia")
	        {
	        	txt.setText("wrong the correct answer is: "+a[4]);
	        }
		}
		
	}
}
