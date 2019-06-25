package com.tedu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * arrays.sort()排序方法对字符串排序是根据字符串的首字母进行排序，首字母相同往后顺延
 * 二分法查找，在list中找n所在的位置
 * 找不到，返回 -(插入点+1)
 * @author Administrator
 *
 */
public class 二分法查找 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int[] a  = suiji();
		System.out.println("基本类型随机数组 "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("基本类型排序数组 "+Arrays.toString(a));
		//二分法查找要寻找数值的位置
		System.out.println("输入要查找的数值：");
		int t = new Scanner(System.in).nextInt();
		//int index = benarySearch(a , t);
		int index = Arrays.binarySearch(a, t);
		System.out.println(index);
	}

	@SuppressWarnings("unused")
	private static int benarySearch(int[] a, int t) {
		/**
		 * 从两头向中间找
		 */
		int lo = 0;
		int hi = a.length - 1;
		int mid ;
		while (lo<=hi) {
			mid = (lo+hi)/2;
			mid = (lo+hi) / 2;

	         if(a[mid] < t) {
	            lo = mid+1;
	         } else if(a[mid] > t) {
	            hi = mid-1;
	         } else {
	            return mid;
	         }
		}
		return -(lo-1);  //避免是0,加1后再加负号== -(插入点-1)
	}

	private static int[] suiji() {
		int a = 5+new Random().nextInt(6);
		int[] b = new int[a];
		for (int i = 0; i < b.length; i++) {
			b[i]=new Random().nextInt(1000);
		}
		return b;
	}
}
