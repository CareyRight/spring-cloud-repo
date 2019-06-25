package com.tedu;

import java.util.Arrays;
import java.util.Random;

public class 有序数组的并归 {
	 public static void main(String[] args) {
	      int[] a = suiJi();
	      int[] b = suiJi();
	      Arrays.sort(a);
	      Arrays.sort(b);
	      System.out.println(Arrays.toString(a));
	      System.out.println(Arrays.toString(b));
	      int[] c = heBing(a, b);
	      System.out.println(Arrays.toString(c));
	   }

	   private static int[] suiJi() {
	      int n = 5+ new Random().nextInt(6);
	      int[] a = new int[n];
	      for (int i = 0; i < a.length; i++) {
	         a[i] = new Random().nextInt(100);
	      }
	      return a;
	   }

	   private static int[] heBing(int[] a, int[] b) {
	      /*
	       * a[1,1,2,3,4]
	       *              j
	       * b[1,2,4,5,6,8,9]
	       *         k
	       *
	       * c[                     ]
	       *               i
	       */
	      //新建数组
	      int[] c = new int[a.length+b.length];
	      //对新数组遍历
	      for(int i=0,j=0,k=0;i<c.length;i++) {
	         if(j>=a.length) {//j越界，b数组数据一个一个放入新数组
	            //c[i] = b[k];
	            //k++;
	            //continue;
	            System.arraycopy(b,k,c,i,b.length-k);
	            break;
	         } else if(k>=b.length) {//k越界,a数组数据一个个放入新数组
	            //c[i] = a[j];
	            //j++;
	            //continue;
	            System.arraycopy(a,j,c,i,a.length-j);
	            break;
	         }
	         //j和k，较小值放入i位置，并递增
	         if(a[j]<=b[k]) {
	            c[i] = a[j];
	            j++;
	         } else {
	            c[i] = b[k];
	            k++;
	         }
	      }    
	      return c;
	   }
}
