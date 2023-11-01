
public class Main {
    public static void main(String[] args) {
        AirCondition ac = new AirCondition(25, 0);
        ac.turnAirOnOff();
        System.out.println(ac.toString());
        ac.increaseTemperature(); // targetTemperature 26
        ac.increaseTemperature(); // targetTemperature 27
        ac.changeFanSpeed(); // fanSpeed 1
        System.out.println(ac.toString());
        ac.changeFanSpeed(); // fanSpeed 2
        ac.changeFanSpeed(); // fanSpeed 0
        ac.decreaseTemperature(); // targetTemperature 26
        System.out.println(ac.toString());
    }
}