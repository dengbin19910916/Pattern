package command.remote;

/**
 * @author dengb
 */
public class CeilingFanOffCommand implements Command {
    private CeilingFan ceilingFan;
    private CeilingFan.Speed prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        prevSpeed.execute(ceilingFan);
    }

    @Override
    public String toString() {
        return "CeilingFanOffCommand{" +
                "ceilingFan=" + ceilingFan +
                '}';
    }
}
