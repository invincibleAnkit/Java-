public class substring {
 public static void main(String[] args){
    String s = "abcde";
    // System.out.println(s.substring(2));
   for(int i=1;i<=5;i++){
     for(int j=i+1;j<=5;j++){
    System.out.println(s.substring(0,i)+" ");
     }
     System.out.println();
   }
 }
}