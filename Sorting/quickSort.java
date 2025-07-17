package Sorting;

public class quickSort {
    public static int partition(int[] arr, int st, int end){
        int piv=arr[st];
        int count=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=piv){
                count++;
            }
        }
        int pivIdx = st+count;
        swap(arr,st,pivIdx);
        int i=st,j=end;
        while (i<pivIdx && j>pivIdx) {
            while(arr[i]<arr[pivIdx])i++;
            while(arr[j]>arr[pivIdx])j--;
            if(i<pivIdx && j>pivIdx){
                swap(arr, i, j);
                i++;j--;
            }
        }

        return pivIdx;
    }
    public static void quickSorting(int[] arr, int st , int end){
        if(st>=end)return;
        int piv = partition(arr,st,end);
        quickSorting(arr, st, piv-1);
        quickSorting(arr, piv+1, end);
    }
    public static void swap(int[] arr, int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void displayArr(int[] arr){
        for (int val : arr) {
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr= {6,3,1,5,4};
        System.out.println("Array befor sorting");
        displayArr(arr);
        System.out.println();
        quickSorting(arr, 0, arr.length-1);
        System.out.println("Array after sorting");
        displayArr(arr);
    }
}
