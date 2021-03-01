import java.io.*;
import java.util.*;
public class WaveArray {
   public static void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
   public static void sortInWave(int arr[], int n)
    {
        for (int i = 0; i < n; i+=2)
        {
            if (i>0 && arr[i-1] > arr[i] )
                swap(arr, i-1, i);
            if (i<n-1 && arr[i] < arr[i+1] )
                swap(arr, i, i + 1);
        }
    }
    public static void main(String[]args)throws Exception
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i=0;i< arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        sortInWave(arr, n);
        for (int i : arr)
            System.out.print(i+" ");
    }

}