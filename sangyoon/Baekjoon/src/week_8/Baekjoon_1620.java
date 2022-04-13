package week_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon_1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" "); // ���� �� : n, ������ ���� : m
        int n = Integer.parseInt(inputs[0]); 
        int m = Integer.parseInt(inputs[1]);

        HashMap<Integer, String> map_int = new HashMap<>(); // value ������ �Է����� ��� -> ��ȣ
        HashMap<String, Integer> map_str = new HashMap<>(); // key ������ �Է����� ��� -> ���ϸ� �̸�
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            map_int.put(i, name); // key�� ��ȣ�� value�� ���ϸ� �̸���
            map_str.put(name, i); // value�� ���ϸ� �̸���, key�� ��ȣ��
        }
        
        String[] result = new String[m]; // �Է¹��� ������ �� ��ŭ ���� �Ҵ�
        
        for (int i = 0; i < m; i++) { // ���� �Է�
			result[i] = br.readLine();
			System.out.println(result[i]);
		}
        
        // ���Խ����� String �߿� int���� �ƴ��� �Ǻ�
        for (int i = 0; i < m; i++) {
        	boolean isNum = false;
            isNum = result[i].matches("[0-9]+[\\.]?[0-9]*"); // ���� �� ������� �������� üũ�ϰ� ���ڸ� True ����
            if(isNum) {
            	System.out.println(map_int.get(Integer.parseInt(result[i]))); // int�� map_int hashmap���� ���ϸ� �̸� ����
            }
            else {
            	System.out.println(map_str.get(result[i])); // int �� �ƴϸ� map_str hashmap���� ��ȣ ����
            }
              
		}
    }
}
