public class nextgreatestnumber {
    public static void main(String[] args) {

        int[] arr = {12, 8, 42, 37, 2, 49, 16, 28, 21};
        int n = arr.length;

        int[] ans = new int[n];

        int mx = -1;              
        ans[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--) {
            mx = Math.max(mx, arr[i + 1]);
            ans[i] = mx;
        
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
  }
}


