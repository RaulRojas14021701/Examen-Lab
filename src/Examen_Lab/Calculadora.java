package Examen_Lab;

import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;



public class Calculadora extends Peso{

    
        JTextField atras = new JTextField();
        double numero1;
        double resultado;
        //JButton numero1 = new JButton(1);
        //JButton numero2 = new JButton(2);
        //JButton numero3 = new JButton(3);
        //JButton numero4 = new JButton(4);
        //JButton numero5 = new JButton(5);
        //JButton numero6 = new JButton(6);
        //JButton numero7 = new JButton(7);
        //JButton numero8 = new JButton(8);
        //JButton numero9 = new JButton(9);
        String convertir;
        JPanel panelNum, panelCon; 
        boolean nuevaOperacion=true;
     	

    public Calculadora() {

        super();
        setSize(300, 400);
        setTitle("Convertidor");
        setResizable(false);

        JPanel panel = (JPanel) this.panelCon;
        panel.setLayout(new BorderLayout());

        atras = new JTextField("0", 50);
        atras.setBorder(new EmptyBorder(5, 5, 5, 5));
        atras.setFont(new Font("Arial", Font.BOLD,25));
        atras.setBackground(Color.WHITE);
        panel.add("North", atras);

        panelNum = new JPanel();
        panelNum.setLayout(new GridLayout(4, 3));
        panelNum.setBorder(new EmptyBorder(5, 5, 5, 5)) ;
//En mi momento de iluminacion recorde que era mas sencillo con un for que poner boton con boton :)
        for (int n = 9; n >= 0; n++) {
            botonNum("" + numero1);
        }
        botonNum(".");
        panel.add("Center", panelNum);

        panelCon = new JPanel();
        panelCon.setLayout(new GridLayout(6, 1));
        panelCon.setBorder(new EmptyBorder(5, 5, 5, 5));

        botonNum("Convertir");

        panel.add("East", panelCon);

        validate();
    }
    private void botonNum(String digito) {
		JButton btn = new JButton();
		btn.setText(digito);
		btn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent evt) {
				JButton btn = (JButton) evt.getSource();
				numeroPulsado(btn.getText());
			}
		});

		panelNum.add(btn);
	}
    private void numeroPulsado(String digito) {
		if (atras.getText().equals("0") || nuevaOperacion) {
			atras.setText(digito);
		} else {
			atras.setText(atras.getText() + digito);
		}
		nuevaOperacion = false;
	}

    private void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTitle(String convertidor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setResizable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void validate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

