package layout;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Registro {

    private JFrame display;   //Objeto de la clase JFrame 
    private JLabel fondo;   //Objeto de la clase JLabel 
    private JButton codigo, precio, descripcion;    // Objeto de la clase JButton 
    private JPanel panel;   //contorno de la ventana 

    void correr() {
        instanciar();
        armar();
        desplegar();
    }

    private void instanciar() {
        display = new JFrame();
        fondo = new JLabel();
        codigo = new JButton();
        precio = new JButton();
        descripcion = new JButton();
        panel = new JPanel();
    }

    private void armar() {
        display.setSize(895, 540);
        display.setIconImage(new ImageIcon("src\\layout\\sources\\huella.jpg").getImage());// cambio del icono de la taza
        display.setTitle("venta de mascotas");
        display.setLocationRelativeTo(null); // posicion relativa en la ventana

        fondo = new JLabel(new ImageIcon("src\\layout\\sources\\fondoRegistro.jpg"));
        panel.add(fondo);
        fondo.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 300));

        mensaje a = new mensaje();
         descripcion.setIcon(new ImageIcon("src\\layout\\sources\\Descripcion.jpg"));
        descripcion.addMouseListener(a);
        
        codigo.setIcon(new ImageIcon("src\\layout\\sources\\codigo.jpg"));
        codigo.addMouseListener(a);

        precio.setIcon(new ImageIcon("src\\layout\\sources\\precio.jpg"));
        precio.addMouseListener(a);

        fondo.add(codigo);
        fondo.add(descripcion);
        fondo.add(precio);

    }

    private void desplegar() {
        display.getContentPane().add(panel);
        display.setVisible(true); // metodo 
        display.setResizable(false);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class mensaje extends MouseAdapter {

        String mensaje;

        @Override
        public void mouseEntered(MouseEvent me) {
            if (me.getSource() == codigo) {
                mensaje = "<html>"
                        + "Ingresa el código ";
                codigo.setToolTipText(mensaje);
            }
            if (me.getSource() == descripcion) {
                mensaje = "<html> "
                        + "Escribe la descripcion del producto";
                descripcion.setToolTipText(mensaje);
            }
            if (me.getSource() == precio) {
                mensaje = "<html>"
                        + "precio del producto en registro";
                precio.setToolTipText(mensaje);
            }

        }
    }
}
