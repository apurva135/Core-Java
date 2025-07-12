package Codes.Basic;

public class MergeArrays {
    public static int[] mergeSorted(int[] a, int[] b) {
     int n = a.length, m = b.length;
     int result[] = new int[n+m];
     int i =0,j=0,k=0;

     while(i<n && j<m)
     {
         if(a[i] <b[j])
         {
             result[k++] = a[i++];
         }
         else {
             result[k++] = b[j++];
         }
     }
     while (i<n)
     {
         result[k++] = a[i++];
     }
        while (j<m)
        {
            result[k++] = b[j++];
        }

     return  result;
    }

        public static void main(String[] args) {
        int[] merged = mergeSorted(new int[]{1, 3, 5}, new int[]{2, 4});
        for (int num : merged) {
            System.out.print(num + " "); // Output: 1 2 3 4 5
        }

    }

}
