package exemploevento1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author epastorizalorenzo
 */
public class VentanaEvento implements ActionListener {
    JFrame marco;
    JPanel panel;
    JButton boton,boton2;
    JLabel etiqueta;
    
public void crearventana(){
    marco = new JFrame("*** evento 1**");
    panel = new JPanel();
    boton= new JButton("PREME");
    boton2 = new JButton("LIMPAR");
    boton.setBackground(Color.YELLOW);
    boton2.setBackground(Color.GREEN);
    etiqueta = new JLabel();
    marco.setSize(600, 600);
    //monitorizamos o botón
    boton.addActionListener(this);
    boton2.addActionListener(this);
    panel.add(boton);
    panel.add(etiqueta);
    panel.add(boton2);
    marco.add(panel);
    
    marco.setVisible(true);
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
}

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obx = e.getSource();
        if(obx == boton) {
            etiqueta.setText("pulsa al botón");
    }
        else 
            etiqueta.setText("   ");
        
        //para saber de que clase e o obxecto obx entonces 
        //if(obx instanceof JButton)
            
            
    }
}
