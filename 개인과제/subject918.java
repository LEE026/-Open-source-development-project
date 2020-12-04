/*****************************

* 프로그램명:점수계산 프로그램

* 작성자 :  2019038026 이혁수

* 작성일 : 2020-09-18

*프로그램 설명 : 이름, 국어, 영어, 수학,  C언어 입력받아 총점, 평균, 학점을 계산하여 출력하는 프로그램

*********************************/

package 개프;
import java.util.Scanner;

public class subject918 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("이름: ");
		String name= s.next();
		
		System.out.print("국어: ");
		double gukeo= s.nextDouble();
		
		System.out.print("영어: ");
		double english= s.nextDouble();
		
		System.out.print("수학: ");
		double math= s.nextDouble();
		
		System.out.print("c언어: ");
		double c= s.nextDouble();
		
		double sum=gukeo+english+math+c;
		double avg=sum/4;
		System.out.println("이름: "+name);
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
		
		System.out.print("학점: ");
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
