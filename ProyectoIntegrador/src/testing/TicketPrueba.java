
package testing;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


 /**
 *
 * @author JuanCollantes666
 */

 
public class TicketPrueba {

    static ArrayList<String> CabezaLineas = new ArrayList<String>();
    static ArrayList<String> subCabezaLineas = new ArrayList<String>();
    static ArrayList<String> items = new ArrayList<String>();
    static ArrayList<String> totales = new ArrayList<String>();
    static ArrayList<String> LineasPie = new ArrayList<String>();

    public static void AddCabecera(String line) {
        CabezaLineas.add(line);
    }

    public static void AddSubCabecera(String line) {
        subCabezaLineas.add(line);
    }

    public static void AddItem(String cantidad, String item, String precio) {
        OrderItem newItem = new OrderItem(' ');
        items.add(newItem.GeneraItem(cantidad, item, precio));
    }

    public static void AddTotal(String name, String precio) {
        OrderTotal newTotal = new OrderTotal(' ');
        totales.add(newTotal.GeneraTotal(name, precio));
    }

    public static void AddPieLinea(String linea) {
        LineasPie.add(linea);
    }

    public static String DibujarLinea(int valor) {
        String raya = "";
        for (int x = 0; x < valor; x++) {
            raya += "=";
        }
        return raya;
    }

    public static String DarEspacio() {
        return "\n";
    }

    public static void ImprimirDocumento(String impresora, boolean abrir) {

         try {
            //FileWriter imp = new FileWriter("LPT1");
            FileWriter imp = new FileWriter(impresora);
            char[] Caracter = new char[]{0x1B, 'R', 18};
            imp.write(Caracter);
            for (int cabecera = 0; cabecera < CabezaLineas.size(); cabecera++) {
                imp.write(CabezaLineas.get(cabecera));
            }
            for (int subcabecera = 0; subcabecera < subCabezaLineas.size(); subcabecera++) {
                imp.write(subCabezaLineas.get(subcabecera));
            }
            for (int ITEM = 0; ITEM < items.size(); ITEM++) {
                imp.write(items.get(ITEM));
            }
            for (int total = 0; total < totales.size(); total++) {
                imp.write(totales.get(total));
            }
            for (int pie = 0; pie < LineasPie.size(); pie++) {
                imp.write(LineasPie.get(pie));
            }
            for (int u = 0; u <= 10; u++) {
                imp.write("\n");
            }
            //corta el papel
            char[] CORTAR_PAPEL = new char[]{0x1B, 'm'};
            imp.write(CORTAR_PAPEL);
            if (abrir) {
                char ABRIR_GAVETA[] = {(char) 27, (char) 112, (char) 0, (char) 10, (char) 100};
                imp.write(ABRIR_GAVETA);
            }
            imp.close();
            //limpio las listas que contiene los datos
            CabezaLineas.removeAll(CabezaLineas);
            subCabezaLineas.removeAll(subCabezaLineas);
            items.removeAll(items);
            totales.removeAll(totales);
            LineasPie.removeAll(LineasPie);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Imprimir:\n" + e.getMessage());
            CabezaLineas.removeAll(CabezaLineas);
            subCabezaLineas.removeAll(subCabezaLineas);
            items.removeAll(items);
            totales.removeAll(totales);
            LineasPie.removeAll(LineasPie);
        }
    }

    /*---------------------------------------------------------------------------------*/
    public static class OrderItem {

        char[] temp = new char[]{' '};

        public OrderItem(char delimit) {
            temp = new char[]{delimit};
        }

        public String GetItemCantidad(String orderItem) {
            String[] delimitado = orderItem.split("" + temp);
            return delimitado[0];
        }

        public String GetItemNombre(String orderItem) {
            String[] delimitado = orderItem.split("" + temp);
            return delimitado[1];
        }

        public String GetItemPrecio(String orderItem) {
            String[] delimitado = orderItem.split("" + temp);
            return delimitado[2];
        }

        public String GeneraItem(String cantidad, String nombre, String precio) {
            return cantidad + temp[0] + nombre + temp[0] + precio;
        }
    }

    /*--------------------------------------------------------------------------------*/

