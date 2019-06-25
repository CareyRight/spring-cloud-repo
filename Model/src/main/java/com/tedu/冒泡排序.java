package com.tedu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/*
class a{
	public String getMsg(String key) {
		return "hello "+key ;
	}
}
class b{
	public String sendMsg(String key) {
		return "bye "+key ;
	}
}
class c{
	  a aa = new a();
	  b bb = new b();

	public String haha() {
		System.out.println("我是派生类");
		return "haha";
	}
}*/
public class 冒泡排序 {
	/*public static void main(String[] args) {
		c cc = new c();
		String msg1 = cc.bb.sendMsg("aaaaa");
		System.out.println(msg1);

		int[] a= {1,2,3,4};
		System.out.println(a.length);

		String[] bb = {"aa","aa","aa","aa"};
		System.out.println(bb.length);

		String aa = "12456789";
		System.out.println(aa.length());
	}*/

	public static void main(String[] args) {
		//排序字符串数组
		String[] mStrings = {"aaas","sssa","ccxc","acxx"};
		Arrays.sort(mStrings);
		System.out.println(Arrays.toString(mStrings));
		ArrayList<Object> list = new ArrayList<>();
		list.add("aa");
		System.out.println(list.get(0));
		//随机产生一个乱序数组
		int[] a = suiji();
		System.out.println(Arrays.toString(a));
		//将数组进行排序
		a = sort(a);
		System.out.println(Arrays.toString(a));
		

		
		//------------------------------------//
		Integer[] c = new Integer[11];
		for (int j = 0; j <c.length; j++) {
			c[j] = new Random().nextInt(1000);
		}
		System.out.println("包装类型随机数组 "+Arrays.toString(c));
		//排序数组用arrays.sort()
		//排序集合用collections.sort()
		Arrays.sort(c, new Comparator<Integer>() { 
			/**
			 * 比较器的匿名内部类，重写比较方法，实现正向和反向
			 * 返回值的规则
			 * o1大，返回正数
			 * o1小，返回负数
			 * 相同，返回0
			 */

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1-o2;
			}
			
		});
		
		System.out.println("包装类型正向排序数组 "+Arrays.toString(c));
		
		Arrays.sort(c, new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2-o1;
			}
			
		});
		
		System.out.println("包装类型反向排序数组 "+Arrays.toString(c));
		//------------------------------------//
		/**
		 * Java1.8的快排是一种双轴快排，顾名思义：双轴快排是基于两个轴来进行比较，跟普通的选择一个点来作为轴点的快排是有很大的区别的，双轴排序利用了区间相邻的特性，对原本的快排进行了效率上的提高，很大程度上是利用了数学的一些特性。。。。。嗯。。。反正很高深的样子

算法步骤
1.对于很小的数组（长度小于27），会使用插入排序。 
2.选择两个点P1,P2作为轴心，比如我们可以使用第一个元素和最后一个元素。 
3.P1必须比P2要小，否则将这两个元素交换，现在将整个数组分为四部分： 
（1）第一部分：比P1小的元素。 
（2）第二部分：比P1大但是比P2小的元素。 
（3）第三部分：比P2大的元素。 
（4）第四部分：尚未比较的部分。 
在开始比较前，除了轴点，其余元素几乎都在第四部分，直到比较完之后第四部分没有元素。 
4.从第四部分选出一个元素a[K]，与两个轴心比较，然后放到第一二三部分中的一个。 
5.移动L，K，G指向。 
6.重复 4 5 步，直到第四部分没有元素。 
7.将P1与第一部分的最后一个元素交换。将P2与第三部分的第一个元素交换。 
8.递归的将第一二三部分排序。
		 */

	}

	private static int[] suiji() {
		int l = 6;
		int n = 5+new Random().nextInt(l);
		int[] a = new int[n];
		for(int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(1000);
		}
		return a;
	}

	/**
	 * 冒泡排序--基础
	 * @param A
	 * @return
	 */
	private static int[] sort(int[] a) {
		int count = 0;
		//i遍历整个数组
		for (int i = 0; i < a.length; i++) {
			boolean flag = false ; //标识没有交换位置
			//j将较小值往前推
			//把最小值推到i的位置，从末尾到》i,递减
			for (int j = a.length-1; j > i; j--) {

				if (a[j]<a[j-1]) {
					int t = a[j];
					a[j] = a[j-1];
					a[j-1] = t;
					flag = true; //标识交换过位置
					count++;
					System.out.println(Arrays.toString(a));
				}
				
			}
			//直到j循环结束，判断flag的值是否为false，表示已经没有交还了
			if (!flag) {
				break; //跳出整个循环
			}
		}
		System.out.println("交还了："+count+"次。");
		return a;
	}
	

}
