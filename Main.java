import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        GestorTareas gestorTareas = new GestorTareas();

        //Crea las tareas 

        Tarea tarea1 = new TareaImpl("Estudiar Java", "Repasar conceptos basicos de Java", 1, "Pendiente");
        Tarea tarea2 = new TareaImpl("Terminar informe", "Redactar el informe final del proyecto", 2, "En curso");
        Tarea tarea3 = new TareaImpl("Comprar alimentos", "Hacer las compras para la semana", 3, "Pendiente");
        // Nueva tarea
        Tarea tarea4 = new TareaImpl("Descansar", "Realizar actividades recreativas y pasatiempos", 4, "Pendiente");
        
        
        gestorTareas.agregarTarea(tarea1);
        gestorTareas.agregarTarea(tarea2);
        gestorTareas.agregarTarea(tarea3);
        gestorTareas.agregarTarea(tarea4);

        //Imprime las tareas 
        System.out.println("\nLista de tareas:");
        gestorTareas.mostrarTareas();

        // Imprime las tareas que tengan prioridad 2

        System.out.println("\nFiltrar tareas por Prioridad 2:\n");
        List<Tarea> tareasFiltradasPrioridad = gestorTareas.filtrarTareasPorPrioridad(2);
        for (Tarea tarea : tareasFiltradasPrioridad) {
            System.out.println(tarea);}

        // Imprime las tareas que tengan estado Pendiente
            
        System.out.println("\nFiltrar tareas por Estado Pendiente:\n");
        List<Tarea> tareasFiltradasEstado = gestorTareas.filtrarTareasPorEstado("Pendiente");
        for (Tarea tarea : tareasFiltradasEstado) {
            System.out.println(tarea);}
            
        
        //Solicita el numero de la tarea a editar
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIngrese el numero de la tarea que desea editar: ");
      
        int n = teclado.nextInt();
        
        // Edita solo el Estado de la tarea 1
        if (n == 1) {
            tarea1.setEstado("En curso");
            gestorTareas.editarTarea(tarea1);
            System.out.print("\n Aqui se modifico el Estado de la tarea #1");
        }

        // Edita el Nombre y el Estado de la tarea 2
        else if (n == 2){
            tarea2.setNombre("Terminar informe proyecto");
            tarea2.setEstado("Completada");
            gestorTareas.editarTarea(tarea2);
            System.out.print("\n Aqui se modifico el Nombre y el Estado de la tarea #2");
        } 
        
        // Edita solo la Prioridad de la tarea 3
        else if (n == 3){

            tarea3.setPrioridad(1);
            gestorTareas.editarTarea(tarea3);
            System.out.print("\n Aqui se modifico la Prioridad de la tarea #3");
        }  

        // Edita solo el Nombre de la tarea 4
        else if (n == 4){

            tarea4.setNombre("Tiempo de recreacion");
            gestorTareas.editarTarea(tarea4);
            System.out.print("\n Aqui se modifico el Nombre de la tarea #4");
        }  

        // Si no encuentra el numero de tarea envia este mensaje
        else{
            System.out.print("\n La tarea no existe.\n");
        }

        
    
        // Lista de tareas tras la edicion

        System.out.println("\n\n Lista de tareas Editadas:");
        gestorTareas.mostrarTareas();

        //Solicita el numero la tarea a eliminar
        
        System.out.print("\n Numero de tarea que desea eliminar: ");
      
        int e = teclado.nextInt();

        // Elimina la tarea #1

        if (e == 1) {
            System.out.println("\n Eliminando la Tarea #1: "+tarea1.getNombre());
        
            gestorTareas.eliminarTarea(tarea1);
        }

        // Elimina la tarea #2

        else if (e == 2){
            System.out.println("\n Eliminando la Tarea #2: "+tarea2.getNombre());
        
            gestorTareas.eliminarTarea(tarea2);
        }

        // Elimina la tarea #3

        else if (e == 3){
            System.out.println("\n Eliminando la Tarea #3: "+tarea3.getNombre());
        
            gestorTareas.eliminarTarea(tarea3);
        }

        // Elimina la tarea #4

        else if (e == 4){

            System.out.println("\n Eliminando la Tarea #4: "+tarea4.getNombre());
            
            gestorTareas.eliminarTarea(tarea4);
        }

        // Si no encuentra el numero de tarea envia este mensaje

        else{
            System.out.print("\n La tarea no existe. \n");
        }

        // Imprime lista final de tareas
        
        System.out.println("\n Asi ha quedado ahora la lista de tareas:");
        gestorTareas.mostrarTareas();
        
        teclado.close();
    }
}
