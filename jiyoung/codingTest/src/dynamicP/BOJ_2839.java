package dynamicP;


import java.io.*;
import java.util.Arrays;

public class BOJ_2839 {
	public static void main(String[] args) throws IOException{
		//�Է�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n+1];
		
		//�⺻ ����
		Arrays.fill(dp, 5000);
		dp[3] = 1; dp[5] = 1;
		
		for(int i=6; i<=n; i++) dp[i] = Math.min(dp[i-3], dp[i-5])+1; //���� 1�� �߰�
		
		/*
		 * //Ȯ�ο� �ڵ� 
		 * for(int i : dp) System.out.print(i+" "); 
		 * System.out.println();
		 */
		
		//���
		if(dp[n] >= 5000) System.out.println(-1);
		else System.out.println(dp[n]);
	}

}
