package programmers;

import java.util.Arrays;

public class Marathon {
    public String solution(String[] participant, String[] completion){
        //1.배열을 정렬하기
        Arrays.sort( participant );
        Arrays.sort( completion );

        //2.두 배열을 돌아서 찾는다.
        int i = 0;
        for (; i < completion.length; i++) {
            if (!participant[i].equals( completion[i] )) break;

        }
        return participant[i];
    }

    //debug
    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        Marathon marathon = new Marathon();
        System.out.println( marathon.solution( part, comp ) );
    }
}



