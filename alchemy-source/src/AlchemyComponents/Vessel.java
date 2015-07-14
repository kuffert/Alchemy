package AlchemyComponents;

/**
 * Created by Chris on 7/10/2015.
 */
public class Vessel extends AlchemyComponent {
    private String vesselType;
    private int doses;
    private int maxVolatility;
    private double intensity;

    private Vessel(final String vesselType, final int doses, final int maxVolatility, final double intensity) {
        this.setName("AlchemyComponents.Vessel");
        this.vesselType = vesselType;
        this.doses = doses;
        this.intensity = intensity;
        this.maxVolatility = maxVolatility;
    }

    public static Vessel createComponent(final String vesselType, final int doses, final int maxVolatility, final double intensity) {
        return new Vessel(vesselType, doses, maxVolatility, intensity);
    }

    public String getComponentName() {
        return vesselType;
    }

    public String summarizeComponent() {
        return "Max Volatility: " + maxVolatility + "\n" +
               "Dosage: " + doses + "\n" +
               "Intensity: " + intensity;
    }

    public final String getVesselType() { return vesselType; }

    public final int getDoses() { return doses; }

    public final double getIntensity() { return intensity; }

    public final int getMaxVolatility() { return maxVolatility; }

}
