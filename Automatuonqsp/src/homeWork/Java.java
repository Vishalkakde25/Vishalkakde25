package homeWork;

import java.util.ArrayList;
import java.util.Iterator;

public class Java {
	public static void main(String[] args) {
		
		String obj="Vishal";
		StringBuilder p=new StringBuilder();
		System.out.println(obj);
		char[] a=obj.toCharArray();
		for (int i =a.length-1;i>=0; i--) {
			System.out.println(a[i]);
		}
		
		p.append(obj);
		System.out.println(p.reverse());
		
	}
}
