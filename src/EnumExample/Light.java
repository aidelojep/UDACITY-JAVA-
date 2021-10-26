package EnumExample;

public class Light {
    public Light() {
    }

    public void changeLight(StopLight currentLight){
        if(currentLight==StopLight.GREEN)
            System.out.println("Green means Go!");
        else if(currentLight==StopLight.YELLOW)
            System.out.println("Wait!");
        else if(currentLight==StopLight.RED)
            System.out.println("Stop!");
        else
            System.out.println("You have not selected correctly!");
    }
}
