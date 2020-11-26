package configuration;

public class GamingConfiguration extends ConfigurationDecorator {
    public GamingConfiguration(CustomConfiguration configuration) {
        super(configuration);
    }

    @Override
    public SysConfig assemble() {
        SysConfig config = super.assemble();
        return addGamingConfiguration(config);
    }

    private SysConfig addGamingConfiguration(SysConfig config) {
        System.out.println("Adding gaming config");
        config.setGraphics(Level.MAX);
        config.setAudio(Level.MAX);
        return config;
    }

    @Override
    public void sentNotifications() {
        super.sentNotifications();
        System.out.println("User is in gaming mode");
    }
}
