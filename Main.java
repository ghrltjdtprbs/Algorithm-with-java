package hw4_1;
import java.util.Scanner;


public class Main{
	public static int N;//배열 크기
	public static int[] A;


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("hw4_2 : 최혜미");
		System.out.println("병합정렬");

		int N=scanner.nextInt();//배열A의 크기N을 입력
		A = new int[N];



		for(int i=0; i<N;i++) //정렬받을 배열A입력

			A[i]=scanner.nextInt();


		mergeSort(A,0,N-1);//A정렬알고리즘 호출
		for(int i=0; i<N; i++)             
			System.out.print(A[i]+" ");//정렬된 A출력


	}


	private static void mergeSort(int[] A, int p, int q) {
		int m = 0;

		if (p < q) {
			m = (p + q) / 2; // 중앙값 구함
			mergeSort(A, p, m); // 왼쪽분할
			mergeSort(A, m + 1, q); // 오른쪽분할
			merge(A, p, m, q); // 병합

		}
	}

	private static void merge(int[] A, int p, int m, int q) {

		int left = p;
		int right = m + 1;
		int tmp = p;
		int[] doneArray = new int[q + 1];


		while(left<= m && right<= q) {

			if (A[left]/100000 <= A[right]/100000) //학번 앞 4자리만 이용해 정렬(안정정렬기능)
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

		for(int i=p; i<=q; i++) //정렬을 위해 임시 저장한 배열에서 원래 배열로 복사
			A[i] = doneArray[i];

	}
}












