package Metodos_Ordenamiento.Quick;

public class MainQuick {

        public static void main(String[] args) {
            int[] datosQuickSort = {6, 1, 5, 8, 3, 2, 7, 4};
            int[] datosShellSort = {6, 1, 5, 8, 3, 2, 7, 4};

            System.out.println("--- QuickSort ---");
            System.out.println("Arreglo original:");
            QuickSort.imprimirArreglo(datosQuickSort);
            QuickSort.ordenar(datosQuickSort, 0, datosQuickSort.length - 1);
            System.out.println("Arreglo ordenado con QuickSort:");
            QuickSort.imprimirArreglo(datosQuickSort);

            System.out.println("\n--- ShellSort ---");
            System.out.println("Arreglo original:");
            ShellSort.imprimirArreglo(datosShellSort);
            ShellSort.ordenar(datosShellSort);
            System.out.println("Arreglo ordenado con ShellSort:");
            ShellSort.imprimirArreglo(datosShellSort);
        }
    }