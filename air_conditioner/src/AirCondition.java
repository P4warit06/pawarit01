public class AirCondition {
    private final int MIN_TEMPERATURE = 20;
    private final int MAX_TEMPERATURE = 30;
    private final int MIN_FAN_SPEED = 0;
    private final int MAX_FAN_SPEED = 2;
    private boolean airOn;
    private boolean fanOn;
    private int targetTemperature;
    private int fanSpeed;

    public AirCondition(int targetTemperature, int fanSpeed) {
        if (targetTemperature > MAX_TEMPERATURE) {
            this.targetTemperature = MAX_TEMPERATURE;
        } else if (targetTemperature < MIN_TEMPERATURE) {
            this.targetTemperature = MIN_TEMPERATURE;
        } else {
            this.targetTemperature = targetTemperature;
        }

        if (fanSpeed > MAX_FAN_SPEED) {
            this.fanSpeed = MAX_FAN_SPEED;
        } else if (fanSpeed < MIN_FAN_SPEED) {
            this.fanSpeed = MIN_FAN_SPEED;
        } else {
            this.fanSpeed = fanSpeed;
        }
    }

    public boolean isAirOn() {
        return airOn;
    }

    public int getTargetTemperature() {
        return targetTemperature;
    }

    public void turnAirOnOff() {
        if (airOn) {
            airOn = false;
            fanOn = false;
        } else {
            airOn = true;
            fanOn = true;
        }
    }

    public void increaseTemperature() {
        targetTemperature++;
        if (targetTemperature > MAX_TEMPERATURE) {
            this.targetTemperature = MAX_TEMPERATURE;
        }
    }

    public void decreaseTemperature() {
        targetTemperature--;
        if (targetTemperature < MIN_TEMPERATURE) {
            this.targetTemperature = MIN_TEMPERATURE;
        } else {
            this.targetTemperature = targetTemperature;
        }
    }

    public void changeFanSpeed() {
        fanSpeed++;
        if (fanSpeed > MAX_FAN_SPEED) {
            this.fanSpeed = MIN_FAN_SPEED;
        } else {
            this.fanSpeed = fanSpeed;
        }
    }

    @Override
    public String toString() {
        if (!airOn) {
            return "Air Conditioner {Status: " + isAirOn() + "}";
        }
        if (airOn) {
            return "Air Conditioner {Status: " + isAirOn() + ", Temp: " + getTargetTemperature() + ", Fan: " + fanSpeed + "}";
        }
        return null;
    }

}

