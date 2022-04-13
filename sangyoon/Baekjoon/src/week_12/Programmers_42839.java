package week_12;


import java.util.HashSet;
public class Programmers_42839 {
    static HashSet<Integer> set= new HashSet<>();
    static char[] arr;
    static boolean[] visited;
    

    public static int solution(String numbers) {
        int answer = 0;
        arr= new char[numbers.length()];
        visited= new boolean[numbers.length()];
        
        for(int i=0; i<numbers.length(); i++){
            arr[i]=numbers.charAt(i);
        }
        recursion("", 0);
        
        answer= set.size();
        System.out.println(answer);
        return answer;
    }
    
    //���: ������ ���� ������ ã�� �Ҽ����ο� ���� set�� �߰�
    public static void recursion(String str, int idx){
        int num;
        if(str!="") {
            num= Integer.parseInt(str);
            if(isPrime(num)) set.add(num);
        }
        
        if(idx== arr.length) return;
        
        for(int i=0; i<arr.length; i++){
            if(visited[i]) continue;
            visited[i]= true;
            recursion(str+arr[i], idx+1);
            visited[i]= false;
        }
    }//rec
    
    public static boolean isPrime(int num){ //�Ҽ� �Ǻ�
        if(num==1||num==0) return false;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0) return false;
        }
        
        return true;
    }
    public static void main(String[] args) {
        String s = "17";
        solution(s);
    }
}