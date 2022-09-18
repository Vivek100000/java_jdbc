import java.awt.*;
import java.awt.event.*;

public class different_layouts implements ActionListener {
    Frame f;
    Panel p1, p2, p3, p4;
    Label l1, l2, l3, l4, l5, l6, l7, l8;
    TextField txt;
    different_layouts() {
        f = new Frame("FIRST LAYOUT");
        Button d = new Button("LAYOUT");
        Button d1 = new Button("LAYOUT_da");
        p1 = new Panel(new GridLayout(4, 1));
        p2 = new Panel(new FlowLayout());
        p3 = new Panel(new GridLayout(2,1));
        p4 = new Panel(new CardLayout());
        f.setLayout(new FlowLayout());
        l1 = new Label("First");
        l2 = new Label("SECOND");
        l3 = new Label("THIRD");
        l4 = new Label("four");
        l5 = new Label("five");
        l6 = new Label("Six");
        l7 = new Label("seven");
        l8 = new Label("eight");
        txt = new TextField(15);
        p1.add(l1);
        p1.add(l2);
        p1.add(txt);
        p2.add(l3);
        p2.add(l4);
        p3.add(l5);
        p3.add(l6);
        p4.add(l7);
        p4.add(l8);
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        f.add(d,BorderLayout.NORTH);
        f.add(d1,BorderLayout.CENTER);
        d.addActionListener(this);
        f.setSize(500,400);
        f.setVisible(true);

    }
    public static void main(String args[])
    {

        new different_layouts();
    }
    public void actionPerformed(ActionEvent e)
    {
    	txt.setText("button clicked");
    }

}