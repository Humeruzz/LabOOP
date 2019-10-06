package Lab1;

import java.lang.Math;

public class Var4 {
    int[] mass;

    public Var4(int tempI) {
        mass = new int[tempI];
        for (int i = 0; i < tempI; i++) {
            this.mass[i] = (int) (Math.random() * 10);
        }
    }

    public String output(){
        String tempS = "Array without sorting: \n";
        for (int i = 0; i < mass.length;i++){
            if (i != mass.length-1) {
                tempS += (mass[i] + " ");
            }else{
                tempS += (mass[i] + ";\n");
            }
        }
        quickSort(mass, 0, mass.length-1);
        tempS += "Array with sorting: \n";
        for (int i = 0; i < mass.length;i++){
            if (i != mass.length-1) {
                tempS += (mass[i] + " ");
            }else{
                tempS += (mass[i] + ";\n");
            }
        }
        return tempS;
    }
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}
