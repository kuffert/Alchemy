/**
 * Created by Chris on 7/12/2015.
 */
public class VesselAndBaseMixture {
    private String effectDescription;
    private String vesselType;
    private int doses;
    private int maxVolatility;
    private double intensity;
    private int volatility;

    VesselAndBaseMixture(final String vesselType, final int doses, final int maxVolatility, final double intensity, final int volatility) {
        this.effectDescription = "";
        this.vesselType = vesselType;
        this.doses = doses;
        this.maxVolatility = maxVolatility;
        this.intensity = intensity;
        this.volatility = volatility;
    }

    VesselAndBaseMixture(final Vessel vessel, final Base base) {
        this.effectDescription = "";
        this.vesselType = vessel.getVesselType();
        this.doses = vessel.getDoses();
        this.maxVolatility = vessel.getMaxVolatility();
        this.intensity = vessel.getIntensity() * base.getIntensity();
        this.volatility = base.getVolatility();
    }

    public final String getEffectDescription() { return effectDescription; }
    public final void setEffectDescription(final String effectDescription) { this.effectDescription = effectDescription; }

    public final String getVesselType() { return vesselType; }

    public final int getDoses() { return doses; }
    public final void setDoses(final int doses) { this.doses = doses; }

    public final double getIntensity() { return intensity; }
    public final void setIntensity(final double intensity) { this.intensity = intensity; }

    public final int getMaxVolatility() { return maxVolatility; }

    public final int getVolatility() { return volatility; }
    public final void setVolatility(final int volatility) { this.volatility = volatility; }
}
