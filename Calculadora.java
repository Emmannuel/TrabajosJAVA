import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;
public class Calculadora extends Applet implements ActionListener{
    // Se crean las variables globales
    Button b0, b00, b1, b2, b3, b4, b5, b6, b7, b8, b9, bp, bs, br, bm, bd, bi, bl;
    TextField t1;
    private double numero = 0.0;
    private double resultado = 0.0;
    private String comp = "";
    private String calc;
    public AppletCalculadora(){
        /* Este es el constructor, aqui se crean la caja de texto, los botones, y se añade la funcion de escuchar por parte de  los botones. */
        setLayout(null);
        resize(200,200);
        setBackground(new Color(0, 0, 0));
        b0 = new Button("0");
        b00 = new Button("00");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        bp = new Button(".");
        bs = new Button("+");
        br = new Button("-");
        bm = new Button("*");
        bd = new Button("/");
        bi = new Button("=");
        bl = new Button("Limpiar");
        t1 = new TextField(100);
        
        t1.setBounds(0, 0, 200, 30);
        add(t1);
        b7.setBounds(0, 30, 50, 40);
        add(b7);
        b8.setBounds(50, 30, 50, 40);
        add(b8);
        b9.setBounds(100, 30, 50, 40);
        add(b9);
        bd.setBounds(150, 30, 50, 40);
        add(bd);
        b4.setBounds(0, 70, 50, 40);
        add(b4);
        b5.setBounds(50, 70, 50, 40);
        add(b5);
        b6.setBounds(100, 70, 50, 40);
        add(b6);
        bm.setBounds(150, 70, 50, 40);
        add(bm);
        b1.setBounds(0, 110, 50, 40);
        add(b1);
        b2.setBounds(50, 110, 50, 40);
        add(b2);
        b3.setBounds(100, 110, 50, 40);
        add(b3);
        br.setBounds(150, 110, 50, 40);
        add(br);
        b0.setBounds(0, 150, 50, 40);
        add(b0);
        b00.setBounds(50, 150, 50, 40);
        add(b00);
        bp.setBounds(100, 150, 50, 40);
        add(bp);
        bs.setBounds(150, 150, 50, 40);
        add(bs);
        bi.setBounds(0, 190, 50, 40);
        add(bi);
        bl.setBounds(50, 190, 50, 40);
        add(bl);
        
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bs.addActionListener(this);
        br.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        bi.addActionListener(this);
        b0.addActionListener(this);
        b00.addActionListener(this);
        bp.addActionListener(this);
        bl.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        // Este es el metodo que hace las operaciones necesarias para
        // que cada boton tenga su funcion.
        if (ae.getSource() == b0){
            calc = t1.getText();
            t1.setText(calc + "0");
        }
        if (ae.getSource() == b00){
            calc = t1.getText();
            t1.setText(calc + "00");
        }
        if (ae.getSource() == b1){
            calc = t1.getText();
            t1.setText(calc + "1");
        }
        if (ae.getSource() == b2){
            calc = t1.getText();
            t1.setText(calc + "2");
        }
        if (ae.getSource() == b3){
            calc = t1.getText();
            t1.setText(calc + "3");
        }
        if (ae.getSource() == b4){
            calc = t1.getText();
            t1.setText(calc + "4");
        }
        if (ae.getSource() == b5){
            calc = t1.getText();
            t1.setText(calc + "5");
        }
        if (ae.getSource() == b6){
            calc = t1.getText();
            t1.setText(calc + "6");
        }
        if (ae.getSource() == b7){
            calc = t1.getText();
            t1.setText(calc + "7");
        }
        if (ae.getSource() == b8){
            calc = t1.getText();
            t1.setText(calc + "8");
        }
        if (ae.getSource() == b9){
            calc = t1.getText();
            t1.setText(calc + "9");
        }
        if (ae.getSource() == bp){
            calc = t1.getText();
            t1.setText(calc + ".");
        } 
        if (ae.getSource() == bs){
            suma();
        }
        if (ae.getSource() == br){
            resta();
        }
        if (ae.getSource() == bm){
            multiplicar();
        }
        if (ae.getSource() == bd){
            dividir();
        }
        if (ae.getSource() == bi){
            igual();
        }
        if (ae.getSource() == bl){
            resultado = 0.0;
            numero = 0.0;
            comp = "";
            calc = "";
            t1.setText("");
        }
    }
    public void suma(){
        // Este metodo implementa la suma.
        if(t1.getText() == ""){
            t1.setText("0");
        }
        numero = Double.parseDouble(t1.getText());
        if(comp == "-"){
            resultado = (resultado - numero);
            t1.setText("0");
        } else if(comp == "*"){
            resultado = (resultado * numero);
            t1.setText("0");
        } else if(comp == "/"){
            resultado = (resultado / numero);
            t1.setText("0");
        }
        comp = "+";
        numero = Double.parseDouble(t1.getText());
        resultado = (resultado + numero);
        t1.setText("");
    }
    public void resta(){
        // Este metodo implementa la resta.
        numero = Double.parseDouble(t1.getText());
        if(comp == "+"){
            resultado = (resultado + numero);
            t1.setText("");
        } else if(comp == "*"){
            resultado = (resultado * numero);
            t1.setText("");
        } else if(comp == "/"){
            resultado = (resultado / numero);
            t1.setText("");
        }
        comp = "-";
        numero = Double.parseDouble(t1.getText());
        resultado = (numero - resultado);
        t1.setText("");
    }
 
    public void multiplicar(){
        // Este metodo implementa la multiplicacion.
        if(t1.getText() == ""){
            t1.setText("1");
        }
        numero = Double.parseDouble(t1.getText());
        if(comp == "+"){
            resultado = (resultado + numero);
            t1.setText("1");
        } else if(comp == "-"){
            resultado = (resultado - numero);
            t1.setText("1");
        } else if (comp == "/"){
            resultado = (resultado / numero);
            t1.setText("1");
        }
        if(resultado == 0.0){
            resultado = 1.0;
        }
        comp = "*";
        numero = Double.parseDouble(t1.getText());
        resultado = (resultado * numero);
        t1.setText("");
    }
    public void dividir(){
        // Este metodo implementa la division.
        numero = Double.parseDouble(t1.getText());
        if(comp == "+"){
            resultado = (resultado + numero);
            t1.setText("");
        } else if(comp == "-"){
            resultado = (resultado - numero);
            t1.setText("");
        } else if(comp == "*"){
            resultado = (resultado * numero);
            t1.setText("");
        }
        if(resultado == 0.0){
            resultado = 1.0;
        }
        comp = "/";
        numero = Double.parseDouble(t1.getText());
        resultado = (numero / resultado);
        t1.setText("");
    }
    public void igual(){
        // Este metodo implementa la igualdad.
        numero = Double.parseDouble(t1.getText());
        if(comp == "+"){
            resultado = (resultado + numero)
            t1.setText("" + resultado);
        } else if(comp == "-"){
            resultado = (resultado - numero);
            t1.setText("" + resultado);
        } else if(comp == "*"){
            resultado = (resultado * numero);
            t1.setText("" + resultado);
        } else if (comp == "/"){
            resultado = (resultado / numero);
            t1.setText("" + resultado);
        }
    }
}