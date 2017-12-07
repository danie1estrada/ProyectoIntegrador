package layout;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vista {

    private JFrame display;   //Objeto de la clase JFrame 
    private JLabel fondo;   //Objeto de la clase JLabel 
    private JButton ave, perro, gato, registro;    // Objeto de la clase JButton 
    private JPanel panel;   //contorno de la ventana 

    void correr() {
        instanciar();
        armar();
        desplegar();
    }

    private void instanciar() {
        //instanciar a un constructor es decir invocar un objeto
        display = new JFrame();
        fondo = new JLabel();
        perro = new JButton();
        ave = new JButton();
        gato = new JButton();
        registro = new JButton();
        panel = new JPanel();
    }

    private void armar() {
        display.setSize(1300, 710);
        display.setIconImage(new ImageIcon("src\\layout\\sources\\huella.jpg").getImage());// cambio del icono de la taza
        display.setTitle("venta de mascotas");
        display.setLocationRelativeTo(null); // posicion relativa en la ventana

        fondo = new JLabel(new ImageIcon("src\\layout\\sources\\fondo.png"));
        panel.add(fondo);
        fondo.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 200));

        Mensaje m = new Mensaje();
        perro.setIcon(new ImageIcon("src\\layout\\sources\\perro.jpg"));
        perro.addMouseListener(m);

        gato.setIcon(new ImageIcon("src\\layout\\sources\\gato.jpg"));
        gato.addMouseListener(m);

        ave.setIcon(new ImageIcon("src\\layout\\sources\\ave.png"));
        ave.addMouseListener(m);

        registro.setIcon(new ImageIcon("src\\layout\\sources\\reg.jpg"));
        registro.addMouseListener(m);
        
        fondo.add(perro);
        fondo.add(ave);
        fondo.add(gato);
        fondo.add(registro);
     
    }

    private void desplegar() {
        display.getContentPane().add(panel);
        display.setVisible(true); // metodo 
        display.setResizable(false);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class Mensaje extends MouseAdapter {

        // clase interna de la clase vista      
        String mensaje;

        @Override
        public void mouseEntered(MouseEvent me) {
            if (me.getSource() == perro) {
                mensaje = "<html>"
                        + "Venta de cachorritos "
                        + "<br>"
                        + "Alimento para todas las edades"
                        + "<br>"
                        + "Juguetes especiales"
                        + "<br>"
                        + "Ropa y accesorios para "
                        + "</html>";
                perro.setToolTipText(mensaje);
            }
            if (me.getSource() == gato) {
                mensaje = "<html>"
                        + "Venta de gatitos"
                        + "<br>"
                        + "Alimento para todas las etapas"
                        + "<br>"
                        + "Juguetes y accesorios"
                        + "</html>";
                gato.setToolTipText(mensaje);
            }
            if (me.getSource() == ave) {
                mensaje = "<html>"
                        + "Conoce nuestras aves en venta"
                        + "<br>"
                        + "Alimentos para aves en especifíco"
                        + "<br>"
                        + "Juguetes y accesorios"
                        + "</html>";
                ave.setToolTipText(mensaje);
            }
            if(me.getSource()== registro){
                mensaje = "<html>"
                                 + "registra una nueva mascota,"
                                 +   "  o producto para su venta"
                                 + "<html>";
                registro.setToolTipText(mensaje);
            }
        }
    }
}
