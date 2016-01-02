package com.gpl.sort;

public class Bubblesort {
	public static int[] bubblesort(int[] array){
		if(array==null)
			return null;
		int temp;
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]>array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
	public static void main(String[] args) {
		int[] a={1,5,9,8,6,2};
		int[] b=bubblesort(a);
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+" ");
		}

	}

}
