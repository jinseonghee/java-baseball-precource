package baseball;

/*
 객체 지향 프로그래밍
 1. 기능을 가지고 있는 클래스를 인스턴스화(=객체) 한다.
 2. 필요한 기능을 (역할에 맞는) 각 인스턴스가 수행하게 한다.(의인화)
 3. 각 결과를 종합한다.
 */

import baseball.domain.Judgment;
import baseball.domain.NubmerGenerator;
import baseball.domain.Referee;

import java.sql.Ref;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        NubmerGenerator generator = new NubmerGenerator();
        List<Integer> computer = generator.createRandomNumbers();

        Referee referee = new Referee();

        String result = "";
        while (!result.equals("0 볼 3 스트라이크")) { //0볼 3스트라이크가 아닐 경우 계속 실행
            result = referee.compare(computer, askNumbers()); //정적 메소드는 인스턴스화 해서 부르지 않는 이상 정적 메서드만 사용 가능
            System.out.println(result);
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static List<Integer> askNumbers() {
        System.out.print("숫자를 입력해 주세요 : ");
        String input = new Scanner(System.in).next();

        List<Integer> numbers = new ArrayList<>();
        for(String number : input.split("")) {
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }
}
