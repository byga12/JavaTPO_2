package logica;

import gui.InterfazGrafica;


public class Main {


    public static void main(String[] args) {
 
        
        
        Controladora control = new Controladora();
        
        InterfazGrafica gui = new InterfazGrafica(control);
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);

    }
    
}
