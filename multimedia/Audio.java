/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multimedia;

/**
 *
 * @author Nicolas Salazar
 */
public class Audio extends Contenido_multimedia {
    private String Canal;
    private String duracion;

    public Audio(String Canal, String duracion, String nombre, String tamanio_archivo, String formato_archivo) {
        super(nombre, "Audio", tamanio_archivo, formato_archivo);
        this.Canal = Canal;
        this.duracion = duracion;
    }

    public String getCanal() {
        return Canal;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setCanal(String Canal) {
        this.Canal = Canal;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    
}
