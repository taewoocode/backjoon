package programmers;

public class Bandage {
    public static void main(String[] args) {

        int[][] attacks = {(1,5 )}

    }

    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        //1.마지막 공격시간
        //2.공격한 횟수
        //3.맞은 횟수
        //4.회복한 체력
        //5.당한 체력
        //6.현재 체력
        //7.시전 시간
        //8.초당 회복량
        //9.추가 회복량

        int lastAttack = attacks[attacks.length - 1][0];
        int nowHealth = health;
        int attackCount = 0; //공격횟수
        int healingCount = 0; //회복횟수
        int skillTime = bandage[0]; //쿨타임
        int countHealing = bandage[1]; //시간당 회복량
        int benefitHealing = bandage[2]; //추가적인 회복량


        //i는 턴
        for (int i = 1; i<=lastAttack; i++){
            //공격 시간과 턴이 같다면?
            if (attacks[attackCount][0] == i){
                countHealing -= attacks[attackCount][1]; //현재체력에서 공격횟수 차감
                attackCount++; //공격횟수 1증가
                healingCount = 0;
                if (nowHealth == 0){
                    return -1;
                }
            } else{ //맞지 않은 케이스
                //현제채력이 총 체력보다 작은 케이스
                if (nowHealth < health) {
                    nowHealth++;
                    nowHealth += countHealing++;
                    healingCount = 0;
                    if (healingCount == skillTime) {
                        nowHealth += benefitHealing;
                        healingCount = 0;
                    }
                    if (nowHealth > health) {
                        nowHealth = health;
                    }
                }
            }
        }
        answer = nowHealth;

        return answer;
    }
}
