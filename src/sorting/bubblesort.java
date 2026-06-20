package sorting;

import java.util.Scanner;

public class bubblesort {
    static void bubble(int[] arr){
        int n= arr.length;
        boolean swap;
        for(int i=0;i<n-1;i++){
            swap=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }
            if(swap==false)break;
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
        bubble(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }

    }
}
//it is stable and avg and worst time compelxity is n2 while best is n