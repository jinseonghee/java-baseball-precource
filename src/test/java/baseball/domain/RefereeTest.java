package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class RefereeTest {

    private static final List<Integer> ANSWER = Arrays.asList(1, 2, 3);
    private Referee referee;

    @BeforeEach
    void setUp() {
        referee = new Referee();
    }

    @Test
    void 스트라이크3() {
        String result = referee.compare(ANSWER, Arrays.asList(1, 2, 3));
        assertThat(result).isEqualTo("0 볼 3 스트라이크");
    }

    @Test
    void 아웃() {
        String result = referee.compare(ANSWER, Arrays.asList(7, 8, 9));
        assertThat(result).isEqualTo("아웃");
    }

    @Test
    void 볼3() {
        String result = referee.compare(ANSWER, Arrays.asList(2, 3, 1));
        assertThat(result).isEqualTo("3 볼 0 스트라이크");
    }
}