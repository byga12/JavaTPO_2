
package persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cliente;


public class ControladoraPersistencia {
    
    ClienteJpaController clienteJPA = new ClienteJpaController();
     
    
    //Create method, en caso de haber algún error, notifico por consola
    public void altaCliente(Cliente cliente) {
        try {
            clienteJPA.create(cliente);
        } catch (Exception e) {
            System.out.println("Ocurrió un error al dar de alta el cliente");
        }
    }
    
    
            
}
