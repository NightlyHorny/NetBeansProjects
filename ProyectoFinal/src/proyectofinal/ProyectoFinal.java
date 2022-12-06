package proyectofinal;

import java.util.Scanner;
import javax.swing.JOptionPane;

/* @author GM1 - Ian Roberto Tejada Reyes */
public class ProyectoFinal {

    public static String info[] = {"¿Tendré la menstruación durante el resto de mi vida?\n" 
            + "Cuando las mujeres alcanzan la menopausia (en torno a los 45-55 años de edad), dejan de tener "
            + "\nla menstruación. Las mujeres también dejan de tener la menstruación cuando están embarazadas.", "¿Qué cantidad de sangre se pierde en una menstruación?\n" 
            + "Pueda dar la sensación de que se pierde mucha sangre, pero una chica solo suele perder unas pocas "
            + "\ncucharadas de sangre en cada menstruación. La mayoría de las chicas necesitan cambiarse de compresa, "
            + "\ntampón o copa menstrual entre 3 y 6 veces al día.","¿Cuánto duran las menstruaciones?\n" 
            + "Las menstruaciones suelen durar unos 5 días. Pero pueden ser más cortas o más largas.", 
              "La menstruación es la sangre que sale del útero de una niña, chica o mujer, a través de "
            + "\nla vagina. Cuando a una niña le viene la menstruación es una señal de que se está "
            + "\nacercando al final de la pubertad.",
              "¿Qué causa las enfermedades de transmisión sexual?\n" +
              "Las causas de las ETS pueden ser bacterias, virus y parásitos.",
              "Hay más de 20 tipos de ETS, incluyendo:\n" +
             "\n" +
             "Clamidia\n" +
             "Herpes genital\n" +
             "Gonorrea\n" +
             "VIH y sida\n" +
             "VPH\n" +
             "Ladillas\n" +
             "Sífilis\n" +
             "Tricomoniasis",
             "Los síntomas, pueden incluir:\n" +
             "\n" +
             "Secreción inusual del pene o la vagina\n" +
             "Llagas o verrugas en el área genital\n" +
             "Micción frecuente o dolorosa\n" +
             "Picazón y enrojecimiento en el área genital\n" +
             "Ampollas o llagas en o alrededor de la boca\n" +
             "Olor vaginal anormal\n" +
             "Picazón, dolor o sangrado anal\n" +
             "Dolor abdominal\n" +
             "Fiebre"};
    public static String array[] = new String[4];
    public static String datos[] = {"nombre", "email", "telefono", "pais"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String continuar = "si";
        int edadint;

        do {
            try {
                repetir();
                String edad = JOptionPane.showInputDialog("Por favor ingresa tu edad.");
                edadint = Integer.parseInt(edad);
                if (edadint <= 10 || edadint >= 70) {
                    JOptionPane.showMessageDialog(null, "Su edad no es la adecuada para\nusar este programa");
                } else {
                    String[] opcsexo = {"Hombre", "Mujer"};
                    int opcionsexo = JOptionPane.showOptionDialog(null,
                            "Por favor introduce tu sexo.",
                            "Sexo",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            opcsexo,
                            null);

                    String[] opchacer = {"1. Consultar", "2. Doctores disponibles", "3. Agendar cita", "4. Horarios de doctores"};
                    int opcionhacer = JOptionPane.showOptionDialog(null,
                            "Que te gustaria hacer?",
                            "Consulta",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            opchacer,
                            null);
                    switch (opchacer[opcionhacer]) {
                        case "1. Consultar" -> {
                            consultar();
                        }
                        case "2. Doctores disponibles" -> {
                            docdisp();
                        }
                        case "3. Agendar cita" -> {
                            cita();
                        }
                        case "4. Horarios de doctores" -> {
                            horariodoc();
                        }
                    }

                    String[] opciones = {"Si", "No"};
                    int opcion = JOptionPane.showOptionDialog(null,
                            "Te gustaria repetir el programa?",
                            "Hola :D",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            opciones,
                            null);

                    continuar = opciones[opcion];
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Lo sentimos, a ocurrido un error (ArrayIndexOutOfBoundsException)");
            }
            catch(java.lang.NumberFormatException ex){
                System.out.println("Lo sentimos, a ocurrido un error (java.lang.NumberFormatException)");
            }catch(java.lang.NullPointerException ex){
                System.out.println("Lo sentimos, a ocurrido un error (java.lang.NullPointerException)");
            }
        } while (continuar.equalsIgnoreCase("si"));

    }

    public static void repetir() {
        //Repetir
        JOptionPane.showMessageDialog(null, "\t -- Biblioteca Ets -- \n"
                + "\npor favor ingresa los siguientes datos,"
                + "\nninguno de estos datos sera recopilado");

        String nombre = JOptionPane.showInputDialog("Por favor ingresa tu nombre completo.");

    }

    public static void consultar() {
        int acumulador = 0;
        String acumuladorconsulta;
        String qconsulta = JOptionPane.showInputDialog("Por favor ingresa una palabra clave.");
        for (int x = 0; x < info.length; x++) {
            if (info[x].contains(qconsulta) == true) {
                JOptionPane.showMessageDialog(null, info[x]);
            } else {
                acumulador += 1;
            }
        }
        if (acumulador >= info.length) {
            JOptionPane.showMessageDialog(null, "No hay informacion relacionada");
        }

    }

    public static void cita() {
        String datosacumulador = "";
        for (int x = 0; x <= 3; x++) {
            array[x] = JOptionPane.showInputDialog("Por favor ingresa tu " + datos[x]);
            datosacumulador += datos[x] + ": " + array[x] + "\n";
        }
        JOptionPane.showMessageDialog(null, "Cita", datosacumulador, 1);
        JOptionPane.showMessageDialog(null, "Cita", "Se agendo correctamente la cita\nnos pondremos en contacto con usted\npara definir un horario.", 0);

    }

    public static void horariodoc() {
        String[][] doc = new String[7][3];
        String acudoc = "";
        doc[0][0] = "Dra. Angelica Cabrera ";
        doc[0][1] = "5am - 1pm";
        doc[0][2] = "Disponible";

        doc[1][0] = "Dra. Abigail Holguín";
        doc[1][1] = "5am - 1pm";
        doc[1][2] = "Disponible";

        doc[2][0] = "Dra. Melany Cabrera";
        doc[2][1] = "8am - 4pm";
        doc[2][2] = "No disponible";

        doc[3][0] = "Dr. Ricardo Henández";
        doc[3][1] = "8am - 4pm";
        doc[3][2] = "Disponible";

        doc[4][0] = "Dra. Karen Cervantes";
        doc[4][1] = "12pm - 8pm";
        doc[4][2] = "Disponible";

        doc[5][0] = "Dra. Alondra Alamillo";
        doc[5][1] = "4pm - 12am";
        doc[5][2] = "No disponible";

        doc[6][0] = "Dr. Pedro Hernández";
        doc[6][1] = "12am - 8am";
        doc[6][2] = "Disponible";

        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 2; y++) {
                acudoc += doc[x][y] + "\n";
            }
            acudoc += "\n";
        }
        JOptionPane.showMessageDialog(null, acudoc, "Horarios de doctores", 1);
    }

    public static void docdisp() {
        String[][] doc = new String[7][3];
        String acudoc = "";
        doc[0][0] = "Dra. Angelica Cabrera ";
        doc[0][1] = "5am - 1pm";
        doc[0][2] = "Disponible";

        doc[1][0] = "Dra. Abigail Holguín";
        doc[1][1] = "5am - 1pm";
        doc[1][2] = "Disponible";

        doc[2][0] = "Dra. Melany Cabrera";
        doc[2][1] = "8am - 4pm";
        doc[2][2] = "No disponible";

        doc[3][0] = "Dr. Ricardo Henández";
        doc[3][1] = "8am - 4pm";
        doc[3][2] = "Disponible";

        doc[4][0] = "Dra. Karen Cervantes";
        doc[4][1] = "12pm - 8pm";
        doc[4][2] = "Disponible";

        doc[5][0] = "Dra. Alondra Alamillo";
        doc[5][1] = "4pm - 12am";
        doc[5][2] = "No disponible";

        doc[6][0] = "Dr. Pedro Hernández";
        doc[6][1] = "12am - 8am";
        doc[6][2] = "Disponible";

        for (int x = 0; x < 6; x++) {
            if (doc[x][2].equalsIgnoreCase("Disponible")) {
                for (int y = 0; y < 2; y++) {
                    acudoc += doc[x][y] + "\n";
                }
                acudoc += "\n";

            }

        }
        JOptionPane.showMessageDialog(null, acudoc, "Doctores dispobibles", 1);
    }
}
