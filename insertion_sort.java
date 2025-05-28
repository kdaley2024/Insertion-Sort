// Java program for implementation of Insertion Sort
public class insertion_sort {
    /*Function to sort array using insertion sort*/
    void sort(int arr[]) {
        // TO DO
        int key,i,x;
        x = 1;
        System.out.print(x + ": ");
        printArray(arr,1);
        x++;
        for (int j = 1; j < arr.length; j++) {
            key = arr[j];
            //Insert arr[j] into the sorted sequence arr[1..j-1]
            i = j-1;
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
            System.out.print(x + ": ");
            printArray(arr, j+1);
            x++;

        }
            
        
    }
 
    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        System.out.print("\nFinal result: [");
        for (int i = 0; i < n-1; ++i) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[n-1]);
        System.out.print("]");
        System.out.println();
    }

    static void printArray(int arr[], int key)
    {
            int n = arr.length;
            System.out.print("[");
            for (int i = 0; i < n-1; ++i) {
                if (key == i) {
                    System.out.print("*");
                    System.out.print(arr[i]);
                    System.out.print("*");
                    System.out.print(", ");
                } else {
                    System.out.print(arr[i]);
                    System.out.print(", ");
                }
            }
    
            System.out.print(arr[n-1]);
            System.out.print("]");
            System.out.println();
        }
 
    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };
 
        insertion_sort ob = new insertion_sort();
        ob.sort(arr);

        
        printArray(arr);

    }
};
 
