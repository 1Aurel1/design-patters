import configuration.BasicConfiguration;
import configuration.CustomConfiguration;
import configuration.GamingConfiguration;
import configuration.ProductivityConfiguration;

public class DecoratorStart {

    public static void main(String[] args) {
        CustomConfiguration configuration = new ProductivityConfiguration(new GamingConfiguration(new BasicConfiguration()));
        configuration.assemble();
    }
}
