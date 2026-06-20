package sorting;

import java.util.Scanner;

public class Quicksort {
    static void QuickSort(int []arr,int low,int high){
        if(low>=high)return;
        int mid=low+(high-low)/2;
        int pivotIndex = partition(arr, low, high);
        QuickSort(arr,low,pivotIndex-1);
        QuickSort(arr,pivotIndex+1,high);

    }
    static int partition(int[]arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
         return i+1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        QuickSort(arr,0,n-1);
        System.out.println("sorted array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
//worst time complexity is n2 and avg is nlogn