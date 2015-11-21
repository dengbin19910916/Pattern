package command.remote;

/**
 * @author dengb
 */
public class CeilingFanHighCommand implements Command {
    private CeilingFan ceilingFan;
    private CeilingFan.Speed prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        prevSpeed.execute(ceilingFan);
    }

    @Override
    public String toString() {
        return "CeilingFanHighCommand{" +
                "ceilingFan=" + ceilingFan +
                ", prevSpeed=" + prevSpeed +
                '}';
    }
}
