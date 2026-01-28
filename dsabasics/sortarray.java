public class sortarray {
    public static void main(String[] args){
        int[] arr={1,0,0,1,1,0,0,0,1,0};
           int n = arr.length;
           int noOfZeroes =0,noOfOnes = 0;
           for(int i=0;i<n;i++){
            if(arr[i]==0) noOfZeroes++;
            else noOfOnes++;
           }
           for(int i=0;i<noOfZeroes;i++){
               arr[i]=0;
           }
            for(int i=noOfZeroes;i<n;i++){
               arr[i]=1;
           }
           for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }     
    
}
