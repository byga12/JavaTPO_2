
package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {
    
    //el GeneratedValue sirve para generar IDs de forma automática, de forma que al crear una objeto Cliente si ponemos null en donde correspondería un id lo generá automáticamente
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String num_cliente;
    @Basic
    private String nombre_perro;
    private String raza;
    private String color;
    private Boolean es_alergico;
    private Boolean requiere_atencion_especial;
    private String nombre_duenio;
    private String celular_duenio;
    private String observaciones;

    public Cliente() {
    }

    public Cliente(String num_cliente, String nombre_perro, String raza, String color, Boolean es_alergico, Boolean requiere_atencion_especial, String nombre_duenio, String celular_duenio, String observaciones) {
        this.num_cliente = num_cliente;
        this.nombre_perro = nombre_perro;
        this.raza = raza;
        this.color = color;
        this.es_alergico = es_alergico;
        this.requiere_atencion_especial = requiere_atencion_especial;
        this.nombre_duenio = nombre_duenio;
        this.celular_duenio = celular_duenio;
        this.observaciones = observaciones;
    }

    public String getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(String num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getEs_alergico() {
        return es_alergico;
    }

    public void setEs_alergico(Boolean es_alergico) {
        this.es_alergico = es_alergico;
    }

    public Boolean getRequiere_atencion_especial() {
        return requiere_atencion_especial;
    }

    public void setRequiere_atencion_especial(Boolean requiere_atencion_especial) {
        this.requiere_atencion_especial = requiere_atencion_especial;
    }

    public String getNombre_duenio() {
        return nombre_duenio;
    }

    public void setNombre_duenio(String nombre_duenio) {
        this.nombre_duenio = nombre_duenio;
    }

    public String getCelular_duenio() {
        return celular_duenio;
    }

    public void setCelular_duenio(String celular_duenio) {
        this.celular_duenio = celular_duenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
}
