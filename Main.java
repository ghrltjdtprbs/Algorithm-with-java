package hw1_1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("hw1_2 : 최혜미");

		int N = scanner.nextInt();
		int Array[]=new int[N];
		//배열의 크기 N을 입력받고, 배열 생성
		int Max=-1000000;
		int Min=1000000;
		int MaxNum=0;
		int MinNum=0;

		if ((1<= N)&&(N<=1000000)) {
			for(int i=0;i<N;i++) 
				Array[i]=scanner.nextInt();
		}//1<=N<=1000000일 경우, 배열 입력

		for(int i=0;i<N;i++)
			if(Array[i]>=Max)
				Max=Array[i];
		for(int i=0;i<N;i++)
			if(Array[i]<=Min)
				Min=Array[i];

		System.out.print(Min+" ");
		System.out.println(Max);
		//최소값 최대값 저장,출력

		for(int i=0;i<N;i++)
			if(Array[i]==Min)
				MinNum++;
		for(int i=0;i<N;i++)
			if(Array[i]==Max)
				MaxNum++;

		System.out.print(MinNum+" ");
		System.out.println(MaxNum);
		//최소값 최대값의 갯수 저장,출력






	}

}
