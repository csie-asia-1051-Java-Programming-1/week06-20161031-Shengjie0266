package hw;
import java.util.*;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入性別,身高");
		int n=scn.nextInt(); //性別
		double m=scn.nextFloat(); //身高
		fun(n,m);
	}
public static void fun(int n,double m){
	if(n==1){
		m=(m-170)*0.6+62;
	}
	if(n==2){
		m=(m-158)*0.5+52;
	}
	System.out.print(m);
}
}
