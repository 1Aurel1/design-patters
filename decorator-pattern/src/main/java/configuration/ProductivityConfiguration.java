package configuration;

import static configuration.Level.LOW;

public class ProductivityConfiguration extends ConfigurationDecorator {

    public ProductivityConfiguration(CustomConfiguration configuration) {
        super(configuration);
    }

    @Override
    public SysConfig assemble() {
        SysConfig config = super.assemble();
        return addProductivityConfiguration(config);
    }

    private SysConfig addProductivityConfiguration(SysConfig config){
        System.out.println("Adding productivity configuration");
        config.setNotifications(LOW);
        return config;
    }
}
