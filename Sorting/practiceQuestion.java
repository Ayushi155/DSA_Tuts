package Sorting;
// Given an integer array arr, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.
public class practiceQuestion {
    public static void sortZeros(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0 && arr[j+1]==0)continue;
                if(arr[j]==0){
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                }
                
            }
        }
        for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
    }
//Given an array of names of the fruits you are supposed to sort it in lexicographical order using the selection sort
    public static void sortLexiographically(String[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIdx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j].compareTo(arr[minIdx])<0){
                    minIdx=j;
                }
            }
        String temp=arr[i];
        arr[i]=arr[minIdx];
        arr[minIdx]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        // int[] arr = {0,5,0,3,4,2}; // 5 3 4 2 0 0
        // sortZeros(arr);
        String[] arr = {"kiwi" ,"apple", "papaya","mango"};
        sortLexiographically(arr);
    }
}
