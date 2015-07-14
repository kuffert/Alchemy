package AlchemyComponents;

/**
 * Created by Chris on 7/10/2015.
 */
public class Base extends AlchemyComponent {
    private String baseType;
    private int volatility;
    private double intensity;

    private Base(final String baseType, final int volatility, final double intensity) {
        this.setName("Base");
        this.baseType = baseType;
        this.volatility = volatility;
        this.intensity = intensity;
    }

    public static Base createComponent(final String baseType, final int volatility, final double intensity) {
        return new Base(baseType, volatility, intensity);
    }

    public String getComponentName() {
        return baseType;
    }
    public String summarizeComponent() {
        return  "Volatility: " + volatility + "\n" +
                "Intensity: " + intensity;
    }

    public final double getIntensity() { return intensity; }
    public final int getVolatility() { return volatility; }
}
