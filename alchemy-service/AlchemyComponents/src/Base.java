/**
 * Created by Chris on 7/10/2015.
 */
public class Base extends AlchemyObject {
    private String baseType;
    private int volatility;
    private double intensity;

    Base(final String baseType, final int volatility, final double intensity) {
        this.setName("Base");
        this.baseType = baseType;
        this.volatility = volatility;
        this.intensity = intensity;
    }

    public final String getBaseType() { return baseType; }
    public final void setBaseType(final String baseType) { this.baseType = baseType; }

    public final double getIntensity() { return intensity; }
    public final void setIntensity(final double intensity) { this.intensity = intensity; }

    public final int getVolatility() { return volatility; }
    public final void setVolatility(final int volatility) { this.volatility = volatility; }
}
