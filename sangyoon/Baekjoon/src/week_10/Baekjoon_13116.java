package week_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon_13116 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			bw.write(String.valueOf(tree(A,B)) + "\n");
		}
		bw.flush();
		bw.close();
		
	}
	
	public static int tree(int A, int B) {
		
		int result = 0;
		
		// A�� B���� Ŭ ��
		if(A > B) {
			while(true) {
				if(A-B < B) break; // A���� B�� �� ���� B���� �۾����� ���� A�� 2�� ������(�θ� ���� �̵���Ų��) -> ������ ���� 1���Ϸ� ������ش�.(������ ���̸� 1���Ϸ� ������ش�)
				A /= 2;
			}
		}
		// B�� A���� Ŭ ��
		else {
			while(true) {
				if(B - A < A) break;
				B /= 2;
			}
		}
		
		// ������ ���� 1������ ��, �� ū ������ 2�� �����鼭(�θ� ���� �̵�) ���� �������� ���� ���� �θ��带 �߰��� ���̴�.
		// ex) 13, 14 �϶� 13/2 = 6, 14/2 = 7, 6/2 = 3, 7/2 = 3 �̹Ƿ� 3�� ���� �θ��� ����� �� �� �ִ�.
		while (A != B) {
			if(A > B) {
				A /= 2;
				if(A==B) break;
				B /= 2;
			}
			else {
				B /= 2;
				if(A==B) break;
				A /= 2;
			}
		}
		
		result = A*10;
		
		return result;
	}
}
