    package Stacks;
    import java.util.Stack;

    public class nextGreaterElement {
        // public static int[] nextGreater(int[] arr1){
        //     Stack<Integer> st = new Stack<>();
        //     int n=arr1.length;
        //     int[] ans = new int[n];
        //     ans[n-1] = -1;
        //     st.push(arr1[n-1]);
        //     for(int i=n-2;i>=0;i--){
        //         while(st.size()>0 && st.peek()<arr1[i] ){
        //             st.pop();
        //         }
        //         if(st.size()==0){
        //             ans[i]=-1;
        //         }
        //         else{
        //             ans[i]=st.peek();
        //         }
        //         st.push(arr1[i]);
        //     }

            
        //     return ans;
        // }

        //next approach in O(n)

        public static int[] nextGreater(int[] arr1){
            Stack<Integer> st = new Stack<>();
            int n=arr1.length;
            int[] ans = new int[n];
            for(int i=0;i<n;i++)ans[i]=-1;
            for(int i=0;i<n;i++){
                while(!st.isEmpty() && arr1[i]>arr1[st.peek()]){
                    ans[st.pop()]=arr1[i];
                }
                st.push(i);
            }
            return ans;
        }
        // public static int[] nse(int[] arr1){
        //     Stack<Integer> st = new Stack<>();
        //     int n=arr1.length;
        //     int[] res = new int[n];
        //     res[n-1] = n+1;
        //     st.push(arr1[n-1]);
        //     for(int i=n-2;i>=0;i--){
        //         while(st.size()>0 && st.peek()>arr1[i] ){
        //             st.pop();
        //         }
        //         if(st.size()==0){
        //             res[i]=n+1;
        //         }
        //         else{
        //             res[i]=st.peek();
        //         }
        //         st.push(arr1[i]);
        //     }

            
        //     return res;
        // }
        
        public static void main(String[] args) {
            int[] arr1 = {1,3,2,1,8,6,3,4};
            int[] ans = nextGreater(arr1);
            for(int i=0;i<ans.length;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
            // int[] res = nse(arr1);
            // for(int i=0;i<ans.length;i++){
            //     System.out.print(res[i]+" ");
            // }
        }
    }
