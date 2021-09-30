package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NubmerGenerator {

    public List<Integer> createRandomNumbers() { //collection을 사용하여 배열을 지정해줄 필요가 없다.

        //3개의 숫자가 담길 때 까지
        //만약 이미 존재하는 숫자라면 담지 않는다.
        //만약 존재하지 않는 숫자라면 담는다.

        List<Integer> numbers = new ArrayList<>(); //number 3개의 수가 뽑힌 수를 담을 저장소를 만듬
                                                   //List는 타입인데, 이걸 약속이라고 생각하면 ArrayList는 약속을 지키는 구체적인 것이라고 생각

        while(numbers.size() < 3) { //while 문은 괄호 안이 false가 될 때까지 계속 반복. 즉, numbers의 사이즈가 3이상이면 그만.
            int number = new Random().nextInt(9) + 1;
            if(numbers.contains(number)) {
                continue;
            } else {
                numbers.add(number);
            }
        }
        /*
        for(int i = 0; i < 3; i++) {
            int number = new Random().nextInt(9) + 1; //java의 Random함수는 난수를 생성해서 serialize하는 역할을 하고, nextInt()로 숫자를 뽑아준다.
                                                             //boundary를 9까지 지정하면 0~8까지인데, 여기에 1을 더해서 1~9로 만들어 줌
            numbers.add(number); //numbers에 number 숫자 3개를 담음
        }

         */
        return numbers;
    }
}
