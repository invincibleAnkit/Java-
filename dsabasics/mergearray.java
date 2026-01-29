public class mergearray {
    public static void main(String[] args){

   int[] arr1={11,33,42,71};
   int[] arr2={26,54,69,81};
   int m=arr1.length,n=arr2.length;
   int[] arr3=new int[m+n];
   int i=0,j=0,k=0;
   while(i<arr1.length&&j<arr2.length){
      if(arr1[i]<=arr2[j]){
        arr3[k]=arr1[i];
         i++;k++;
      }
      else{
        arr3[k]=arr2[j];
        j++;
        k++;
      }
   }
   if(i==arr1.length){
    while(j<arr2.length){
        arr3[k] = arr2[j];
        j++; k++;
    }
     if(j==arr2.length){
    while(i<arr1.length){
        arr3[k] = arr1[i];
        i++; k++;
    }
   }
   for( k=0;k<arr3.length;k++){
    System.err.print(arr3[k]+" ");
         }
    }
}
}
