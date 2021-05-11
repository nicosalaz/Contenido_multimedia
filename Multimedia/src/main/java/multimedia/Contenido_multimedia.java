package multimedia;

public class Contenido_multimedia {
    protected String nombre;
    protected String tipo_contenido;
    protected String tamanio_archivo;
    protected String formato_archivo;

    public Contenido_multimedia(String nombre,String tipo_contenido, String tamanio_archivo, String formato_archivo) {
        this.nombre = nombre;
        this.tipo_contenido = tipo_contenido;
        this.tamanio_archivo = tamanio_archivo;
        this.formato_archivo = formato_archivo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo_contenido() {
        return tipo_contenido;
    }

    public String getTamanio_archivo() {
        return tamanio_archivo;
    }

    public String getFormato_archivo() {
        return formato_archivo;
    }

    public void setTipo_contenido(String tipo_contenido) {
        this.tipo_contenido = tipo_contenido;
    }

    public void setTamanio_archivo(String tamanio_archivo) {
        this.tamanio_archivo = tamanio_archivo;
    }

    public void setFormato_archivo(String formato_archivo) {
        this.formato_archivo = formato_archivo;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + ", tipo_contenido = " + tipo_contenido + ", tamanio_archivo = " + tamanio_archivo + ", formato_archivo = " + formato_archivo + '}';
    }
    
    
}
