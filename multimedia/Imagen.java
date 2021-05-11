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
public class Imagen extends Contenido_multimedia {
    private String resolucion;
    private int alto;
    private int ancho;

    public Imagen(String resolucion, String nombre, String tamanio_archivo, String formato_archivo,int alto,int ancho) {
        super(nombre, "Imagen", tamanio_archivo, formato_archivo);
        this.resolucion = resolucion;
        this.alto = alto;
        this.ancho = ancho;
    }

    public String getResolucion() {
        return resolucion;
    }

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    
    
}
