package basicoperation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        double A = sc.nextInt();
        double B = sc.nextInt();

        System.out.println(A-B);
        sc.close(); //
    }
}

//close로 닫아주는 걸 적극권장한다.