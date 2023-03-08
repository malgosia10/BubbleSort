import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Podaj liczby całkowite (rozdzielone spacją). Aby zakończyć wprowadzanie wpisz cyfrę 0 i naciśnij enter.");

        int value;
        do {
            value = scan.nextInt();
            if (value != 0) {
                array.add(value);
            }
        } while (value != 0);

        algorithm(array);

        System.out.println("Posortowany ciąg: " + array);
    }
    
    public static void algorithm(ArrayList<Integer>array) {
        int arraySize = array.size();
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize - 1 - i; j++) {
                if (array.get(j) > array.get(j + 1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }
    }
}
