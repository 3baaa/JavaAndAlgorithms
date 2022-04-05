package week_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_17478 {
	static String underbar = "";
	
	public static void recursion(int N) {
		String line = underbar;
		
		if(N == 0) {
			System.out.println(line + "\"����Լ��� ������?\"");
			System.out.println(line + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.println(line + "��� �亯�Ͽ���.");
			return;
		}
		
		System.out.println(line + "\"����Լ��� ������?\"");
		System.out.println(line + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println(line + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println(line + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		
		underbar += "____";
		
		recursion(N-1);
		
		System.out.println(line + "��� �亯�Ͽ���.");
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		
		recursion(N);
	}

}
