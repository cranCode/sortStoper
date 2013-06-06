/**
 * author cranCode (Kamil Holerek)
 **/
package sortstoper;
//Imports
import java.util.Scanner;


public class SortStoper {
    public static void main(String[] args) {
        Scanner readConsole = new Scanner(System.in);
        System.out.print("Porownywarka Sortowan,\nWprowadz maksymalna wartosc liczby: ");
        int maxIntegerValue = readConsole.nextInt();
        System.out.print("Wprowadź ilosc liczb w tablicy: ");
        int maxIntegerAmount = readConsole.nextInt();
        Methods func = new Methods();
        func.fillArray(maxIntegerAmount, maxIntegerValue);
 
        func.copyArray();
        System.out.println("Czas szybkiego sortowania: "+(float)(func.quickSort(func.copyOfArray))/1000+" sek");
        
        func.copyArray();
        System.out.println("Czas sortowania przez scalanie: "+(float)(func.mergeSortStarter(func.copyOfArray))/1000+" sek"); 
        
        func.copyArray();
        System.out.println("Czas sortowania przez wstawianie: "+(float)(func.insertionSort(func.copyOfArray))/1000+" sek");
        
        func.copyArray();
        System.out.println("Czas sortowania przez wybor: "+(float)(func.selectionSort(func.copyOfArray, maxIntegerValue))/1000+" sek");
        
        func.copyArray();
        System.out.println("Czas sortowania babelkowego: "+(float)(func.bubbleSort(func.copyOfArray))/1000+" sek");  
    }
}
