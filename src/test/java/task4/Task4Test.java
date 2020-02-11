import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    // init Task4 object for access method in all-tests
    private Task4 task4 = new Task4();

    @Test
    void createDoor() {
        // given
        Door testDoor = new Door(16, true);

        // when
        Door resultDoor = task4.createDoor(16);

        //then
        assertThat(testDoor, is(resultDoor));
    }

    @Test
    void create100DoorsOpen() {
        // given
        List<Door> testOpenDoors = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            testOpenDoors.add(task4.createDoor(i));
        }

        // when
        List<Door> resultOpenDoors = task4.create100DoorsOpen();

        //then
        assertThat(testOpenDoors, is(resultOpenDoors));
    }

    @Test
    void calcCloseHalfOf100Doors() {
        // given
        List<Door> resultOpenDoors = task4.create100DoorsOpen();
        List<Door> testClosedHalfOf100Doors = task4.create100DoorsOpen();

        for (Door door : testClosedHalfOf100Doors) {
            if (door.getDoorNr() % 2 == 0) {
                door.setOpen(false);
            }
        }

        // when
        task4.calcCloseHalfOf100Doors(resultOpenDoors);

        //then
        assertThat(testClosedHalfOf100Doors, is(resultOpenDoors));
    }

    @Test
    void calcDoorsOpenWhenClosedOrClosedWhenOpenedForStep3() {
        // given
        // testing for Step 3
        List<Door> resultOpenDoorsForStep3 = task4.create100DoorsOpen();
        task4.calcCloseHalfOf100Doors(resultOpenDoorsForStep3);

        List<Door> testOpenDoorsForStep3 = task4.create100DoorsOpen();
        task4.calcCloseHalfOf100Doors(testOpenDoorsForStep3);

        assertThat(testOpenDoorsForStep3, is(resultOpenDoorsForStep3));

        for (Door door : testOpenDoorsForStep3) {
            if (door.getDoorNr() % 3 == 0 && door.isOpen()) {
                door.setOpen(false);
            } else if (door.getDoorNr() % 3 == 0 && !door.isOpen()){
                door.setOpen(true);
            }
        }

        // when
        task4.calcDoorsOpenWhenClosedOrClosedWhenOpened(resultOpenDoorsForStep3, 3);

        //then
        assertThat(testOpenDoorsForStep3, is(resultOpenDoorsForStep3));
    }

    @Test
    void calcDoorsOpenWhenClosedOrClosedWhenOpenedForStep4() {
        // given
        // testing for Step 3
        List<Door> resultOpenDoorsForStep4 = task4.create100DoorsOpen();
        task4.calcCloseHalfOf100Doors(resultOpenDoorsForStep4);

        List<Door> testOpenDoorsForStep4 = task4.create100DoorsOpen();
        task4.calcCloseHalfOf100Doors(testOpenDoorsForStep4);

        assertThat(testOpenDoorsForStep4, is(resultOpenDoorsForStep4));

        for (Door door : testOpenDoorsForStep4) {
            if (door.getDoorNr() % 3 == 0 && door.isOpen()) {
                door.setOpen(false);
            } else if (door.getDoorNr() % 3 == 0 && !door.isOpen()){
                door.setOpen(true);
            }
        }

        for (Door door : testOpenDoorsForStep4) {
            if (door.getDoorNr() % 4 == 0 && door.isOpen()) {
                door.setOpen(false);
            } else if (door.getDoorNr() % 4 == 0 && !door.isOpen()){
                door.setOpen(true);
            }
        }

        // when
        task4.calcDoorsOpenWhenClosedOrClosedWhenOpened(resultOpenDoorsForStep4, 4);

        //then
        assertThat(testOpenDoorsForStep4, is(resultOpenDoorsForStep4));
    }
}