import configuration.*;
import org.junit.Assert;
import org.junit.Test;

public class CustomConfigurationTest {

    @Test
    public void shouldHaveProductivityConfig() {
        CustomConfiguration configuration = new ProductivityConfiguration(new BasicConfiguration());
        SysConfig config = configuration.assemble();

        Assert.assertTrue(config.getNotifications().equals(Level.LOW));
        Assert.assertTrue(config.getGraphics().equals(Level.MODERATE));
        Assert.assertTrue(config.getAudio().equals(Level.MODERATE));
    }

    @Test
    public void shouldHaveGamingConfig() {
        CustomConfiguration configuration = new GamingConfiguration(new BasicConfiguration());
        SysConfig config = configuration.assemble();

        Assert.assertTrue(config.getNotifications().equals(Level.MODERATE));
        Assert.assertTrue(config.getGraphics().equals(Level.MAX));
        Assert.assertTrue(config.getAudio().equals(Level.MAX));
    }

    @Test
    public void shouldHaveGamingAndProductivityConfig() {
        CustomConfiguration configuration = new GamingConfiguration(new ProductivityConfiguration(new BasicConfiguration()));
        SysConfig config = configuration.assemble();

        Assert.assertTrue(config.getNotifications().equals(Level.LOW));
        Assert.assertTrue(config.getGraphics().equals(Level.MAX));
        Assert.assertTrue(config.getAudio().equals(Level.MAX));
    }
}
