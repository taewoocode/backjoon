package basicoperation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner( System.in );
        int A = in.nextInt();
        int B = in.nextInt();

        System.out.println(A-B);
        in.close(); // inclose로 닫아주는 걸 적극권장.
    }
}
