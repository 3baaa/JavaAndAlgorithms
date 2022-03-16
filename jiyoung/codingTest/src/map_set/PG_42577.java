package map_set;

import java.util.*;
import java.io.*;

/*
 ��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.

������ : 119
���ؿ� : 97 674 223
������ : 11 9552 4421
��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��, 
� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
phone_book�� ���̴� 1 �̻� 1,000,000 �����Դϴ�.
�� ��ȭ��ȣ�� ���̴� 1 �̻� 20 �����Դϴ�.
���� ��ȭ��ȣ�� �ߺ��ؼ� ������� �ʽ��ϴ�.
 */

public class PG_42577 {
	
	public static boolean solution(String[] phone_book) {
		HashSet<String> set = new HashSet();
		for(int i=0; i<phone_book.length; i++) {
			for(String s : set) {
				if(phone_book[i].contains(s)) return false;
			}
			set.add(phone_book[i]);
		}
		
		return true;
	}

	public static void main(String[] args) {
		String[] t1 = {"119", "97674223", "1195524421"}; //false
		String[] t2 = {"123","456","789"}; //true
		String[] t3 = {"12","123","1235","567","88"}; //false
		solution(t1);
	}

}
