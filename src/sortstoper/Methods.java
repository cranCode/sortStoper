/**
 * author cranCode (Kamil Holerek)
 **/
package sortstoper;
//Imports
import java.util.Random;
import java.util.Arrays;

public class Methods {
    // Global Variables
    int[] unsortedArrayPublic;
    int[] copyOfArray;
    // Filling an array with random Integers 
    public void fillArray(int amountOfIntegers, int maxIntegerValue) {
        Random generator = new Random();
	int[] unsortedArray = new int[amountOfIntegers];
	for(int a=0;a<unsortedArray.length;a++){
		unsortedArray[a]=generator.nextInt(maxIntegerValue);
	}
        unsortedArrayPublic=unsortedArray;
        copyOfArray = new int[amountOfIntegers];
}
    // copyArray 
    public void copyArray() {
    System.arraycopy(unsortedArrayPublic, 0, copyOfArray, 0, unsortedArrayPublic.length);
}
    // selectionSort
    public long selectionSort(int[] array,int maxIntValue) {
        long startStoper=System.currentTimeMillis();
        int tmp;
	int tmploc=0;
        for(int a=0;a<array.length;a++){
			tmp=maxIntValue+1;
			for(int b=a;b<array.length;b++){
				if(tmp>array[b]){
					tmp=array[b];
					tmploc=b;
				}

			}
			array[tmploc]=array[a];
			array[a]=tmp;

		}
        long stopStoper=System.currentTimeMillis();
        return (stopStoper-startStoper); 
	}
    // bubbleSort
    public long bubbleSort(int[] array){
        long startStoper=System.currentTimeMillis();
        int tmp;
		for(int a=0;a<array.length;a++){
			for(int b=0;b<array.length-1;b++){
				if(array[b]>array[b+1]){
					tmp=array[b+1];
					array[b+1]=array[b];
					array[b]=tmp;
				}
			}
		}
        long stopStoper=System.currentTimeMillis();
        return (stopStoper-startStoper);
    }
    // quickSort
    public long quickSort(int[] array) {
        long startStoper=System.currentTimeMillis();  
        Arrays.sort(array);
        long stopStoper=System.currentTimeMillis();
        return (stopStoper-startStoper);
    }
    public void printArray(int[] array) {
        System.out.print("Printing array: ");
        for (int a=0;a<array.length;a++) {
            System.out.print(array[a]+ " ");
        }
    }
    // insertionSort
    public long insertionSort(int[] array){
        long startStoper=System.currentTimeMillis();
        int key, j;
        for (int i=1;i<array.length;i++){
            j=i;
            key=array[i];
            while (j>0 && array[j-1]>key){
                array[j]=array[j-1];
                j--;
            }
            array[j]=key;
        }
        long stopStoper=System.currentTimeMillis();
        return (stopStoper-startStoper);
    }
    // mergeSortStarter
    public long mergeSortStarter(int[] array) {
        long startStoper=System.currentTimeMillis();
        
        MergeSort mergeSortClass = new MergeSort();
        mergeSortClass.sort(array);
        
        long stopStoper=System.currentTimeMillis();
        return (stopStoper-startStoper);
    }
}

    
