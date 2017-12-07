
package layout;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VistaAve {
    private JFrame display;   //Objeto de la clase JFrame 
    private JLabel fondo;   //Objeto de la clase JLabel 
    private JButton alimento, accesorio;    // Objeto de la clase JButton 
    private JPanel panel;   //contorno de la ventana 

    void correr() {
        instanciar();
        armar();
        desplegar();
    }
    
    private void instanciar (){
        display = new JFrame();
        fondo = new JLabel();
        alimento = new JButton();
        accesorio = new JButton();
        panel = new JPanel();
        
    }
    private void armar(){
        display.setSize(1300, 710);
        display.setIconImage(new ImageIcon("src\\layout\\sources\\huella.jpg").getImage());// cambio del icono de la taza
        display.setTitle("venta de mascotas");
        display.setLocationRelativeTo(null); // posicion relativa en la ventana

        fondo = new JLabel(new ImageIcon("src\\layout\\sources\\fondo.png"));
        panel.add(fondo);
        fondo.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 300));
        
         mensaje m = new mensaje();
        alimento.setIcon(new ImageIcon("src\\layout\\sources\\alimentoAve.jpg"));
        alimento.addMouseListener(m);

        accesorio.setIcon(new ImageIcon("src\\layout\\sources\\accesorioAve.jpg"));
        accesorio.addMouseListener(m);

      
        fondo.add(alimento);
        fondo.add(accesorio);
       
    }
    private void desplegar(){
        display.getContentPane().add(panel);
        display.setVisible(true); // metodo 
        display.setResizable(false);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
 
    private class mensaje extends MouseAdapter{
        String mensaje;
        
        @Override
        public void mouseEntered(MouseEvent me){
            if(me.getSource()== alimento){
                mensaje = "alimento variado para aves";
                alimento.setToolTipText(mensaje);
            }
            if(me.getSource()==accesorio){
                mensaje = "variedad de juguetes y acesorios de aves";
                accesorio.setToolTipText(mensaje);
            }
        }
    }

    
}
