package task2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class Task2Test {

    @Test
    void ensureCalcWithoutMultiWorks() {
        //given
        int a = 4;
        int b = 6;
        int c = 4;
        Task2 task2 = new Task2();

        //when
        int result = task2.calcWithoutMulti(a, b, c);

        //then
        assertThat(result, is(96));
    }
}