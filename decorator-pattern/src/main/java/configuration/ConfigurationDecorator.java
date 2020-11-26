package configuration;

public abstract class ConfigurationDecorator implements CustomConfiguration {
    protected CustomConfiguration configuration;

    public ConfigurationDecorator(CustomConfiguration configuration) {
        this.configuration = configuration;
    }

    public SysConfig assemble() {
        return configuration.assemble();
    }

    public void sentNotifications() {
        configuration.sentNotifications();
    }
}
