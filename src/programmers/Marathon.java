package programmers;

import java.util.Arrays;

public class Marathon {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        //1.두 배열을 정렬한다.
        Arrays.sort( participant );
        Arrays.sort( completion );

        int i = 0;
        for (; i < completion.length; i++) {
            if (participant[i].equals( completion[i] )) break;
        }
        return participant[i];
    }

    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        Marathon marathon = new Marathon();
        System.out.println( marathon.solution( part, comp ) );
    }
}



