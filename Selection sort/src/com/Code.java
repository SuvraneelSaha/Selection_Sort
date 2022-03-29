package com;

import java.util.Arrays;
import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements in the array :");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("OG array " + Arrays.toString(arr));
        SelectionSort(arr);
        System.out.println("New array is "+Arrays.toString(arr));





    }
    // Steps for selection sort :
    // 1] find out the last index position that needs to be replaced with the largest element
    // 2] find out the greatest or largest element in the array
    // 3] swap the largest element at the last index position
    // 4] do the above until and unless the arr is sorted
    static void SelectionSort(int[] arr)
    {
        for (int i = 0; i <arr.length ; i++)
        {
            // find the max item in the remaining array and swap with the correct index

            // 1st step to find the last index of the array
            int lastindex = arr.length - i - 1 ; // starting with the last index

            // 2nd step is to find the largest element from the array in order to replace the element
            int maxindex = getmaxindex(arr,0,lastindex);
            swap(arr,maxindex,lastindex);


        }
    }

     static int getmaxindex(int[] arr, int start, int end)
    {
        // let start index have the largest element
        int max = start;

        // for finding the max element within the new respective sub array
        for (int i = start; i <=end ; i++)
        {
            if(arr[max] < arr[i])
            {
                max = i ;
            }
        }
        return max ;
    }

    static void swap(int[] arr , int first , int second)
    {
        int temp = arr[first];
          arr[first] = arr[second];
          arr[second] = temp;
    }


}
