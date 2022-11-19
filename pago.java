import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.Graphics;
public class pago extends Applet implements ActionListener{
  TextField p1,p2,p3,p4,p5,p6,p7,p8,p9;
   Button b;
   public void init (){
      resize(450,400);
      setLayout(null);
      Color colorpurple=new Color(0,255,255);
      setBackground(colorpurple);    
      p1=new TextField(20);
      add(p1);
      p2=new TextField(20);
      add(p2);
      p3=new TextField(20);
      add(p3);
      p4=new TextField(20);
      add(p4);
      p5=new TextField(20);
      add(p5);
      p6=new TextField(20);
      add(p6);
      p7=new TextField(20);
      add(p7);
      p8=new TextField(20);
      add(p8);
      p9=new TextField(20);
      add(p9);
   p1.setBounds(240, 70, 50, 20); 
   p2.setBounds(240, 140, 50, 20);
   p3.setBounds(240, 165, 50, 20);
   p4.setBounds(240, 190, 50, 20);
   p5.setBounds(240, 215, 50, 20);
   p6.setBounds(310, 140, 50, 20);
   p7.setBounds(310, 165, 50, 20);
   p8.setBounds(310, 190, 50, 20);
   p9.setBounds(240, 240, 70, 20);
   }
    public pago(){
      setLayout(null);
      b=new Button("Calcular");
      add(b);
      b.addActionListener(this);
      b.setBounds(110, 95, 80, 20);
  }
   public void paint(Graphics g){      
      g.setColor(Color.black);
      Font oldFont=getFont();
      Font fuente=new Font("Arial",Font.BOLD , 15);
      g.setFont(fuente);
      g.drawString("Calcular Salario", 110, 60);
      g.drawString("NH", 250, 130);
      g.drawString("Pago", 310, 130);
      g.drawString("Horas Trabajadas", 110, 85); 
      g.drawString("Horas Normales", 110, 155);
      g.drawString("Horas Dobles", 110, 180);
      g.drawString("Horas Triples", 110, 205);
      g.drawString("ISR",110 ,230);
      g.drawString("El pago es:", 110, 255);    
    }
     public void actionPerformed(ActionEvent e) {     
        double m1,sal,d,he,hd=0,ht=0,phe,phd=0,pht=0;       
          if (e.getActionCommand().equals("Calcular")){
          m1 = Double.parseDouble(p1.getText());
          if(m1<41){
            he=m1;
            phe=m1*150;
          }else {
          he=40;
          phe=6000;
          if(m1>40 && m1<46){
            hd=m1-40;
            phd=hd*300;
            }else{
                hd=5;
               phd=1500;
          if(m1>45 && m1<=50){
            ht=m1-45;
            pht=ht*450;
            }else {
               ht=5;
               pht=2250;
          }
          }
          }
          sal=phe+phd+pht;
          d=sal*0.15;
          sal=sal-d;
          p2.setText(String.valueOf(he));
          p3.setText(String.valueOf(hd));
          p4.setText(String.valueOf(ht));
          p5.setText(String.valueOf(d));
          p6.setText(String.valueOf(phe));
          p7.setText(String.valueOf(phd));
          p8.setText(String.valueOf(pht));
          p9.setText(String.valueOf(sal));
      }
    }
}
