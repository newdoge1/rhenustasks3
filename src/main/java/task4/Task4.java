import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {
        Task4 task4 = new Task4();

        // step 1: init 100 open doors
        List<Door> doors = task4.create100DoorsOpen();
        //System.out.println("Initialize Doors");
        //task4.visualOutput(doors);

        // step 2: close half of 100 doors
        task4.calcCloseHalfOf100Doors(doors);
        //System.out.println("Step 2");
        //task4.visualOutput(doors);

        // step 3-100: calculation of open/closed based by behavior of doors
        task4.calcDoorsOpenWhenClosedOrClosedWhenOpened(doors, 100);
        System.out.println("Step 100");
        task4.visualOutput(doors);
    }

    private void visualOutput(List<Door> doors) {
        for (Door door : doors) {
            System.out.println("Nr: " + door.getDoorNr() + " " + door.isOpen());
        }
    }

    // door creator
    protected Door createDoor(int doorNr){
        Door door = new Door();
        door.setDoorNr(doorNr);
        door.setOpen(true);

        return door;
    }

    // list of 100 open doors
    protected List<Door> create100DoorsOpen() {
        List<Door> doors = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            doors.add(createDoor(i));
        }

        return doors;
    }

    protected void calcCloseHalfOf100Doors(List<Door> doors) {
        doors.stream().filter(door -> door.getDoorNr() % 2 == 0).forEach(door -> door.setOpen(false));
    }

    // has to start at 3 bc of task
    protected void calcDoorsOpenWhenClosedOrClosedWhenOpened(List<Door> doors, int range) {
        for (int i = 3; i <= range ; i++) {
            for (Door door : doors) {
                if (door.getDoorNr() % i == 0 && door.isOpen()) {
                    door.setOpen(false);
                } else if (door.getDoorNr() % i == 0 && !door.isOpen()) {
                    door.setOpen(true);
                }
            }
        }
    }
}
