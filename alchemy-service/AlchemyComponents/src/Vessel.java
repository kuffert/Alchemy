/**
 * Created by Chris on 7/10/2015.
 */
public class Vessel extends AlchemyObject {
    private String vesselType;
    private int doses;
    private int maxVolatility;
    private double intensity;

    Vessel(String vesselType, int doses, int maxVolatility, double intensity) {
        this.setName("Vessel");
        this.vesselType = vesselType;
        this.doses = doses;
        this.intensity = intensity;
        this.maxVolatility = maxVolatility;
    }

    public final String getVesselType() { return vesselType; }
    public final void setVesselType(final String vesselType) { this.vesselType = vesselType; }

    public final int getDoses() { return doses; }
    public final void setDoses(final int doses) { this.doses = doses; }

    public final double getIntensity() { return intensity; }
    public final void setIntensity(final double intensity) { this.intensity = intensity; }

    public final int getMaxVolatility() { return maxVolatility; }
    public final void setMaxVolatility(final int maxVolatility) { this.maxVolatility = maxVolatility; }

}
