package AlgoritmAnalysis;

import java.util.*;

public class AlgorithmAnalysis {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Enter array size: ");
       int arr  = scan.nextInt();
       int[] array = new int[arr]; 
       populateArray(array); 
       scan.close();
       
        long start = System.currentTimeMillis(); 
        SortingAlgorithms.BubbleSort(array.clone());
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Bubble Sort: " + elapsed + " (ms.)");
        
        start = System.currentTimeMillis(); 
        SortingAlgorithms.BubbleSortSC(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.println("Bubble Sort (SC): " + elapsed + " (ms.)");
        
        start = System.currentTimeMillis(); 
        SortingAlgorithms.GnomeSort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.println("Gnome Sort: " + elapsed + " (ms.)");
        
        start = System.currentTimeMillis(); 
        SortingAlgorithms.SelectionSort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.println("Selection Sort: " + elapsed + " (ms.)");
        
        start = System.currentTimeMillis(); 
        SortingAlgorithms.InsertionSort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.println("Insertion Sort: " + elapsed + " (ms.)");
        
        start = System.currentTimeMillis(); 
        SortingAlgorithms.MergeSort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.println("Merge Sort: " + elapsed + " (ms.)");
        
        start = System.currentTimeMillis(); 
        Arrays.sort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.println("Java Sort: " + elapsed + " (ms.)");
        
        start = System.currentTimeMillis(); 
        SortingAlgorithms.QuickSort(array.clone(), 0, array.length - 1);
        elapsed = System.currentTimeMillis() - start;
        System.out.println("Quick Sort: " + elapsed + " (ms.)");

    }
    
    public static void populateArray(int[] a)
    {
        Random rand = new Random();
        for(int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(1001);
        
    }
    
} 
    

