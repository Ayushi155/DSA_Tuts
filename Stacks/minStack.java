// package Stacks;
// import java.util.*;

// public class minStack {
//     public static int minValue(int[] arr){
//         int minst = Integer.MAX_VALUE;
//         int n=arr.length;
//         Stack<Integer> st = new Stack<>();
//         Stack<Integer> ss = new Stack<>();
//         for(int i=0;i<n;i++){
//             minst= Math.min(minst, arr[i]);
//             st.push(arr[i]);
//             ss.push(minst);
//         }
//         return minst;
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,3,2,1,8,6,3,4};
//     }
// }
