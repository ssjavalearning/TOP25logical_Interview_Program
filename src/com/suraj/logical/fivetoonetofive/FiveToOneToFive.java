package com.suraj.logical.fivetoonetofive;

public class FiveToOneToFive {

	public static void main(String[] args) {
		//go(5);
		getSeries(5);
	}
	public static void go(int num){
		if(num==1){
			System.out.println(num);
		}else{
			System.out.println(num);
			go(num-1);
			System.out.println(num);
		}
	}
	
	public static void getSeries(int num) {  
		for (int i = num; num >=1; num--) {
			System.out.println(num);
		}
	}
}
