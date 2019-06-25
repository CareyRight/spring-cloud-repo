package com.tedu;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class 运行期绑定和编译期绑定 {
	public static void main(String[] args) {
		B b = new B();//真实类型
		A a = new B();//向上转成父类型
		//运行期查找，并绑定到子类方法
		b.g();
		a.g();
		/* 静态成员在编译期绑定，
		 * 编译器根据变量a的类型定义，在这个类中查找f()方法并绑定
		 */
		b.f(); // B b = ... 相当于 B.f()
		a.f(); // A a = ... 相当于 A.f()
		/*
		 * 编译期绑定
		 * b.v1，B b = ...， 绑定到B类v1
		 * a.v1，A a = ...， 绑定到A类v1
		 */
		System.out.println(b.v1);
		System.out.println(a.v1);
		
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		for (String obj : list) {
			//list.remove(obj); //for-each只能用来访问数据，不能增删数据
			//list.add("b");
		}
		System.out.println(list.size());
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String aString = it.next();
			it.remove();
		}
		System.out.println(list.size());
		
	}
}
class A {
	static int v1 = 1;
	static void f() {
		System.out.println("A.f");
	}
	void g() {
		System.out.println("A.g");
	}
}
class B extends A {
	static int v1 = 2;
	static void f() {
		System.out.println("B.f");
	}
	void g() {
		System.out.println("B.g");
	}
}
