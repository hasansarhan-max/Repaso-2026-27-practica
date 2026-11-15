package base;

public class HasanSarhan {

    public static void main(String[] args) {

        int librosDisponibles = 10;

        mostrarMensaje("Libros iniciales: " + librosDisponibles);

        librosDisponibles = actualizarLibros(librosDisponibles, -4);
        mostrarMensaje("Préstamo realizado.");

        librosDisponibles = actualizarLibros(librosDisponibles, 2);
        mostrarMensaje("Devolución realizada.");

        librosDisponibles = actualizarLibros(librosDisponibles, -15);

        mostrarMensaje("Libros finales: " + librosDisponibles);
    }

    public static int actualizarLibros(int librosActuales, int cantidad) {

        int nuevoTotal = librosActuales + cantidad;

        if (nuevoTotal < 0) {
            System.out.println("ERROR: no puede haber libros negativos.");
        }

        return nuevoTotal;
    }
    
    public static void mostrarMensaje(String mensaje) { 
    	System.out.println(mensaje);
    }
}

