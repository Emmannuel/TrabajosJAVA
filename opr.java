/*
 * Copyright (C) 2022 Emmanuel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author Emmanuel
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class opr extends JFrame implements ActionListener {
    private JTextField f1,f2;
    private JComboBox<String> opc;
    private JLabel resul;
    private JButton button;

    public opr() {
        f1= new JTextField(4);
        f2 = new JTextField(4);
        resul = new JLabel("", JLabel.RIGHT);
        opc = new JComboBox<String>(new String[]{"Suma", "Resta", "Multiplicaci\u00F3n", "Divisi\u00F3n"});
        button = new JButton("Calcular");
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        JPanel panel, subpanel;
        panel = new JPanel(new BorderLayout());
        subpanel = new JPanel(new GridLayout(3, 1));
        subpanel.add(new JLabel("Numero 1:"));
        subpanel.add(new JLabel("numero 2:"));
        subpanel.add(new JLabel("Operaciones:"));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new JPanel(new GridLayout(3, 1));
        subpanel.add(f1);
        subpanel.add(f2);
        subpanel.add(opc);
        panel.add(subpanel);
        pane.add(panel, BorderLayout.NORTH);
        panel = new JPanel(new FlowLayout());
        panel.add(button);
        pane.add(panel);
        panel = new JPanel(new BorderLayout());
        subpanel = new JPanel(new GridLayout(1, 1));
        subpanel.add(new JLabel("Valor de resultado:"));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new JPanel(new GridLayout(1, 1));
        subpanel.add(resul);
        panel.add(subpanel);
        pane.add(panel, BorderLayout.SOUTH);
        button.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int operacion;
        double n1=0, n2=0, r=0;
        try {
            n1 = Double.parseDouble(f1.getText());
            n2 = Double.parseDouble(f2.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa solo numeros.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        operacion = opc.getSelectedIndex()+1;
        if(operacion==1){
            r=n1+n2;
        } if(operacion==2){
            r=n1-n2;
        } if(operacion==3){
            r=n1*n2;
        } if(operacion==4){
            r=n1/n2;
        }
        resul.setText(String.valueOf(r));
    }
    public static void main(String[] args) {
        new opr().setVisible(true);
    }
}