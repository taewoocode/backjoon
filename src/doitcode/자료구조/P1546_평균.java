package doitcode.자료구조;

import java.util.Scanner;

public class P1546_평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        long sum = 0;
        long max = 0;
        for(int i=0; i<N; i++) {
           if(A[i]> max ) max = A[i];
           sum += A[i];

        }
        System.out.println(sum*100.0/max/N);



    }
}




// i는 0부터~ n까지 세미콜론 잊지말고
// sum*100.0/max/N 소수점 사용