package lab4_1;

import java.util.Scanner;

public class Main_201914068 {

	public static void main(String[] args) {
		System.out.println("lab4_1:홍석현");

		// 사용자가 원하는 갯수의 정수값을 입력받음
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] array = new String[n];

		for (int i = 0; i < n; i++) {
			array[i] = input.next();
		}

		// 버블 정렬 수행
		bubbleSort(array);

		// 정렬 결과를 출력
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}

		input.close();
	}

// array의 원소들을 오름차순으로 버블 정렬하는 메소드
	public static void bubbleSort(String[] array) {
		for (int last = array.length - 1; last >= 1; last--) {
			for (int i = 0; i < last; i++) {
				if (array[i].length() > array[i + 1].length()) {
					swap(array, i, i + 1);
				}
			}
		}
	}

// array[i]와 array[j]를 교환하는 메소드
	private static void swap(String[] array, int i, int j) {
		String temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
