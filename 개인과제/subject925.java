/*****************************

* ���α׷���: �������� ���α׷�

* �ۼ��� :  2019038026 ������

* �ۼ��� : 2020-09-25

*���α׷� ���� : 5���� �й�, �̸�, ����, ����, ����,  C��� �Է¹޾�  ����, ���, ������ ����Ͽ� ����ϴ� ���α׷�

*********************************/

package ����;
import java.util.Scanner;

public class subject925 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String hakbeon[]=new String[5];
		String name[]=new String[5];
		double gukeo[]=new double[5];
		double english[]=new double[5];
		double math[]=new double[5];
		double c[]=new double[5];
		double sum[]=new double[5];
		double avg[]=new double[5];
		String hakjeom[]=new String[5];
		
		for(int i=0;i<5;i++) {
			System.out.printf("%d��° �л�\n",i+1);
			
			System.out.print("�й�: ");
			hakbeon[i] = s.next();
			
			System.out.print("�̸�: ");
			name[i] = s.next();
			
			System.out.print("����: ");
			gukeo[i]= s.nextDouble();
			
			System.out.print("����: ");
			english[i]= s.nextDouble();
			
			System.out.print("����: ");
			math[i]= s.nextDouble();
			
			System.out.print("c���: ");
			c[i]= s.nextDouble();
			
			sum[i]=gukeo[i]+english[i]+math[i]+c[i];
			avg[i]=sum[i]/4;
			
			if(avg[i]>=90)
				hakjeom[i]="A";
			else if(avg[i]>=80)
				hakjeom[i]="B";
			else if(avg[i]>=70)
				hakjeom[i]="C";
			else if(avg[i]>=60)
				hakjeom[i]="D";
			else if(avg[i]>=50)
				hakjeom[i]="E";
			else if(avg[i]>=40)
				hakjeom[i]="F";
		}
		
		System.out.println("						���������ý���");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("�й�		�̸�		����		����		����		c���	 	����		����		����");
		for(int i=0;i<5;i++) {
			System.out.printf("%s		%s		%.2f		%.2f		%.2f		%.2f	 	%.2f		%.2f		%s\n",hakbeon[i],name[i],gukeo[i],english[i],math[i],c[i],sum[i],avg[i],hakjeom[i]);
		}
		System.out.println("-------------------------------------------------------------------");
				
	}

}
