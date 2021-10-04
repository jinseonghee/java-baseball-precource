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

public class Application {

    public static void main(String[] args) {

        Referee referee = new Referee();
        String result = referee.compare(Arrays.asList(7, 8, 9), Arrays.asList(1, 2, 3));
        System.out.println(result);

        /*
        NubmerGenerator generator = new NubmerGenerator();
        List<Integer> numbers = generator.createRandomNumbers();
        System.out.println(numbers);


        Judgment judgment = new Judgment();

        final int count = judgment.correctCount(Arrays.asList(2,8,9), Arrays.asList(1,2,3)); //Arrays.asList를 이용해 List를 만듦
        System.out.println(count); // 3


        final boolean place = judgment.hasPlace(Arrays.asList(7,8,9), 0, 7);
        System.out.println(place); //true
        */
    }
}
