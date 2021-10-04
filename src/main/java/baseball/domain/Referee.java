package baseball.domain;

import java.util.List;

public class Referee {

    public String compare(List<Integer> computer, List<Integer> player) {

        // 몇 개의 숫자가 같은지 알아낸 뒤 (= judgement)
        // 스트라이크의 개수를 구해 뺸다.
        // 남은 수는 볼의 개수이다.

        Judgment judgment = new Judgment();
        int correctCount = judgment.correctCount(computer, player); // 몇 개의 수가 같은지

        int strike = 0;
        for (int placeIndex = 0; placeIndex < player.size(); placeIndex ++) {
            if(judgment.hasPlace(computer, placeIndex, player.get(placeIndex))) { //computer와 Player의 숫자 비교
                strike++; //같다면 strike++
            }
        }
        int ball = correctCount - strike; // 볼의 개수

        if( correctCount == 0) {
            return "아웃";
        }

        return ball + " 볼 " + strike + " 스트라이크";
    }
}
