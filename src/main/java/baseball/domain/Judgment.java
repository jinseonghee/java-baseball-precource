package baseball.domain;

import java.util.List;

public class Judgment {

    public int correctCount(List<Integer> computer, List<Integer> player) { // == 볼의 개수

        int result = 0;
        for(int i = 0; i < player.size(); i ++) {
            int playerNumber = player.get(i);
            if(computer.contains(playerNumber)) {
                result++;
            }
        }
        return result;
    }

    public boolean hasPlace(List<Integer> computer, int placeIndex, int number) { // == 스트라이크의 개수

        return computer.get(placeIndex) == number; // 밑에와 같은 코드를 한줄로 줄임.

        /*
        if (computer.get(placeIndex) == number ) { //placeIndex의 숫자를 꺼냈을때 number랑 같은지를 바교
         return true;
        }
        return false;
        */
    }
}
