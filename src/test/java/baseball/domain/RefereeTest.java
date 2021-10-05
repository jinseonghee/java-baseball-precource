package baseball.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class RefereeTest {

    @Test
    void 스트라이크3() {
        Referee referee = new Referee();
        String result = referee.compare(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
        assertThat(result).isEqualTo("0 볼 3 스트라이크");
    }

    @Test
    void 아웃() {
        Referee referee = new Referee();
        String result = referee.compare(Arrays.asList(1, 2, 3), Arrays.asList(7, 8, 9));
        assertThat(result).isEqualTo("아웃");
    }

    @Test
    void 볼3() {
        Referee referee = new Referee();
        String result = referee.compare(Arrays.asList(1, 2, 3), Arrays.asList(2, 3, 1));
        assertThat(result).isEqualTo("3 볼 0 스트라이크");
    }
}