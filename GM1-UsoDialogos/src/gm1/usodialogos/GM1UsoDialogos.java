package gm1.usodialogos;
import javax.swing.JOptionPane;
/*
 * @author GM1-Ian Roberto Tejada Reyes
 */
public class GM1UsoDialogos {
    public static void main(String[] args) {
        /* Dialoogo de mensaje */
        //JOptionPane.showMessageDialog(null, "Aqui colocamos lo que queremos que aparezca");
        
        // Dialogo Input
        /*String variable = JOptionPane.showInputDialog("Ingresa un valor:");
        JOptionPane.showMessageDialog(null, "El valor ingresado es: "+variable);*/
        
        /*int var = JOptionPane.showConfirmDialog(null, "Requiere factura?");
        if (var == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Seleccionaste si");
        }else if(var == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Seleccionaste no");
        }*/
        
        String[] opciones= {"Pesos", "Dolares", "BitCoin"};
        int opcion = JOptionPane.showOptionDialog(null
                , "Forma de pago:"
                , "Opcion Personalizada"
                , JOptionPane.DEFAULT_OPTION
                , JOptionPane.INFORMATION_MESSAGE
                , null
                , opciones
                , null);
        JOptionPane.showMessageDialog(null, "Has escogido "+opciones[opcion]);
    }
    
}
