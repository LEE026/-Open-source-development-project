/*****************************

* ���α׷���:������� ���α׷�

* �ۼ��� :  2019038026 ������

* �ۼ��� : 2020-09-18

*���α׷� ���� : �̸�, ����, ����, ����,  C��� �Է¹޾� ����, ���, ������ ����Ͽ� ����ϴ� ���α׷�

*********************************/

package ����;
import java.util.Scanner;

public class subject918 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name= s.next();
		
		System.out.print("����: ");
		double gukeo= s.nextDouble();
		
		System.out.print("����: ");
		double english= s.nextDouble();
		
		System.out.print("����: ");
		double math= s.nextDouble();
		
		System.out.print("c���: ");
		double c= s.nextDouble();
		
		double sum=gukeo+english+math+c;
		double avg=sum/4;
		System.out.println("�̸�: "+name);
		System.out.println("����: "+sum);
		System.out.println("���: "+avg);
		
		System.out.print("����: ");
		if(avg>=90)
			System.out.println("A");
		else if(avg>=80)
			System.out.println("B");
		else if(avg>=70)
			System.out.println("C");
		else if(avg>=60)
			System.out.println("D");
		else if(avg>=50)
			System.out.println("E");
		else if(avg>=40)
			System.out.println("F");

	}

}
