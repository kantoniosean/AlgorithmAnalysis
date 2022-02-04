package AlgoritmAnalysis;

public class SortingAlgorithms {
    
    public static void BubbleSort(int[] array)
    {
        for(int i = 0; i < array.length-1; i++) 
            for(int j = 0; j < array.length-i-1; j++) 
            
                if(array[j] > array[j+1]) 
                    {
                        int temp = array[j];
                        array[j] = array[j+1]; 
                        array[j+1] = temp; 
                    }
    }
    
    public static void BubbleSortSC(int[] array)
    {
        for(int i = 0; i < array.length-1; i++) 
        {
            boolean swap = false; 
            for(int j = 0; j < array.length-i-1; j++) 
            { 
                if(array[j] > array[j+1]) 
            {
                int temp = array[j];
                array[j] = array[j+1]; 
                array[j+1] = temp; 
                swap = true;
            }
        }
            if(!swap)
            break;
        }
    }
    
    public static void SelectionSort(int[] array)
    {
     for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index]) 
                    index = j;
            
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }   
    }
    
    public static void InsertionSort(int[] array)
    {
        int i, key, j; 
        for (i = 1; i < array.length; i++) 
        { 
            key = array[i]; 
            j = i - 1; 
            
            while (j >= 0 && array[j] > key) 
            { 
                array[j + 1] = array[j]; 
                j = j - 1; 
            } 
            array[j + 1] = key; 
        } 
    }
    
    public static void MergeSort(int[] array) 
    {
        if (array.length < 2) 
        return;
        int mid = array.length / 2;
        int[] l = new int[mid];
        int[] r = new int[array.length - mid];
        for (int i = 0; i < mid; i++) 
        l[i] = array[i];
        for (int i = mid; i < array.length; i++) 
        r[i - mid] = array[i];
        MergeSort(l);
        MergeSort(r);
        merge(array, l, r, mid, array.length - mid);
    }

    public static void merge(int[] array, int[] l, int[] r, int left, int right)
    {        
        
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
                if (l[i] <= r[j]) {
                    array[k] = l[i];
                    i++;
    }
    else {
        array[k] = r[j];
        j++;
    }
    k++;
        }
        while (i < left) 
            array[k++] = l[i++];
        while (j < right) 
            array[k++] = r[j++];
   }
    
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
  

    static int partition(int[] arr, int small, int big)
    {
      
    
    int piv = arr[big]; 
      
    int i = (small - 1); 
  
    for(int j = small; j <= big - 1; j++)
    {
          
        if (arr[j] < piv) 
        {
            i++; 
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, big);
    return (i + 1);
    }
    
    public static void QuickSort(int arr[], int small, int big)
    {
        if (small < big) 
        {
            int pi = partition(arr, small, big);
  
      
            QuickSort(arr, small, pi - 1);
            QuickSort(arr, pi + 1, big);
        }
    }
    
    public static int[] GnomeSort(int arr[])
    {
        int i = 1;
 
        while (i < arr.length) {
            if (arr[i] >= arr[i - 1])
                i++;
            else {
                swap(arr, i, i - 1);
                if(i > 1)
                    i--;
            }
        }
        return arr;
    }
}
