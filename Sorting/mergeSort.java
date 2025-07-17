package Sorting;

public class mergeSort {
    public static void merge(int[] arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i=0;i<n1;i++) left[i]=arr[l+i];
        for(int j=0;j<n2;j++) right[j]=arr[mid+1+j];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;k++;
            }
            else{
                arr[k]=right[j];
                k++;j++;
            }
        }
        while(i<n1){
            arr[k]=left[i];
            k++;i++;
        }
        while(j<n2){
            arr[k]=right[j];
            k++;j++;
        }

    }
    public static void mergeSorting(int[] arr , int l , int r){
        if(l>=r)return ; //for single element base case
        int mid = (l+r)/2;
        mergeSorting(arr,l,mid);
        mergeSorting(arr, mid+1, r);
        merge(arr,l,mid,r);

    }
    public static void displayArray(int[] arr){
        for (int val : arr) {
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,1,3,5,2};
        int n=arr.length;
        System.out.println("Array before sorting");
        displayArray(arr);
        mergeSorting(arr,0,n-1);
        System.out.println();
        System.out.println("Array after sorting");
        displayArray(arr);
    }

}
