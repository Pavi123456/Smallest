package janani;
import java.util.Scanner;
public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,n,n1;
String str="";
Scanner ja=new Scanner(System.in);
System.out.println("enter the value of n:");
n=ja.nextInt();
System.out.println("enter the value of n1:");
n1=ja.nextInt();
String str1=Integer.toString(n);
int l=str1.length();
for(i=n1;i<l;i++){
	str=str+str1.substring(i,i+1);
}
System.out.println(str);
	}

}
