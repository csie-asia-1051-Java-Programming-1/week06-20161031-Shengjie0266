package hw;
import java.util.*;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("�п�J�ʧO,����");
		int n=scn.nextInt(); //�ʧO
		double m=scn.nextFloat(); //����
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
