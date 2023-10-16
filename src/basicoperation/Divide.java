package basicoperation;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {

    Scanner in = new Scanner( System.in );
    double A = in.nextDouble();
    double B = in.nextDouble();

    System.out.println(A/B);
    in.close(); // inclose로 닫아주는 걸 적극권장.
    }
}


