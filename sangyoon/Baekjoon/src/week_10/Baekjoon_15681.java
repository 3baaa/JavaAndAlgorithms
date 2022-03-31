package week_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon_15681 {
	static ArrayList<ArrayList<Integer>> graph;
	static int[] dp;

	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	graph = new ArrayList<>();
	
	int n = Integer.parseInt(st.nextToken());
	int r = Integer.parseInt(st.nextToken());
	int q = Integer.parseInt(st.nextToken());
	
	dp = new int [n+1];
	
	for (int i = 0; i <= n; i++) {
		graph.add(new ArrayList<>());
	}
	
	// Ʈ�� ���� ����
	for (int i = 0; i < n-1; i++) {
		st = new StringTokenizer(br.readLine());
		int u = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		graph.get(u).add(v);
		graph.get(v).add(u);
	}
	
	//Ʈ�� ����
	buildTree(r, -1);
	
	
	StringBuilder sb = new StringBuilder();
	
	// ����ϱ����� ������ ����ŭ ��� ����
	for (int i = 0; i < q; i++) {
		int u = Integer.parseInt(br.readLine());
		sb.append(dp[u]).append("\n");
	}
	bw.write(sb.toString());
	bw.close();
	br.close();
}
	
	static int buildTree(int cur, int parent) {
		// dp[cur]�� 0�� �ƴϸ� ����� ����̹Ƿ�
		if(dp[cur] != 0) {
			return dp[cur];
		}
		dp[cur] = 1;
		
		for (int child : graph.get(cur)) {
			// parent �� child �� ������ �ȵǹǷ�
			// ����Ŭ�� ���� �θ�� ������ �ϳ��̹Ƿ� ����
			if (parent != child) {
				dp[cur] += buildTree(child, cur);
			}
		}
		return dp[cur];
			
		}
	}

//�ڷᱸ��
//1. �����ӽ�����
//	List	- ����, �ߺ����(�迭 Ȯ��)
//			- ArrayList(Vector)
//			
//	Set		- ������ ����, �ߺ� �����
//			- ���� for / Iterator
//			- HashSet
//			
//	Map		- Ű, �� ����
//			- Ű�� ������ �� / ���� ������ ��
//			- HashMap, Properties
//	
//	*���� ���� ó���ϱ�(��� ���� �ִ� 2���� �迭)
//	1. 2���� �迭 / 2���� ArrayList ���
//	2. 1���� �迭 + ��ü / 1���� ArrayList + ��ü (���� ���)
//	* 1���� ArrayList + HashMap
//	
//	*stack, queue
