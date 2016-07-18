package basic;

import java.util.*;

public class Basic {

	// ����������ֵ
	public static int findMaxInList(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	// ��������Ԫ��ƽ��ֵ
	public static double countAverageValue(int[] a) {
		int N = a.length;
		double sum = 0.0;
		for (int i = 1; i < N; i++) {
			sum += a[i];
		}
		return sum / N;
	}

	// ��������
	public static int[] copyList(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		return b;
	}

	// �ߵ�����Ԫ��˳��
	public static int[] reverseList(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[a.length - i - 1];
		}
		return b;
	}

	// ������� ����ˣ�
	public static int[][] matrixMultiply(int[][] a, int[][] b) {
		int N = a.length;
		int[][] c = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		return c;

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 1, 2, 3 };
		System.out.println(Basic.findMaxInList(a));
		System.out.println(Basic.countAverageValue(a));
		System.out.println(Basic.copyList(a));
		System.out.println(Basic.reverseList(a));
	}

}
