package task3;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void calcNextMinBusTimeAfter30Min() {
        //given
        Task3 task3 = new Task3();
        Date date = new Date();
        date.setHours(19);
        date.setMinutes(50);

        //when
        int resultMin = task3.calcNextMinBusTime(date);

        //then
        assertThat(resultMin, is(10));
    }

    @Test
    void calcNextMinBusTimeBefore30Min() {
        //given
        Task3 task3 = new Task3();
        Date date = new Date();
        date.setHours(19);
        date.setMinutes(10);

        //when
        int resultMin = task3.calcNextMinBusTime(date);

        //then
        assertThat(resultMin, is(20));
    }
}