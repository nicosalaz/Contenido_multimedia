package multimedia;

public class Video extends Contenido_multimedia{
    private String resolucion;
    private String duracion;

    public Video(String nombre, String tamanio_archivo, String formato_archivo,String resolucion, String duracion) {
        super(nombre,"video", tamanio_archivo, formato_archivo);
        this.resolucion = resolucion;
        this.duracion = duracion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getResolucion() {
        return resolucion;
    }

    public String getDuracion() {
        return duracion;
    }

    @Override
    public String getTipo_contenido() {
        return tipo_contenido;
    }

    @Override
    public String getTamanio_archivo() {
        return tamanio_archivo;
    }

    @Override
    public String getFormato_archivo() {
        return formato_archivo;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public void setTipo_contenido(String tipo_contenido) {
        this.tipo_contenido = tipo_contenido;
    }

    @Override
    public void setTamanio_archivo(String tamanio_archivo) {
        this.tamanio_archivo = tamanio_archivo;
    }

    @Override
    public void setFormato_archivo(String formato_archivo) {
        this.formato_archivo = formato_archivo;
    }
    
}
