import java.util.Scanner;
public class rotatearray {
    public static void reverse(int[] nums,int i,int j){
        while(i<=j){
        int temp=nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
       }
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
   
    int n = sc.nextInt();         
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
    int k = sc.nextInt();
        k = k%n;
    reverse(nums,0,n-k-1);
    reverse(nums,n-k,n-1);
    reverse(nums,0,n-1);
      for (int x : nums) {
            System.out.print(x + " ");
        }
sc.close();
}    

}
