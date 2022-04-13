package week_8;

import java.util.HashMap;

// ���α׷��ӽ� ���� 2 : ��ȭ��ȣ ��� �ؽ�
public class Programmers_42577 {
	public static void main(String[] args) {
		String[] str= {"119", "97674223", "1195524421"};
		System.out.println(Solution(str));
	}
	
    public static boolean Solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();
        // ��� ��ȭ��ȣ Hashing �ϱ� (Hash Map�� �߰��ϱ�)
        for (int i = 0; i < phone_book.length; i++) {
			map.put(phone_book[i], i);
		}
        
        //�� ��ȭ��ȣ�� ���ξ HashMap�� �����ϴ��� Ȯ��
        for (int i = 0; i < phone_book.length; i++) {
			for (int j = 0; j < phone_book[i].length(); j++) {
				if(map.containsKey(phone_book[i].substring(0,j))) 
					return false;
			}
		}
        return answer;
    }
}
	
/*
 * import java.util.Arrays;
 *  Sort/Loop�� ����Ͽ� Ǯ��
 * 	sort �� Loop�� ���� �� ��ȣ�� �� ��ȣ�� ���ξ����� Ȯ��
 * 
 * 	private static boolean Solution(String[] phone_book) {
		boolean answer = true;
		Arrays.sort(phone_book);
		for (int i = 0; i < phone_book.length - 1; i++)
			if (phone_book[i + 1].startsWith(phone_book[i])) return false;
		return answer;
		// TODO Auto-generated method stub
		}
*/		


