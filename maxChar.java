import java.util.Scanner;
public class maxChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                int indx = ch - 'a';
                freq[indx]++;
            }
        }
         int maxFreq = -1;
         for(int i = 0 ; i < 26 ; i++){
             maxFreq = Math.max(maxFreq,freq[i]);
         }   

         for(int i = 0;i<freq.length;i++){
             if(freq[i]==maxFreq){
                 char ch = (char)(i+'a');
              System.out.print(ch + " ");

             }
         }
          System.out.print(maxFreq);
        }
    }
