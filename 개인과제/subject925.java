/*****************************

* 프로그램명: 성적관리 프로그램

* 작성자 :  2019038026 이혁수

* 작성일 : 2020-09-25

*프로그램 설명 : 5명의 학번, 이름, 국어, 영어, 수학,  C언어 입력받아  총점, 평균, 학점을 계산하여 출력하는 프로그램

*********************************/

package 개프;
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
			System.out.printf("%d번째 학생\n",i+1);
			
			System.out.print("학번: ");
			hakbeon[i] = s.next();
			
			System.out.print("이름: ");
			name[i] = s.next();
			
			System.out.print("국어: ");
			gukeo[i]= s.nextDouble();
			
			System.out.print("영어: ");
			english[i]= s.nextDouble();
			
			System.out.print("수학: ");
			math[i]= s.nextDouble();
			
			System.out.print("c언어: ");
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
		
		System.out.println("						성적관리시스템");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("학번		이름		국어		영어		수학		c언어	 	총점		퍙균		학점");
		for(int i=0;i<5;i++) {
			System.out.printf("%s		%s		%.2f		%.2f		%.2f		%.2f	 	%.2f		%.2f		%s\n",hakbeon[i],name[i],gukeo[i],english[i],math[i],c[i],sum[i],avg[i],hakjeom[i]);
		}
		System.out.println("-------------------------------------------------------------------");
				
	}

}
