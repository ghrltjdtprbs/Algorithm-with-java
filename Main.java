package hw1_1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("hw1_2 : ������");

		int N = scanner.nextInt();
		int Array[]=new int[N];
		//�迭�� ũ�� N�� �Է¹ް�, �迭 ����
		int Max=-1000000;
		int Min=1000000;
		int MaxNum=0;
		int MinNum=0;

		if ((1<= N)&&(N<=1000000)) {
			for(int i=0;i<N;i++) 
				Array[i]=scanner.nextInt();
		}//1<=N<=1000000�� ���, �迭 �Է�

		for(int i=0;i<N;i++)
			if(Array[i]>=Max)
				Max=Array[i];
		for(int i=0;i<N;i++)
			if(Array[i]<=Min)
				Min=Array[i];

		System.out.print(Min+" ");
		System.out.println(Max);
		//�ּҰ� �ִ밪 ����,���

		for(int i=0;i<N;i++)
			if(Array[i]==Min)
				MinNum++;
		for(int i=0;i<N;i++)
			if(Array[i]==Max)
				MaxNum++;

		System.out.print(MinNum+" ");
		System.out.println(MaxNum);
		//�ּҰ� �ִ밪�� ���� ����,���






	}

}
