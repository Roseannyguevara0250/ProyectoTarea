public class TareaImpl implements Tarea {
    private String nombre;
    private String descripcion;
    private int prioridad;
    private String estado;

    public TareaImpl(String nombre, String descripcion, int prioridad, String estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = estado;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String getEstado() {
        return estado;
    }

    @Override
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        
        return "Tarea{" +
                " nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                ", estado='" + estado + '\'' +
                '}' ;
            
                
    }
}
