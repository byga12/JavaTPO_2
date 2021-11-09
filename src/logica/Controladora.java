package logica;

import persistencia.ControladoraPersistencia;


public class Controladora { // a.k.a la clase del admin
    
    //controla la persistencia
    //controla solicitudes que llegan de la GUI y hace de intermediario entre esta y la persistencia.
    
    
    
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();    
    
    public void altaCliente(String nombrePerro, String raza, String color, Boolean esAlergico, Boolean requiereAtencionEspecial, String nombreDuenio, String celularDuenio, String observaciones){
        Cliente cliente = new Cliente();
        
        cliente.setNombre_perro(nombrePerro);
        cliente.setRaza(raza);
        cliente.setColor(color);
        cliente.setEs_alergico(esAlergico);
        cliente.setRequiere_atencion_especial(requiereAtencionEspecial);
        cliente.setNombre_duenio(nombreDuenio);
        cliente.setCelular_duenio(celularDuenio);
        cliente.setObservaciones(observaciones);
        
        controlPersistencia.altaCliente(cliente);
    }
    
    public void altaCliente(Cliente cliente){
        controlPersistencia.altaCliente(cliente);
    }
    
    
}
