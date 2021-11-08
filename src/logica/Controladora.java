package logica;

import persistencia.ControladoraPersistencia;


public class Controladora { // a.k.a la clase del admin
    
    //controla la persistencia
    //controla solicitudes que llegan de la GUI y hace de intermediario entre esta y la persistencia.
    
    
    
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();    
    public void altaCliente(Cliente cliente){
        controlPersistencia.altaCliente(cliente);
    }
    
    
}
