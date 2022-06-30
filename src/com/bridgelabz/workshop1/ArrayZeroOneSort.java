package com.bridgelabz.workshop1;

import java.util.Scanner;

public class ArrayZeroOneSort {
	
	public static void main(String[] args)  
    { 
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int a[] = new int[n];
        int index[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sr.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            index[i] = sr.nextInt();
        }
        for(int i=0; i<n;i++)
        {
            while(index[i] != i) //keep looping till index[i] is not equal to actual index
            {
                a[i]=a[i]+a[index[i]]-(a[index[i]]=a[i]);
                index[i]=index[i]+index[index[i]]-(index[index[i]]=index[i]);
            }
        }  
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

//	public static void main(String[] args) {
//	
//	int [] array = new int[] {0, 1, 0, 0, 1, 1, 0, 1, 1};
//	int[] zeroArray = new int[];
//	int[] oneArray = new int[];
//	
//	}
}
