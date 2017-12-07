
package layout;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class alimAve {
    private JFrame display;   //Objeto de la clase JFrame 
    private JLabel fondo;   //Objeto de la clase JLabel 
    private JButton a, b, c, d, e;    // Objeto de la clase JButton 
    private JPanel panel;   //contorno de la ventana 

    void correr() {
        instanciar();
        armar();
        desplegar();
    }
    
    private void instanciar (){
        display = new JFrame();
        fondo = new JLabel();
        a = new JButton();
        b = new JButton();
        c = new JButton();
        d = new JButton();
        e = new JButton();
        panel = new JPanel();
        
    }
    private void armar(){
        display.setSize(1300, 710);
        display.setIconImage(new ImageIcon("src\\layout\\sources\\huella.jpg").getImage());// cambio del icono de la taza
        display.setTitle("venta de mascotas");
        display.setLocationRelativeTo(null); // posicion relativa en la ventana

        fondo = new JLabel(new ImageIcon("src\\layout\\sources\\paj.jpg"));
        panel.add(fondo);
        fondo.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 300));
        
      
        a.setIcon(new ImageIcon("src\\layout\\sources\\11.jpg"));
        

        b.setIcon(new ImageIcon("src\\layout\\sources\\12.jpg"));

        
        c.setIcon(new ImageIcon("src\\layout\\sources\\13.jpg"));
       

       d.setIcon(new ImageIcon("src\\layout\\sources\\14.jpg"));
     
      
        e.setIcon(new ImageIcon("src\\layout\\sources\\15.jpg"));
   
        
        fondo.add(a);
        fondo.add(b);
        fondo.add(c);
        fondo.add(d);
        fondo.add(e);
       
    }
    private void desplegar(){
        display.getContentPane().add(panel);
        display.setVisible(true); // metodo 
        display.setResizable(false);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }   
}
