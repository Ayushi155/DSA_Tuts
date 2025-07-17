package Sorting;


public class sorting {
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                }
            }
        }
        return;
    }
    public static void selectionSort(int[] arr){
        int n=arr.length;
        //int[] ans = new int[n];
        // int min=Integer.MAX_VALUE;
        // int x=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         if (arr[j]<min) {
        //             min=arr[j];
        //             x=j;
        //         }
        //     }
        //     int temp=arr[i];
        //     arr[i]=min;
        //     arr[x]=temp;
        //     min=Integer.MAX_VALUE;
        // }

        for(int i=0;i<n-1;i++){
            int minIdx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }
        int temp=arr[i];
        arr[i]=arr[minIdx];
        arr[minIdx]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
        int j = i;
        while (j > 0 && arr[j] < arr[j - 1]) {
            // XOR Swap
            arr[j] = arr[j] ^ arr[j - 1];
            arr[j - 1] = arr[j] ^ arr[j - 1];
            arr[j] = arr[j] ^ arr[j - 1];
            j--;
        }
    }

    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
}

    public static void main(String[] args) {
        int[] arr = {5,2,3,4,1};
        //bubbleSort(arr);
        // for(int i=0;i<5;i++){
        //     System.out.print(arr[i]+" ");
        // }
        //selectionSort(arr);
        insertionSort(arr);
    }
}
