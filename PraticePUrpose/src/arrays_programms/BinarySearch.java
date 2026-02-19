package arrays_programms;

import java.util.Arrays;

public class BinarySearch {
public static void main(String[] args) {
	int [] a= {0,10,30,80,60,50,70,90,40,20,100};
	int count=0;
	int low=0;
	int key=90;
	int high=a.length-1;
	Arrays.sort(a);
	while(low<=high) {
		int mid=(low+high)/2;
		if(key==a[mid]) {
			count++;
			break;
		}
		else if(key>a[mid]) {
			low=a[mid]+1;
		}
		else if(key<a[mid]) {
			high=a[mid]-1;
		}
	}
	if(count>0) {
		System.out.println("Element is found");
	}
	else {
		System.out.println("Element is not found");
	}
}
}
