package week_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;
public class Baekjoon_1302{
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // ���� �Ϸ� ���� �ȸ� å�� ���� N �Է�
        String name; // �Է��� å ���� ����
		ArrayList<String> list = new ArrayList<String>(); // �ȸ� å�� ���� ����Ʈ
		ArrayList<String> result = new ArrayList<String>(); // ���� ���� �ȸ� å���� ������ ���� ����Ʈ
		
		// �ȸ� å�� �Է�
		for (int i = 0; i < N; i++) {
			name = br.readLine();
			list.add(name);
		}
		
		// �ȸ� å���� ����� ������ ���� hashmap
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// �ȸ� å���� ����Ʈ���� hashmap�� ����� ������ �Է��ϴ� �ݺ���
		for (String str : list) {
			Integer count = map.get(str);
			if(count == null) {map.put(str, 1);}
            else {map.put(str, count + 1);}
		}
		
		// ���� ���� �ȸ� å�� ã�Ƽ� ����Ʈ�� �ֱ�
		Integer maxValue = Collections.max(map.values());
		
		// value�� key ã�� ���� ���� �ȸ� å���� ������ ���� ����Ʈ�� �ֱ�
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for (Entry<String,Integer> entry : entrySet) {
			if (entry.getValue() == maxValue) {result.add(entry.getKey());}
		}
		
		// ���� ���� �ȸ� å�� ���� ���� ��쿡 ���� ������ ���� �ռ��� ������ ���
		result.sort(Comparator.naturalOrder());
		System.out.println(result.get(0));		
	}
}