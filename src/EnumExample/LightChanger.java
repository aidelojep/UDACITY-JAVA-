package EnumExample;

public class LightChanger {
    public static void main(String[] args) {
        System.out.println("Welcome to Lagos-Sabo-Yaba Zebra Crossing");
        Light light = new Light();
        light.changeLight(StopLight.GREEN);
        System.out.println();

        System.out.println("Kindly hold on for a while");
        light.changeLight(StopLight.YELLOW);
        System.out.println();

        System.out.println("PLease, kindly hold on for the Traffic Light to be Green!");
        light.changeLight(StopLight.RED);
    }
}
