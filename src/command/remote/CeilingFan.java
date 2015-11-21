package command.remote;

/**
 * 吊扇。
 *
 * @author dengb
 */
public class CeilingFan {

    private String location;
    private Speed speed;

    public enum Speed {
        OFF {
            @Override
            public void execute(CeilingFan ceilingFan) {
                ceilingFan.off();
            }
        },
        LOW {
            @Override
            public void execute(CeilingFan ceilingFan) {
                ceilingFan.low();
            }
        },
        MEDIUM {
            @Override
            public void execute(CeilingFan ceilingFan) {
                ceilingFan.medium();
            }
        },
        HIGH {
            @Override
            public void execute(CeilingFan ceilingFan) {
                ceilingFan.high();
            }
        };

        public abstract void execute(CeilingFan ceilingFan);
    }

    public CeilingFan(String location) {
        this.location = location;
        this.speed = Speed.OFF;
    }

    public void high() {
        // turns the ceiling fan on to high
        speed = Speed.HIGH;
        System.out.println(location + " ceiling fan is on high");

    }

    public void medium() {
        // turns the ceiling fan on to medium
        speed = Speed.MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void low() {
        // turns the ceiling fan on to low
        speed = Speed.LOW;
        System.out.println(location + " ceiling fan is on low");
    }

    public void off() {
        // turns the ceiling fan off
        speed = Speed.OFF;
        System.out.println(location + " ceiling fan is off");
    }

    public Speed getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "CeilingFan{" +
                "location='" + location + '\'' +
                ", speed=" + speed +
                '}';
    }
}
