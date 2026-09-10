import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MisAlgoritmos algoritmos = new MisAlgoritmos();

        // Arreglo de datos para pruebas
        int[] datosIniciales = {85, 24, 63, 10, 47, 19, 92, 5};

        System.out.println("=== PRUEBAS DE ALGORITMOS DE BÚSQUEDA Y ORDENAMIENTO ===");
        System.out.println("Arreglo inicial: " + Arrays.toString(datosIniciales));
        System.out.println("-------------------------------------------------------");

        // BÚSQUEDA LINEAL
        int elemento = 47;
        int posLineal = algoritmos.linearSearch(datosIniciales, elemento);
        System.out.println("[Búsqueda Lineal] Elemento " + elemento + " hallado en la posición: " + posLineal);

        // ALGORITMOS DE ORDENAMIENTO
        System.out.println("\n--- Pruebas de Ordenamiento ---");

        int[] datosBubble = algoritmos.bubbleSort(datosIniciales.clone());
        System.out.println("Bubble Sort:    " + Arrays.toString(datosBubble));

        int[] datosSelection = algoritmos.selectionSort(datosIniciales.clone());
        System.out.println("Selection Sort: " + Arrays.toString(datosSelection));

        int[] datosInsertion = algoritmos.insertionSort(datosIniciales.clone());
        System.out.println("Insertion Sort: " + Arrays.toString(datosInsertion));

        int[] datosMerge = algoritmos.mergeSort(datosIniciales.clone());
        System.out.println("Merge Sort:     " + Arrays.toString(datosMerge));

        int[] datosQuick = algoritmos.quickSort(datosIniciales.clone());
        System.out.println("Quick Sort:     " + Arrays.toString(datosQuick));

        // BÚSQUEDA BINARIA
        System.out.println("\n--- Búsqueda Binaria (Arreglo Ordenado) ---");
        int[] datosOrdenados = {5, 10, 19, 24, 47, 63, 85, 92};
        int posBinario = algoritmos.binarySearch(datosOrdenados, 63);
        System.out.println("[Búsqueda Binaria] Elemento 63 hallado en la posición: " + posBinario);
    }
}