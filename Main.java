package hw4_1;
import java.util.Scanner;


public class Main{
	public static int N;//�迭 ũ��
	public static int[] A;


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("hw4_2 : ������");
		System.out.println("��������");

		int N=scanner.nextInt();//�迭A�� ũ��N�� �Է�
		A = new int[N];



		for(int i=0; i<N;i++) //���Ĺ��� �迭A�Է�

			A[i]=scanner.nextInt();


		mergeSort(A,0,N-1);//A���ľ˰��� ȣ��
		for(int i=0; i<N; i++)             
			System.out.print(A[i]+" ");//���ĵ� A���


	}


	private static void mergeSort(int[] A, int p, int q) {
		int m = 0;

		if (p < q) {
			m = (p + q) / 2; // �߾Ӱ� ����
			mergeSort(A, p, m); // ���ʺ���
			mergeSort(A, m + 1, q); // �����ʺ���
			merge(A, p, m, q); // ����

		}
	}

	private static void merge(int[] A, int p, int m, int q) {

		int left = p;
		int right = m + 1;
		int tmp = p;
		int[] doneArray = new int[q + 1];


		while(left<= m && right<= q) {

			if (A[left]/100000 <= A[right]/100000) //�й� �� 4�ڸ��� �̿��� ����(�������ı��)
				doneArray[tmp++] = A[left++];
			else 
				doneArray[tmp++] = A[right++];    
		}


		if (left > m) {
			for(int i=right; i<=q; i++) 
				doneArray[tmp++] = A[i];    
		}
		else {
			for(int i=left; i<=m; i++) 
				doneArray[tmp++] = A[i]; 
		}

		for(int i=p; i<=q; i++) //������ ���� �ӽ� ������ �迭���� ���� �迭�� ����
			A[i] = doneArray[i];

	}
}












