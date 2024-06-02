import java.util.List;
import java.util.ArrayList;

public class GestorTareas {
    public List<Tarea> tareas;

    public GestorTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void editarTarea(Tarea tarea) {
        int index = tareas.indexOf(tarea);
        if (index != -1) {
            tareas.set(index, tarea);
        } else {
            System.out.println("La tarea no existe.");
        }
    }

    public void eliminarTarea(Tarea tarea) {
        tareas.remove(tarea);
    }

    public List<Tarea> filtrarTareasPorPrioridad(int prioridad) {
        List<Tarea> tareasFiltradas = new ArrayList<>();
        for (Tarea tarea : tareas) {
            if (tarea.getPrioridad() == prioridad) {
                tareasFiltradas.add(tarea);
            }
        }
        return tareasFiltradas;
    }

    public List<Tarea> filtrarTareasPorEstado(String estado) {
        List<Tarea> tareasFiltradas = new ArrayList<>();
        for (Tarea tarea : tareas) {
            if (tarea.getEstado().equals(estado)) {
                tareasFiltradas.add(tarea);
            }
        }
        return tareasFiltradas;
    }

    public void mostrarTareas() {
        // Variable que imprime el numero de la tarea
        int i=1;
        for (Tarea tarea : tareas) {

            System.out.println("\nTAREA #"+i+ " :");
            System.out.println(tarea);
            // Incrementa de uno en uno el numero de la tarea a medida que se ejecuta el bucle
            i=i+1;
        }
    }
}
