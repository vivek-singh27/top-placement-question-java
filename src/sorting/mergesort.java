package sorting;

import java.util.Scanner;

public class mergesort {
    static void mergeSort(int []arr,int low,int high){
        if(low>=high)return;
        int mid=low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int []arr,int low,int mid,int high){
        int []temp=new int [high-low+1];
        int left=low;
        int right=mid+1;
       int k=0;
        while(left<=mid && right<=high) {
            if (arr[left] <= arr[right]) {   //check the greatest
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }
           while(left<=mid){   //element remaining in the left side
               temp[k++]=arr[left++];
           }
           while(right<=high){    //elements remaining in the right side
               temp[k++]=arr[right++];
           }

        for(int i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }

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
        mergeSort(arr,0,n-1);
        System.out.println("sorted array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
////time complexity -nlogn