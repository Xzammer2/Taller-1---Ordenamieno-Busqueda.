public class MetodosBusqueda implements Busquedas {

    // BÚSQUEDA LINEAL: Revisa el arreglo elemento por elemento de izquierda a derecha
    @Override
    public int linearSearch(int[] arrayPorExplorar, int elementoABuscar) {
        for (int i = 0; i < arrayPorExplorar.length; i++) {
            if (arrayPorExplorar[i] == elementoABuscar) {
                return i; // Retorna la posición (índice) donde lo encontró
            }
        }
        return -1; // Retorna -1 si el elemento no existe en el arreglo
    }

    // BÚSQUEDA BINARIA: Requiere que el arreglo esté ORDENADO. Divide el arreglo a la mitad en cada paso
    @Override
    public int binarySearch(int[] arrayPorExplorar, int elementoABuscar) {
        int inicio = 0;
        int fin = arrayPorExplorar.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arrayPorExplorar[medio] == elementoABuscar) {
                return medio; // Elemento encontrado
            }

            if (arrayPorExplorar[medio] < elementoABuscar) {
                inicio = medio + 1; // Buscar en la mitad derecha
            } else {
                fin = medio - 1; // Buscar en la mitad izquierda
            }
        }
        return -1; // Retorna -1 si no lo encuentra
    }
}