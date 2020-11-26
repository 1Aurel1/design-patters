package configuration;

public class BasicConfiguration implements CustomConfiguration {

    public SysConfig assemble() {
        System.out.println("Has basic configurations");
        return SysConfig.builder()
                .audio(Level.MODERATE)
                .graphics(Level.MODERATE)
                .notifications(Level.MODERATE)
                .build();
    }

    public void sentNotifications() {
        System.out.println("User is active");
    }
}
