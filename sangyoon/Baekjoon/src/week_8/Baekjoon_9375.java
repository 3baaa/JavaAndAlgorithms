package week_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon_9375 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();  
		
		int t = Integer.parseInt(br.readLine()); // test case
		
		while(t-- >0) {
			
			HashMap<String, Integer> hm = new HashMap<>(); // �� ������ ����
			
			int n = Integer.parseInt(br.readLine()); // �Է¹��� ���� ����
			
			while(n-- >0) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				st.nextToken(); // �� �̸��� ��� �ѱ�
				String kind = st.nextToken(); // �� �������� ����
				
				if(hm.containsKey(kind)) { // �̹� �ش� key�� ������  value + 1 -> �ش� ������ ���� + 1
					hm.put(kind, hm.get(kind) + 1);
				}
				else { // �ش� key�� ������ �ش� key �Է�, value �� 1 �Է� -> �ش� ������ �� 1�� �Է�
					hm.put(kind, 1);
				}
			}
			
			int result = 1; // ���ؾ��ؼ� 1�� �ʱ�ȭ
			for (int value : hm.values()) {
				result *= (value + 1); // value�� +1�� �ϴ� ������ �� ������ ���� ���Դ� ��쵵 �߰��ؾ��ؼ�
			}
			sb.append(result -1).append('\n'); // ��� ������ ���� �������� �˸��� �Ǳ� ������ �˸��� ���� �����ؼ� -1
		}
		System.out.println(sb);
	}
}