    public static class OrderTotal {

        char[] temp = new char[]{' '};

        public OrderTotal(char delimit) {
            temp = new char[]{delimit};
        }

        public String GetTotalNombre(String totalItem) {
            String[] delimitado = totalItem.split("" + temp);
            return delimitado[0];
        }

        public String GetTotalCantidad(String totalItem) {
            String[] delimitado = totalItem.split("" + temp);
            return delimitado[1];
        }

        public String GeneraTotal(String Nombre, String precio) {
            return Nombre + temp[0] + precio;
        }
    }

    /*---------------------------------------------------------------------------------*/
    

        public static void main(String[] args) {
            
            Date date = new Date();
            
            SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat hora = new SimpleDateFormat("hh:mm:ss aa");
            
           Ticket1 ticketPrueba = new TicketPrueba();
            
            ticket.AddCabecera("RESTAURANTE XXXX");
            ticket.AddCabecera(ticket.DarEspacio());
            ticket.AddCabecera("EXPEDIDO EN: ----------");
            ticket.AddCabecera(ticket.DarEspacio());
            
            ticket.AddCabecera("AV. TAMAULIPAS NO. 5 LOC. 101");
            ticket.AddCabecera(ticket.DarEspacio());
            ticket.AddCabecera(ticket.DibujarLinea(29));
            ticket.AddCabecera(ticket.DarEspacio());
            ticket.AddCabecera("LIMA, XXXXXXXXXXXX");
            ticket.AddCabecera(ticket.DarEspacio());
            
            ticket.AddCabecera("RFC: CSI-020226-MV4");
            ticket.AddCabecera(ticket.DarEspacio());
            
            ticket.AddSubCabecera(ticket.DarEspacio());
            ticket.AddSubCabecera("Caja # 1 - Ticket # 1");
            ticket.AddSubCabecera(ticket.DarEspacio());
            
            ticket.AddSubCabecera("LE ATENDIO: JUAN");
            ticket.AddSubCabecera(ticket.DarEspacio());
            
            ticket.AddSubCabecera("" + fecha.format(date) + " " + hora.format(date));
            ticket.AddSubCabecera(ticket.DarEspacio());
            ticket.AddSubCabecera(ticket.DibujarLinea(29));
            ticket.AddSubCabecera(ticket.DarEspacio());
            
            ticket.AddItem("1", "Articulo Prueba", "15.00");
            ticket.AddItem("", "", ticket.DarEspacio());
            
            ticket.AddItem("2", "Articulo Prueba", "25.00");
            ticket.AddItem("", "", ticket.DarEspacio());
            
            ticket.AddTotal("", ticket.DibujarLinea(29));
            ticket.AddTotal("", ticket.DarEspacio());
            
            ticket.AddTotal("SUBTOTAL", "29.75");
            ticket.AddTotal("", ticket.DarEspacio());
            
            ticket.AddTotal("IVA", "5.25");
            ticket.AddTotal("", ticket.DarEspacio());
            
            ticket.AddTotal("TOTAL", "35.00");
            ticket.AddTotal("", ticket.DarEspacio());
            
            ticket.AddTotal("", ticket.DarEspacio());
            ticket.AddTotal("RECIBIDO", "50.00");
            ticket.AddTotal("", ticket.DarEspacio());
            
            ticket.AddTotal("CAMBIO", "15.00");
            ticket.AddTotal("", ticket.DarEspacio());
            
            ticket.AddTotal("", ticket.DarEspacio());
            ticket.AddPieLinea(ticket.DibujarLinea(29));
            ticket.AddPieLinea(ticket.DarEspacio());
            
            ticket.AddPieLinea("EL xxx ES NUESTRA PASION...");
            ticket.AddPieLinea(ticket.DarEspacio());
            
            ticket.AddPieLinea("VIVE LA EXPERIENCIA EN xxx");
            ticket.AddPieLinea(ticket.DarEspacio());
            
            ticket.AddPieLinea("Gracias por su visita");
            ticket.AddPieLinea(ticket.DarEspacio());
            
            ticket.ImprimirDocumento("Ticket", true);

        }//main


}//Class TicketPrueba
