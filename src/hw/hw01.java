package hw;
import java.util.*;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入一個溫度值"+ ","+"計算方式");
		float n=scn.nextFloat();
		int m=scn.nextInt();
		fun(n,m);
		
	}
public static void fun(float n,int m){
	if(m==1){
		n=(n-32)*((float)5/9);
	}
	if(m==2){
		n=n*((float)9/5)+32;
	}
	System.out.print(n);
}
}
