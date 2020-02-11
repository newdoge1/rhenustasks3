import java.util.Objects;

public class Door {

    private int doorNr;

    private boolean isOpen;


    // implement empty constructor
    public Door() {
    }


    // implement parameter constructor for creating fast doors objects, just need them for test
    public Door(int doorNr, boolean isOpen) {
        this.doorNr = doorNr;
        this.isOpen = isOpen;
    }

    public int getDoorNr() {
        return doorNr;
    }

    public void setDoorNr(int doorNr) {
        this.doorNr = doorNr;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    // have to override equals and hash methods to ensure equality of content (inhaltsgleichheit)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return doorNr == door.doorNr &&
                isOpen == door.isOpen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(doorNr, isOpen);
    }
}
