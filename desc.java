import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.Graphics;
public class desc extends Applet implements ActionListener{

  TextField p1,p2,p3;
   Button b;
   List l1;
   public void init (){
      resize(400,400);
      setLayout(null);
      Color colorpurple=new Color(0, 255, 255);
      setBackground(colorpurple);    
      p1=new TextField(20);
      add(p1); 
      p2=new TextField(20);
      add(p2);  
      p3=new TextField(20);
      add(p3);  
      p1.setBounds(170, 68, 65, 20); 
      p2.setBounds(200, 190, 65, 20);
      p3.setBounds(170, 215, 65, 20);
      l1 = new List(4,false);
      l1.addItem("10%");
      l1.addItem("20%");
      l1.addItem("30%");
      l1.addItem("40%");
      l1.addItem("50%");
      add(l1);
      l1.setBounds(170, 100, 65, 65);
   }
   
    public desc(){
      setLayout(null);
      b=new Button("Calcular Pago");
      add(b);
      b.addActionListener(this);
      b.setBounds(110, 170, 85, 20);
  }
 
   public void paint(Graphics g) {         
      g.setColor( Color.black);
      Font oldFont=getFont();
      Font fuente=new Font("Arial",Font.BOLD , 15);
      g.setFont(fuente);
      g.drawString("Calcular Descuento ", 110, 60);
      g.drawString("Total   $", 110, 85);     
      g.drawString("Elige 1", 110, 115);
      g.drawString("Descuento $", 110, 205);
      g.drawString("Pago   $", 110, 230);
    }
 
     public void actionPerformed(ActionEvent e) {     
        double total=0,tot=0;
        if(e.getActionCommand().equals("Calcular Pago")){
              total = Double.parseDouble(p1.getText());
              String desc = l1.getSelectedItem();
              if(desc=="10%"){
              tot=total*.10;
              } else if(desc=="20%"){
              tot=total*.20;
              } else if(desc=="30%"){
              tot=total*.30;
              } else if(desc=="40%"){
              tot=total*.40;
              } else if(desc=="50%"){
              tot=total*.50;
              }

              p2.setText(String.valueOf(tot));
              p3.setText(String.valueOf(total-tot));
            }
          }
        }
