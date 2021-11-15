package logica;

import gui.InterfazGrafica;


public class Main {


    public static void main(String[] args) {
 
        
        //llamo a la controladora de la lógica
        Controladora control = new Controladora();
        
        //muestro la interfaz gráfica, además le pasó el "control".
        InterfazGrafica gui = new InterfazGrafica(control);
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);

    }
    
}
